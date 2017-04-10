package com.jyh.databing;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/4/4.
 */

public class DataBindApplication extends Application {
    public  static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext=this;
    }
}
