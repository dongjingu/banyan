package com.banyan.base.httpUtil;


import com.banyan.base.parent.BaseApplication;
import com.banyan.base.util.bean.HuoYunBean;
import com.banyan.base.util.bean.HuoYunWXBean;

public class HYContent {
    public static final String PASSWOR = "huoyuanPassword";
    public static final String LOGIN_NAME = "LOGIN_NAME";
    public static final boolean ISDEBUG = true;
    public static final String IS_LOGIN = "isloginac";
    public static final String USET_TYPE = "usettype";//VehicleOwner车主，空为未选择，其他是司机
    public static final int RESULT_CODE = 100;
    public static final int REQUSET_CODE = 101;
    public static final String ER_WEI_MA_URL = "https://yrlm.rongskj.com/phone/bindingRelationship.do";
    public static final String DRIVER_STATE = "0";
    public static final String CAR_USER_STATE = "1";
    public static final CharSequence XUQIU_FANG = "2";
    public static final String HISTORY_MSG = "historyList";
    public static final String IS_SHOW = "is_show_chuanshanjia";//穿山甲广告是否打开
    public static final String ADDRESS = "address";
    public static final String CITY = "city";
    public static final String WCHAT_LOGIN_STATE = "wchar_login_state";//登陆的activity过来的。其他的是fragment中过来的，
    public static final String USET_OLD_TYPE = "user_old_type";
    public static final String IS_XIEYI_FIRST = "isxieyifirst";
    public static final String CHUAN_SHANJIA = "csj_dy";
    public static final String REQUST_TYPE = "requst_type";
    public static final String REQUST_URL = "requst_url";
    private static final String ISWX = "iswx";
    private static final String RONGSHU_TOKEN = "rongYunToken";
    public static final String TEST_EMPLOYEE = "testEmployee";//s是否是内部员工
    public static String AvatarUrl="AvatarUrl";
    public static String BankCardNo="BankCardNo";
    public static String BankCardOpeningBank="BankCardOpeningBank";
    public static String City="City";
    public static String CommunityId="CommunityId";
    public static String CommunityName="CommunityName";
    public static String CompanyName="CompanyName";
    public static String Country="Country";
    public static String EmployeeId="EmployeeId";
    public static String EmployeeRealname="EmployeeRealname";
    public static String Gender="Gender";
    public static String Gswlzzfyq="Gswlzzfyq";
    public static String IsPhone="IsPhone";
    public static String Language ="Language";
    public static String NickName="NickName";
    public static String Password="Password";
    public static String PersonalQRCode="PersonalQRCode";
    public static String Province="Province";
    public static String ShareUserAppShareImg="ShareUserAppShareImg";
    public static String UserId="UserId";
    public static String Wlzzfyq="Wlzzfyq";
    public static String WxuserId="WxuserId";
    public static String WxuserQrCode="WxuserQrCode";
    public static String ZfbuserId="ZfbuserId";
    public static String ISFirst="is_first_in";
    public static String HEAD_IS_SHOW_BANNER="headIsShowBanner";
    public static String CAR_IS_SHOW_BANNER="carIsShowBanner";
    public static String CAR_ACTIVITY_IS_SHOW_BANNER="carActivityIsShowBanner";
    public static String DIRVER_IS_SHOW_BANNER="dirverIsShowBanner";
    public static String DIRVER_ACTIVITY_IS_SHOW_BANNER="dirveractivityIsShowBanner";
    public static String DETAIL_IS_SHOW_BANNER="detailIsShowBanner";
    public static String DIRVER_DIALOG_IS_SHOW_BANNER="dirver_dialogIsShowBanner";
    public static String CAR_MY_IS_SHOW_BANNER="carMyIsShowBanner";
    public static String CAR_DIALOG_IS_SHOW_BANNER="carDIalogIsShowBanner";
    public static String DIRVER_MY_IS_SHOW_BANNER="dirverMyIsShowBanner";
    public static String UserIdentityList="UserIdentityList";


