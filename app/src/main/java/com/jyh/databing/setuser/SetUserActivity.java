package com.jyh.databing.setuser;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jyh.databing.R;
import com.jyh.databing.databinding.ActivitySetUserBinding;

/**
 * Created by Administrator on 2017/4/3.
 */

public class SetUserActivity extends AppCompatActivity {
    ActivitySetUserBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=   DataBindingUtil.setContentView(this, R.layout.activity_set_user);
        User user=new User("江","雨寒",false);
        binding.setUser(user);
    }
}
