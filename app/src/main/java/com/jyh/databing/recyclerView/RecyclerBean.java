package com.jyh.databing.recyclerView;

import android.view.View;
import android.widget.Toast;

import com.jyh.databing.DataBindApplication;

/**
 * Created by Administrator on 2017/4/9.
 */

public class RecyclerBean {
    private String name;
    private String imgUrl;

    public RecyclerBean(String name, String imgUrl) {
        this.name = name;
        this.imgUrl = imgUrl;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void show(View view) {
        Toast.makeText(DataBindApplication.mContext, getName(), Toast.LENGTH_LONG).show();
    }

}
