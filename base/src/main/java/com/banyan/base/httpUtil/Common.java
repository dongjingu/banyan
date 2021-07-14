package com.banyan.base.httpUtil;


import com.banyan.base.parent.BaseApplication;
import com.banyan.base.util.StringUtils;

public class Common {

    public static String BASE_URL=
            "http://111.11.29.116:8901/ryb_test";//服务器服务，稳定24小时可以访问）
    //    "http://39.105.171.217:9519/jkws";
//    "https://www.rongskj.com/ryb";//线上服务器地址，上线地址
//    "https://rongskj.cn1.utools.club";//本地服务，调试bug方便，工作时间
//    public static String BASE_URL1="http://39.105.171.217:8600";
    private String REQUST_URL="";
    public String REQUST_URL1="https://www.rongskj.com/ryb";
    public String REQUST_URL2="http://111.11.29.116:8901/ryb_test";
    public String REQUST_URL3="https://rongskj.cn1.utools.club";
    //默认地址在这里设置，01默认是正式地址，1是测试地址，2是本地地址
    public int getType() {
        return BaseApplication.mSettings.getInt(HYContent.REQUST_TYPE,0);
    }
    public Common() {
        String url= BaseApplication.mSettings.getString(HYContent.REQUST_URL,"空");
        int type= getType();
        if (!url.equals("空")&&!StringUtils.isEmpty(url)){
            setRequstUrl(url);//有url
        }else{
            if (type==1){
                setRequstUrl(REQUST_URL2);
            }else if (type==2){
                setRequstUrl(REQUST_URL3);
            }else{
                setRequstUrl(REQUST_URL1);
            }

        }
    }
    public String getRequstUrl() {
         return REQUST_URL;
    }
    private void setRequstUrl(String requstUrl) {
        REQUST_URL = requstUrl;
    }
}
