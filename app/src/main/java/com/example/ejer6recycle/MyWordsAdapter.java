package com.example.ejer6recycle;


import android.content.ClipData;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejer6recycle.databinding.ItemBinding;

import java.util.List;


public class MyWordsAdapter extends RecyclerView.Adapter <MyWordsAdapter.ViewHolder>{
private List<String> words;


    public void setData(List<String> data){

        this.words = data;
    }
    @NonNull
    @Override
    public MyWordsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        Log.d("MyAdapterviw", "onCreateViewHolder ----");
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyWordsAdapter.ViewHolder holder, int position) {
    String itemWords= words.get(position);
    holder.getInfo(itemWords);
    }

    @Override
    public int getItemCount() {

        return words.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding itemBinding;
        public ViewHolder(ItemBinding binding) {
            super(binding.getRoot());
            itemBinding = binding;

        }

        public void getInfo(String words){
            Log.d("MyAdapter", words);
            itemBinding.dataTxtView.setText(words);
        }
    }
}
