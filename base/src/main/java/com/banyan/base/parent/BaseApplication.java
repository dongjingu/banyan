package com.banyan.base.parent;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.banyan.base.util.ActivityManager;
import com.banyan.base.util.SystemUtil;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.cookie.CookieJarImpl;
import com.lzy.okgo.cookie.store.SPCookieStore;
import com.lzy.okgo.https.HttpsUtils;
import com.lzy.okgo.interceptor.HttpLoggingInterceptor;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.model.HttpParams;
import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.qq.e.comm.managers.GDTADManager;
import com.tencent.bugly.Bugly;
import com.tencent.mmkv.MMKV;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import okhttp3.OkHttpClient;

public class BaseApplication extends Application {
    public ActivityManager activityManager;
    public static BaseApplication instance;
    private String currentExamRecordId;
    //    private CrashHandler crashHandler;
    public static String ImagePath;
    public static String VideoPath;
    public static String PREFS_NAME = "prefsname"; // 偏好设置名称
    public static SharedPreferences mSettings;
    public static SharedPreferences.Editor editor;
    @SuppressLint("CommitPrefEdits")
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
//        优量汇的初始化，腾讯的广告
        GDTADManager.getInstance().initWith(this, "1111710361");
//        refWatcher =LeakCanary.install(this);
//        设置优量汇的产品渠道
//        GlobalSetting.setChannel(10);
        //穿山甲SDK初始化
        //强烈建议在应用对应的Application#onCreate()方法中调用，避免出现content为null的异常
//        TTAdManagerHolder.init(this);
        mSettings = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        editor = mSettings.edit();
        activityManager = ActivityManager.getInstance();
        Fresco.initialize(this);
        //JPush SDK 提供的 API 接口，都主要集中在 cn.jpush.android.api.JPushInterface 类里。
//        JPushInterface.setDebugMode(true);
//        JPushInterface.init(this);
//        String rootDir = MMKV.initialize(this);
//        //穿山甲SDK初始化
//        //强烈建议在应用对应的Application#onCreate()方法中调用，避免出现content为null的异常
//        TTAdManagerHolder.init(this);
        initImageLoader();
        initOkHttpClient();

//        腾讯初始化日志
//        CrashReport.UserStrategy userStrategy = new CrashReport.UserStrategy(this);
//        CrashReport.initCrashReport(this,"5e1badabca",true,userStrategy);
        Bugly.init(getApplicationContext(), "0bfbf6f50a", false);

