package com.jyh.databing.customer;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jyh.databing.JyhBinding;
import com.jyh.databing.R;
import com.jyh.databing.onclick.Girl;


/**
 * Created by Administrator on 2017/4/5.
 */

public class CustomerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JyhBinding bind=   DataBindingUtil.setContentView(this, R.layout.activity_customer);
        bind.setGirl(new Girl("周蜀茜",false));
    }
}
