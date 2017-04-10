package com.jyh.databing.onclick;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jyh.databing.R;
import com.jyh.databing.databinding.ActivityOnclickBinding;


/**
 * Created by Administrator on 2017/4/4.
 */

public class OnClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityOnclickBinding bind = DataBindingUtil.setContentView(this, R.layout.activity_onclick);
        bind.setGirl(new Girl("zsx", true));
        bind.setHaveFriend(new Handlers());
    }
}