    //    "http://111.11.29.116:8901/ryb_test";//服务器服务，稳定24小时可以访问）
//    "http://39.105.171.217:9519/jkws";
//    "https://www.rongskj.com/ryb";//线上服务器地址，上线地址
//    "https://rongskj.cn1.utools.club";//本地服务，调试bug方便，工作时间
//    public static String getBASE_URL()1="http://39.105.171.217:8600";
    //登录
    public String LOGIN_URL="/phone/logon/logon.do";
    //app初始化接口【启动App时调用的接口（开屏广告；广告再那些渠道显示、那些渠道不显示；App是否需要更新）】：
    public String APP_INIT_URL="/phone/appInit.do";//phone/appInit.do
    //微信登录
    public String WX_LOGIN_URL="/phone/appWxLogon/appWxLogon.do";
    //注销用户身份
    public String UNREGIST_USER="/phone/logout/logoutUserIdentity.do";
    //绑定车主和司机关系
    public String BIND_DRIVER="/phone/vehicleOwnerAndDriver/bindingVehicleOwnerAndDriver.do";
    //强制解除车主和司机关系
    public String STROG_UNBIND_DRIVER="/phone/vehicleOwnerAndDriver/bindingVehicleOwnerAndDriver.do";
    //开通司机身份
    public String OPEN_DRIVER_USER="/phone/userOpenIdentity/openDriverIdentity.do";
    //开通车主身份
    public String OPEN_CAR_USER="/phone/userOpenIdentity/openOwnerIdentity.do";
    //开通需求方身份
    public String OPEN_XUQIU_USER="/phone/userOpenIdentity/openPurchaserIdentity.do";
    //解绑通过司机id，解绑司机与对应车辆间的绑定关系：
    public String UNBIND_DRIVER_CAR="/phone/vehicleAndDriver/unboundVehicleByDriverId.do";
    //解绑车主与司机之间的关系：
    public String UNBIND_DRIVER_CAR_MAIN="/phone/vehicleOwnerAndDriver/unbound.do";
    //解绑通过司机id，解绑司机与对应车辆间的绑定关系
    public String UNBING_VEHICLE="/phone/vehicleAndDriver/unboundVehicleByDriverId.do";
    //车型车长整车半车
    public final String CAR_TYPE_URL = "/phone/transportationSupplyAndDemandMsg/vehicleUseModeLengthTypeData.do";
    //采购单【存入草稿箱】：
    public final String SAVE_CAO_GAO_URL = "/phone/transportationSupplyAndDemandMsg/addDraftsTransportationSupplyAndDemandMsg.do";
    //发布采购单【发布】：
    public final String FA_BU_URL =        "/phone/transportationSupplyAndDemandMsg/addTransportationSupplyAndDemandMsg.do";
    //用户注销自己旧身份选择自己新身份：
    public final String REGIST_OLD_GIST_NEW =        "/phone/logout/logoutUserOldIdentitySelectNewIdentity.do";
    //发布采购单【发布】：
    public final String EDIT_CAO_GAO_URL = "/phone/transportationSupplyAndDemandMsg/edit.do";
    //修改采购单UI【草稿箱】：
    public final String EDIT_CAOGAO =        "/phone/transportationSupplyAndDemandMsg/editUI.do";
    //修改采购单【草稿箱】：
    public final String FA_BU_CAOGAO =        "/phone/transportationSupplyAndDemandMsg/edit.do";
    //几装几卸数据集合：
    public final String ZHUANG_XIE_LIST_URL = "/phone/howToLoadAndUnload/howToLoadAndUnloadData.do";
    //提交车辆信息
    public final String SUBMIT_CAR_URL = "/phone/vehicleInformation/vehicleOwnerAddVehicleInformation.do";

