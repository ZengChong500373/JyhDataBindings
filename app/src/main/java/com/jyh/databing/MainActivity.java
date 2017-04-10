package com.jyh.databing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jyh.databing.customer.CustomerActivity;
import com.jyh.databing.findview.FindViewActivity;
import com.jyh.databing.onclick.OnClickActivity;
import com.jyh.databing.recyclerView.RecyclerViewActivity;
import com.jyh.databing.setuser.SetUserActivity;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setUser(View view){
       intent=new Intent(this, SetUserActivity.class);
        startActivity(intent);
    }
    public void onClickView(View view){
        intent=new Intent(this, OnClickActivity.class);
        startActivity(intent);
    }
    public void customerName(View view){
        intent=new Intent(this, CustomerActivity.class);
        startActivity(intent);
    }

    public void findview(View view){
        intent=new Intent(this, FindViewActivity.class);
        startActivity(intent);
    }
    public void recyclerView(View view){
        intent=new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }


}
