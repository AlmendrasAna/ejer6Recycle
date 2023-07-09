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


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ItemBinding itemBinding;
        public ViewHolder(ItemBinding binding) {
            super(binding.getRoot());
            itemBinding = binding;
            itemView.setOnClickListener(this);

        }

        public void getInfo(String words){

            itemBinding.dataTxtView.setText(words);
        }

        @Override
        public void onClick(View v) {
            int posicion = getLayoutPosition();
            words.set(posicion, words.get(posicion) +" Clicked");
            String words2 =  words.get(posicion);
            itemBinding.dataTxtView.setText(words2);

        }
    }
}
