package com.jyh.databing.findview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.jyh.databing.R;
import com.jyh.databing.databinding.ActivityFindviewBinding;

/**
 * Created by Administrator on 2017/4/8.
 */

public class FindViewActivity extends AppCompatActivity {
    ActivityFindviewBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_findview);
    }

    public void show(View view) {
        binding.tv.setText(binding.ed.getText().toString());

    }
}