    //修改车辆信息
    public final String EDIT_CAR_URL = "/phone/vehicleInformation/vehicleOwnerUpdateVehicleInformation.do";
    //获取需要修改的信息
    public final String GET_DEFUALT_CAR_URL = "/phone/vehicleInformation/vehicleOwnerUpdateUIVehicleInformation.do";
    //创建运输单UI页面所需数据
    public final String INIT_ORDER_URL = "/phone/transportBill/transportBillCreateUI.do";
    //运输账单车主的顶部页面
    public final String USER_TOP_URL = "/phone/transportBill/transportBillPhonePage.do";
    //运输单报销记录手机端展示页面
    public final String INIT_FEIYING_URL = "/phone/reimbursementRecord/reimbursementRecordPhonePage.do";
    //运输单报销记录：
    public final String SEE_FEIYING_URL = "/phone/reimbursementRecord/list.do";
    //视频列表：
    public final String VIDEO_LIST_URL = "/phone/video/video/list.do";
    //视频分类列表：
    public final String VIDEO_CATEGORY_LIST_URL = "/phone/video/videoCategory/list.do";
    //用户看视频享收益页面：
    public final String JILI_VIDEO_INFO_URL = "/phone/codeBit/seeAdvertisementEnjoyProfitPage.do";
    //激励视频广告用户赚钱列表：
    public final String JILI_VIDEO_LIST_URL = "/phone/codeBit/motivationalVideoAdvertisementUserObtainMoneyList.do";
    //更新用户广告收益记录用户行为（用户看完激励视频后调用，用于更新用户所看激励广告视频与用户自身相关的数据）：
    public final String JILI_VIDEO_SUCCESS_URL = "/phone/userActiveSeeAdvertisement/updateUserAdvertisementProfitRecordUserBehavior.do";
    //更新用户对广告的点击行为：
    public final String JILI_VIDEO_CLICK_URL = "/phone/userActiveSeeAdvertisement/updateUserClickBehavior.do";
    //1.用户点击激励视频时调用，将返回值motivationalVideoAdvertisementId（收益记录id）放入对应广告平台的扩展字段中，用于广告平台回调接口处理业务逻辑；2.播放激励视频广告：
    public final String JILI_OPEN_URL = "/phone/userActiveSeeAdvertisement/obtainMoney.do";
    ///运输单报销记录删除
    public final String DELETE_FEIYING_URL = "/phone/reimbursementRecord/delete.do";
    //运输账单详情（更新页面数据提供或运输单数据详情查看）：
    public final String ORDER_DETAIL_URL = "/phone/transportBill/transportBillDetails.do";
    ///报销类目集合
    public final String FEIYING_LIST_URL = "/phone/reimbursementCategory/list.do";
    ///添加费用图片
    public final String ADD_FILE_URL = "/upload/file/save.do";
    ///添加费用图片
    public final String ADD_HEAD_FILE_URL = "/phone/user/updateUserHeadPortrait.do";
    ///银行卡http://39.105.171.217:8600/bankcard/userbankcard/listAll
    public final String BANK_CARD_URL = "http://39.105.171.217:8600/bankcard/userbankcard/listAll";
    ///修改报销类目

