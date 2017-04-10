package com.jyh.databing.recyclerView;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jyh.databing.BR;
import com.jyh.databing.R;
import com.jyh.databing.databinding.ActivityRecyclerBinding;
import com.jyh.databing.databinding.ActivityRecyclerItemBinding;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2017/4/9.
 */

public class RecyclerViewActivity extends AppCompatActivity {
    ActivityRecyclerBinding binding;
    List<RecyclerBean> list;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler);
        list = new ArrayList<>();
        list.add(new RecyclerBean("jyh", ""));
        list.add(new RecyclerBean("zsx", ""));
        binding.rv.setLayoutManager(new LinearLayoutManager(this));
        binding.rv.setAdapter(new JyhAdapter());
    }

    public class JyhAdapter extends RecyclerView.Adapter<JyhAdapter.JyhViewHolder> {
        @Override
        public JyhViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            ActivityRecyclerItemBinding binding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.getContext()),
                    R.layout.activity_recycler_item,
                    parent,
                    false);
            JyhViewHolder holder = new JyhViewHolder(binding.getRoot());
            holder.setBind(binding);
            return holder;
        }

        @Override
        public void onBindViewHolder(JyhViewHolder holder, int position) {
            holder.getBind().setBean(list.get(position));
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
        public class JyhViewHolder extends RecyclerView.ViewHolder {
            private ActivityRecyclerItemBinding binding;
            public JyhViewHolder(View itemView) {
                super(itemView);
            }

            public void setBind(ActivityRecyclerItemBinding binding) {
                this.binding = binding;
            }

            public ActivityRecyclerItemBinding getBind() {
                return binding;
            }
        }
    }

}
