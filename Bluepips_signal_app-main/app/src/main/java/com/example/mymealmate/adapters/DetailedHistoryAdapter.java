package com.example.mymealmate.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymealmate.R;
import com.example.mymealmate.models.DetailedHistoryModel;

import java.util.List;

public class DetailedHistoryAdapter extends RecyclerView.Adapter<DetailedHistoryAdapter.ViewHolder> {

    List<DetailedHistoryModel> list;

    public DetailedHistoryAdapter(List<DetailedHistoryModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.detailed_history_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.time.setText(list.get(position).getTime());
        holder.more.setText(list.get(position).getMore());
        holder.last.setText(list.get(position).getLast());
        holder.tel.setText(list.get(position).getTel());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        ImageView imageView;
        TextView name,time,more,last,tel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.detailed_img);
            name = itemView.findViewById(R.id.detailed_name);
            time = itemView.findViewById(R.id.detailed_des);
            more = itemView.findViewById(R.id.detailed_rating);
            last = itemView.findViewById(R.id.detailed_price);
            tel = itemView.findViewById(R.id.detailed_timing);

        }
    }
}
