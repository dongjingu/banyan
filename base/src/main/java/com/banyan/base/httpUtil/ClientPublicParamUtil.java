package com.banyan.base.httpUtil;

import android.content.Context;


import com.banyan.base.parent.BaseApplication;
import com.banyan.base.util.APKVersionCodeUtils;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class ClientPublicParamUtil {
    public static String getPublicParams(Context context){
        String userId = BaseApplication.mSettings.getString(HYContent.UserId, "");
        String virtualDeviceNumber = BaseApplication.mSettings.getString(HYContent.VirtualDeviceNumber, "");
        Map<String,String> map=new HashMap<>();
        map.put("clientType","Android");
        map.put("equipmentNumber", APKVersionCodeUtils.getDivece(context));
        map.put("virtualDeviceNumber",virtualDeviceNumber);
        map.put("versionName","容运宝Android"+APKVersionCodeUtils.getVerName(context));
        map.put("version",APKVersionCodeUtils.getVerName(context)+"");
        map.put("userId",userId);
        JSONObject jo=new JSONObject(map);
        return jo.toString();
    }
}
