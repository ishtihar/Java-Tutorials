package com.irk.javatutorials;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.MyViewHolder>{
    Context context;
    private ArrayList<String> titleList;
    CustomItemClickListener customItemClickListener;

    public TitleAdapter(Context context, ArrayList<String> titleList, CustomItemClickListener customItemClickListener) {
        this.context = context;
        this.titleList = titleList;
        this.customItemClickListener = customItemClickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.title_layout,parent,false);
       final MyViewHolder viewHolder=new MyViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customItemClickListener.onItemClick(view,viewHolder.getPosition());
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
holder.titleText.setText(titleList.get(position).replace("_"," "));
    }

    @Override
    public int getItemCount() {
        return titleList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titleText;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText=(TextView)itemView.findViewById(R.id.title_text);
        }
    }
}