    public final String UPDATA_FEIYING_URL = "/phone/reimbursementRecord/update.do";
    ///添加报销类目
    public final String ADD_FEIYING_URL = "/phone/reimbursementRecord/save.do";
    //司机换班
    public final String CHANGED_DRIVER = "/phone/drivingRecord/driverShiftChange.do";
    //强行绑定车主与司机之间的关系：
    public final String UNBIND_CAR_DRIVER = "/phone/vehicleOwnerAndDriver/forceBindingVehicleOwnerAndDriver.do";
    //司机信息
    public String DRIVER_INFO="/phone/driver/driverMsg.do";
    //车主下属司机信息列表
    public String SEE_DRIVER_INFO="/phone/vehicleOwnerAndDriver/list.do";
    //添加运输账单页面选择可以安排出车的司机信息列表：
    public String SEE_ORDER_DRIVER_INFO="/phone/vehicleOwnerAndDriver/transportDriverList.do";
    //车主创建司机并绑定与新建司机的关系：
    public String DIALOG_ADD_DRIVER="/phone/vehicleOwnerAndDriver/vehicleOwnerCreateDriver.do";
    //查看司机列表：/vehicleOwnerAndDriver/list.do
    public String CAR_DRIVER_URL=SEE_DRIVER_INFO;
    //删除司机
    public String DELETE_DRIVER_INFO="/phone/vehicleOwnerAndDriver/delete.do";
    //车主信息
    public String CAR_INFO="/phone/vehicleOwner/vehicleOwnerMsg.do";
    //实名认证
    public String SHI_MING_URL="/phone/realNameAuthentication/realNameAuthenticationMsgSave.do";
    //采购方信息
    public String CaiGouFang_INFO="/phone/purchaser/purchaserMsg.do";
    //意见反馈
    public String YIJIAN_URL="/phone/feedback/userSubmitFeedback.do";
    //修改车主细信息
    public String EDIT_CAR_USER_INFO="/phone/user/updateUserNickOrSingOrSex.do";
    //修改车主细信息
    public String EDIT_XUQIU_USER_INFO="/phone/purchaser/edit.do";
    //运输账单列表【司机】：
    public final String DRAWER_ORDER_LIST ="/phone/transportBillDriver/list.do" ;
    //采购单信息列表：
    public final String CAIGOU_ORDER_LIST ="/phone/transportationSupplyAndDemandMsg/list.do" ;
    //市场大厅：
    public final String SHI_CHANG_DA_TING ="/phone/marketHall/list.do" ;
    //首页：
    public final String MAIN_MEUN_URL ="/phone/menu/index.do" ;
    //获取推送列表信息：
    public final String GET_MESSAGE_URL ="/phone/push/list.do" ;
    //采购单详情：
    public final String CG_ORDER_DETAIL_LIST ="/phone/transportationSupplyAndDemandMsg/details.do" ;
    //采购单发布：
    public final String CG_FABU_LIST ="/phone/transportationSupplyAndDemandMsg/publishedTsadm.do" ;
    //终止采购单：
    public final String STOP_CAIGOUDAN ="/phone/transportationSupplyAndDemandMsg/terminationTsadm.do" ;
    //是否看广告：
    public final String CAN_SEE_AD ="/phone/advertising/advertisingDisCon.do" ;
    //版本升级接口：
    public final String PHONE_UP_VERSION ="/phone/version/versionUpgrade.do" ;
    //完成采购单：
    public final String OVER_ORDER ="/phone/transportationSupplyAndDemandMsg/completedTsadm.do" ;
    //运输账单列表【车主】：
    public final String CAR_USER_ORDER_LIST ="/phone/transportBill/list.do";
    //h获取车辆列表
    public final String GET_CAR_LIST ="/phone/vehicleInformation/vehicleOwnerVehicleInformationList.do" ;
    //银行卡完善
    public final String ADD_BANK_CARD = "/phone/userBankCardManager/edit.do";
    //绑定银行卡
    public final String BIND_BANK_CARD = "/bankcard/userbankcard/save.do";
    //修改银行卡
    public final String EDIT_BANK_CARD = "/bankcard/userbankcard/update.do";
    //获取车主银行卡信息接口
    public final String GET_USER_BANK_CARD ="/bankcard/userbankcard/listAll.do" ;
    //获取车主银行卡信息接口
    public final String DELETE_BANK_CARD ="/bankcard/userbankcard/delete.do" ;
    //获取银行
    public final String GET_BANK_INFO ="/bankcard/bank/listAll.do" ;
    //统计
    public final String TONG_JI_URL ="/phone/transport/statisticalAnalysis/list.do" ;
    //统计NEW
    public final String TONG_JI_NEW_URL ="/phone/transport/statisticalAnalysis/statisticalMonthData.do" ;
    //添加运输账单页面选中车辆：
    public final String GET_DEIVER_CAR_LIST ="/phone/vehicleInformation/transportVehicleList.do" ;
    //创建运输单列表
    public final String CREATE_ORDER_URL ="/phone/transportBill/transportBillCreate.do" ;
    //保存运输单列表 修改
    public final String SAVE_ORDER_URL ="/phone/transportBill/transportBillUpdate.do" ;
    //运输单完成：
    public final String OVER_ORDER_URL ="/phone/transportBill/transportBillCompleted.do" ;
    //删除车辆
    public final String DELETE_CAR="/phone/vehicleInformation/vehicleOwnerDeleteVehicleInformation.do" ;
    //删除采购单
    public final String DELETE_CAIGOUDAN="/phone/transportationSupplyAndDemandMsg/delete.do" ;
//    获取验证码登录
    public String GET_CODE_URL="/phone/user/sendValidateCode.do";
//    获取验证码忘记密码
    public String GET_FORGET_CODE_URL="/phone/user/sendValidateCodeUpdatePassword.do";
//   货物搜索页面数据信息：
    public String HOT_SEARCH_URL="/phone/cargo/cargoSearchPageDataUI.do";
//   获取对应运输货物的包装方式：
    public String BAO_ZHUANG_URL="/phone/transportCargoPackingMethod/findTransportCargoPackingMethod.do";
//   查询货物类目集合和第一个类目的货物数据：
    public String GOODS_CLASS_URL="/phone/cargoCategory/findCargoCategoryAndOneCargoCategoryCargo.do";
//   货物搜索：
    public String SEARCH_GOODS_URL="/phone/cargo/searchCargo.do";
//    注册
    public String RegistURL="/phone/user/register.do";
//    注册
    public String WX_RegistURL="/phone/user/registerAppWx.do";
//    修改密码：
    public String RESET_PASSWORD_URL="/phone/user/updatePassword.do";
//    验证验证码是否正确（忘记密码）：
    public String CODE_YANZHENG_URL="/phone/user/validateCodeUpdatePassword.do";
    public static String Latitude="Latitude";
    public static String Longitude="Longitude";
    public static String VirtualDeviceNumber="VirtualDeviceNumber";

