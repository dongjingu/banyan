package com.banyan.base.httpUtil;

import android.content.Intent;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.banyan.base.httpUtil.iBaseView.IRequestResult;
import com.banyan.base.parent.BaseApplication;
import com.banyan.base.util.ToastUtils;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import org.json.JSONException;

import java.util.Map;

/**
 * 请求网络的基类
 */
public class BaseRequest{
    public static final int INIT_DATA=0x10000; //初始化数据
    public static final int REFRASH_DATA=0x10001; //刷新git branch --set-upstream-to origin
    public static final int LOAD_MORE_DATA=0x10002; //加载更多
    public static final int UPDATA_DATA=0x10003; //更新数据
    //接口
    public static String BASE_URL;
    public void setBASE_URL(String BASE_URL) {
        this.BASE_URL = BASE_URL;
    }
    public static String getBASE_URL() {
        if (BASE_URL==null){
            Common common=new Common();
            return common.getRequstUrl();
        }
        return BASE_URL;
    }
    public static void request(String url , Map<String,String> params,int type, IRequestResult result){
        params.put("clientPublicParam", ClientPublicParamUtil.getPublicParams(BaseApplication.instance));
        OkGo.<String>post(getBASE_URL()+url).params(params).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {//Driver司机，VehicleOwner车主
                result.success(response.body(),type);
            }
            @Override
            public void onError(Response<String> response) {
                ToastUtils.show(BaseApplication.instance, "操作失败");
            }
        });
    }
}