        /**
         * 注意: 即使您已经在AndroidManifest.xml中配置过appkey和channel值，也需要在App代码中调
         *          * 用初始化接口（如需要使用AndroidManifest.xml中配置好的appkey和channel值，
         *          * UMConfigure.init调用中appkey和channel参数请置为null）。
         */
//        UMConfigure.init(this, Constant_Third_ID.umeng_appKey, "Umeng",
//                UMConfigure.DEVICE_TYPE_PHONE,
//                Constant_Third_ID.umeng_appSecret);// 选用AUTO页面采集模式
//        MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.AUTO);
////        MobclickAgent.onResume(this);
////        MobclickAgent.setCatchUncaughtExceptions(true);
//        // 打开统计SDK调试模式
//        UMConfigure.setLogEnabled(true);
//        PlatformConfig.setWeixin(Constant_Third_ID.weixin_app_id, Constant_Third_ID.weixin_app_secret);
        Logger.addLogAdapter(new AndroidLogAdapter() {
            @Override
            public boolean isLoggable(int priority, String tag) {
                return true;
            }

            @Override
            public void log(int priority, @Nullable String tag, @NonNull String message) {
                super.log(priority, tag, message);

            }
        });


//        new Thread(){
//            @Override
//            public void run() {
//                File imageFile =  copyResurces( "jiguang_test_img.png", "test_img.png", 0);
//                File videoFile = copyResurces( "jiguang_test.mp4", "jiguang_test.mp4", 0);
//                if(imageFile != null){
//                    ImagePath = imageFile.getAbsolutePath();
//                }
//
//                if(videoFile != null){
//                    VideoPath = videoFile.getAbsolutePath();
//                }
//
//                super.run();
//            }
//        }.start();

    }
    /**
     * 判断是否安装了应用
     * @return true 为已经安装
     */
    private boolean hasApplication(){
        PackageManager manager = instance.getPackageManager();
        Intent action = new Intent(Intent.ACTION_VIEW);
        action.setData(Uri.parse("http://"));
        List list = manager.queryIntentActivities(action, PackageManager.GET_RESOLVED_FILTER);
        return list != null && list.size() > 0;
    }
    private File copyResurces(String src, String dest, int flag){
        File filesDir = null;
        try {
            if(flag == 0) {//copy to sdcard
                filesDir = new File(Environment.getExternalStorageDirectory().getAbsoluteFile() + "/jiguang/" + dest);
                File parentDir = filesDir.getParentFile();
                if(!parentDir.exists()){
                    parentDir.mkdirs();
                }
            }else{//copy to data
                filesDir = new File(getFilesDir(), dest);
            }
            if(!filesDir.exists()) {
                filesDir.createNewFile();
                InputStream open = getAssets().open(src);
                FileOutputStream fileOutputStream = new FileOutputStream(filesDir);
                byte[] buffer = new byte[4 * 1024];
                int len = 0;
                while ((len = open.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, len);
                }
                open.close();
                fileOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            if(flag == 0){
                filesDir = copyResurces( src,  dest, 1);
            }
        }
        return filesDir;
    }
    public String getCurrentExamRecordId() {
        return currentExamRecordId;
    }

    public void setCurrentExamRecordId(String currentExamRecordId) {
        this.currentExamRecordId = currentExamRecordId;
    }


    private void initImageLoader(){
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(this)
                .threadPoolSize(3)// 线程池内加载的数量
                .threadPriority(Thread.NORM_PRIORITY - 2) // 降低线程的优先级保证主UI线程不受太大影响
                .denyCacheImageMultipleSizesInMemory().threadPoolSize(4)// 线程池内加载的数量
                .memoryCache(new LruMemoryCache(10 * 1024 * 1024))// 建议内存设在5-10M,可以有比较好的表现
                .build();
        ImageLoader.getInstance().init(configuration);
    }

    private void initOkHttpClient(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor("OkGo");
        //log打印级别，决定了log显示的详细程度
        loggingInterceptor.setPrintLevel(HttpLoggingInterceptor.Level.BODY);
        //log颜色级别，决定了log在控制台显示的颜色
        loggingInterceptor.setColorLevel(Level.INFO);

        builder.addInterceptor(loggingInterceptor);
//全局的读取超时时间
        builder.readTimeout(OkGo.DEFAULT_MILLISECONDS, TimeUnit.MILLISECONDS);
//全局的写入超时时间
        builder.writeTimeout(OkGo.DEFAULT_MILLISECONDS, TimeUnit.MILLISECONDS);
//全局的连接超时时间
        builder.connectTimeout(OkGo.DEFAULT_MILLISECONDS, TimeUnit.MILLISECONDS);

        //使用sp保持cookie，如果cookie不过期，则一直有效
        builder.cookieJar(new CookieJarImpl(new SPCookieStore(this)));
//使用数据库保持cookie，如果cookie不过期，则一直有效
        //builder.cookieJar(new CookieJarImpl(new DBCookieStore(this)));
//使用内存保持cookie，app退出后，cookie消失
        //builder.cookieJar(new CookieJarImpl(new MemoryCookieStore()));

        //方法一：信任所有证书,不安全有风险
        HttpsUtils.SSLParams sslParams1 = HttpsUtils.getSslSocketFactory();
        //方法二：自定义信任规则，校验服务端证书
        //HttpsUtils.SSLParams sslParams2 = HttpsUtils.getSslSocketFactory(new SafeTrustManager());
        //方法三：使用预埋证书，校验服务端证书（自签名证书）
        //HttpsUtils.SSLParams sslParams3 = HttpsUtils.getSslSocketFactory(getAssets().open("srca.cer"));
        //方法四：使用bks证书和密码管理客户端证书（双向认证），使用预埋证书，校验服务端证书（自签名证书）
        // HttpsUtils.SSLParams sslParams4 = HttpsUtils.getSslSocketFactory(getAssets().open("xxx.bks"), "123456", getAssets().open("yyy.cer"));
        // builder.sslSocketFactory(sslParams1.sSLSocketFactory, sslParams1.trustManager);
        //配置https的域名匹配规则，详细看demo的初始化介绍，不需要就不要加入，使用不当会导致https握手失败
        ///builder.hostnameVerifier(new SafeHostnameVerifier());

        //---------这里给出的是示例代码,告诉你可以这么传,实际使用的时候,根据需要传,不需要就不传-------------//
        HttpHeaders headers = new HttpHeaders();
       /* headers.put("commonHeaderKey1", "commonHeaderValue1");    //header不支持中文，不允许有特殊字符
        headers.put("commonHeaderKey2", "commonHeaderValue2");*/
        HttpParams params = new HttpParams();
        /*params.put("commonParamsKey1", "commonParamsValue1");     //param支持中文,直接传,不要自己编码
        params.put("commonParamsKey2", "这里支持中文参数");*/
//-------------------------------------------------------------------------------------//

        OkGo.getInstance().init(this)                           //必须调用初始化
                .setOkHttpClient(builder.build())               //建议设置OkHttpClient，不设置将使用默认的
                .setCacheMode(CacheMode.NO_CACHE)               //全局统一缓存模式，默认不使用缓存，可以不传
                .setCacheTime(CacheEntity.CACHE_NEVER_EXPIRE)   //全局统一缓存时间，默认永不过期，可以不传
                .setRetryCount(3)                               //全局统一超时重连次数，默认为三次，那么最差的情况会请求4次(一次原始请求，三次重连请求)，不需要可以设置为0
                .addCommonHeaders(headers)                      //全局公共头
                .addCommonParams(params);                       //全局公共参数
    }

    private boolean inMainProcess() {
        String packageName = getPackageName();
        String processName = SystemUtil.getProcessName(this);
        return packageName.equals(processName);
    }

    private String ensureLogDirectory() {
        File log = getExternalFilesDir("nim");
        if (log == null) {
            log = getDir("nim", Context.MODE_PRIVATE);
        }
        return log.getAbsolutePath();
    }

}