    public static void saveUser(HuoYunBean huoYunBean) {
        BaseApplication.editor.putString(HYContent.LOGIN_NAME,huoYunBean.getLoginName());
        BaseApplication.editor.putString(HYContent.AvatarUrl,huoYunBean.getAvatarUrl());
        BaseApplication.editor.putString(HYContent.BankCardNo,huoYunBean.getBankCardNo());
        BaseApplication.editor.putString(HYContent.BankCardOpeningBank,huoYunBean.getBankCardOpeningBank());
        BaseApplication.editor.putString(HYContent.City,huoYunBean.getCity());
        BaseApplication.editor.putString(HYContent.CommunityId,huoYunBean.getCommunityId());
        BaseApplication.editor.putString(HYContent.TEST_EMPLOYEE,huoYunBean.getTestEmployee());
        BaseApplication.editor.putString(HYContent.CommunityName,huoYunBean.getCommunityName());
        BaseApplication.editor.putString(HYContent.CompanyName,huoYunBean.getCompanyName());
        BaseApplication.editor.putString(HYContent.Country,huoYunBean.getCountry());
        BaseApplication.editor.putString(HYContent.EmployeeId,huoYunBean.getEmployeeId());
        BaseApplication.editor.putString(HYContent.EmployeeRealname,huoYunBean.getEmployeeRealname());
        BaseApplication.editor.putString(HYContent.Gender,huoYunBean.getGender());
        BaseApplication.editor.putString(HYContent.Gswlzzfyq,huoYunBean.getGswlzzfyq());
        BaseApplication.editor.putString(HYContent.IsPhone,huoYunBean.getIsPhone());
        BaseApplication.editor.putString(HYContent.Language,huoYunBean.getLanguage());
        BaseApplication.editor.putString(HYContent.NickName,huoYunBean.getNickName());
        BaseApplication.editor.putString(HYContent.Password,huoYunBean.getPassword());
        BaseApplication.editor.putString(HYContent.PersonalQRCode,huoYunBean.getPersonalQRCode());
        BaseApplication.editor.putString(HYContent.Province,huoYunBean.getProvince());
        BaseApplication.editor.putString(HYContent.ShareUserAppShareImg,huoYunBean.getShareUserAppShareImg());
        BaseApplication.editor.putString(HYContent.UserId,huoYunBean.getUserId());
        BaseApplication.editor.putString(HYContent.Wlzzfyq,huoYunBean.getWlzzfyq());
        BaseApplication.editor.putString(HYContent.WxuserId,huoYunBean.getWxuserId());
        BaseApplication.editor.putString(HYContent.WxuserQrCode,huoYunBean.getWxuserQrCode());
        BaseApplication.editor.putString(HYContent.ZfbuserId,huoYunBean.getZfbuserId());
        BaseApplication.editor.putStringSet(HYContent.UserIdentityList,huoYunBean.getUserIdentityList());
        BaseApplication.editor.putStringSet(HYContent.UserIdentityList,huoYunBean.getUserIdentityList());
        BaseApplication.editor.putBoolean(HYContent.IS_LOGIN,true);
        BaseApplication.editor.commit();

    }
    public static void saveUserWX(HuoYunWXBean huoYunBean) {
        BaseApplication.editor.putString(HYContent.LOGIN_NAME,huoYunBean.getLoginName());
        BaseApplication.editor.putString(HYContent.AvatarUrl,huoYunBean.getImgUrl());
        BaseApplication.editor.putString(HYContent.Gender,huoYunBean.getSex());
        BaseApplication.editor.putString(HYContent.IsPhone,"false");
        BaseApplication.editor.putString(HYContent.NickName,huoYunBean.getNick());
        BaseApplication.editor.putString(HYContent.Password,huoYunBean.getPassword());
        BaseApplication.editor.putString(HYContent.UserId,huoYunBean.getId());
        BaseApplication.editor.putBoolean(HYContent.ISWX,true);
        BaseApplication.editor.putString(HYContent.WxuserId,huoYunBean.getId());
//        BaseApplication.editor.putString(HYContent.USET_TYPE,huoYunBean.getUserType());
        BaseApplication.editor.putString(HYContent.RONGSHU_TOKEN,huoYunBean.getRongYunToken());
        BaseApplication.editor.putBoolean(HYContent.IS_LOGIN,true);
        BaseApplication.editor.commit();

    }



}
