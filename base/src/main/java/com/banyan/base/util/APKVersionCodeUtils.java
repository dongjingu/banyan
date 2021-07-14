package com.banyan.base.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public class APKVersionCodeUtils {


    public static String getDivece(Context context){
//        android.telephony.TelephonyManager tm = (android.telephony.TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            String deviceId = tm.getVisualVoicemailPackageName();
//        }
        return Build.DEVICE;

    }
    /**
     * 获取当前本地apk的版本
     *
     * @param mContext
     * @return
     */
    public static int getVersionCode(Context mContext) {
        int versionCode = 0;
        try {
            //获取软件版本号，对应AndroidManifest.xml下android:versionCode
            versionCode = mContext.getPackageManager().
                    getPackageInfo(mContext.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionCode;
    }

    /**
     * 获取版本号名称
     *
     * @param context 上下文
     * @return
     */
    public static String getVerName(Context context) {
        String verName = "";
        try {
            verName = context.getPackageManager().
                    getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return verName;
    }
}
