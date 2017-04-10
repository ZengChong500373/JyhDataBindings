package com.jyh.databing.onclick;

import android.view.View;
import android.widget.Toast;

import com.jyh.databing.DataBindApplication;

/**
 * Created by Administrator on 2017/4/10.
 */

public class Handlers {
    public void onClickFriend(View view){
        Toast.makeText(DataBindApplication.mContext,"hello",Toast.LENGTH_LONG).show();
        view.setVisibility(View.GONE);
    }
}
