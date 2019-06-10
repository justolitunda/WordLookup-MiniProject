package com.example.translator;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private String[] dataSet;

    public String[] getDataSet() {
        return dataSet;
    }

    public void setDataSet(String[] dataSet) {
        this.dataSet = dataSet;
    }





    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        TextView textView = (TextView)
                LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.words,viewGroup,false);
        MyViewHolder viewHolder = new MyViewHolder(textView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.textView.setText(dataSet[i]);

    }

    @Override
    public int getItemCount() {
        return dataSet.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public MyViewHolder(@NonNull TextView textView) {
            super(textView);
            this.textView = textView;
        }
    }
}
