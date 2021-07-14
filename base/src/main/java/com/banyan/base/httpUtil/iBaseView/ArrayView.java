package com.banyan.base.httpUtil.iBaseView;

import java.util.List;

/**
 * Created by 徐学坤 on 2016/9/27.
 * Description 列表页
 */
public interface ArrayView {

    //void loadData();

    //首次加载数据
    void addDatas(String data, int count);

    //下拉刷新数据
    void refresh(String data, int count);

    //上拉加载数据
    void loadMore(String data, int count);

    void showProgress();

    void hideProgress();

}