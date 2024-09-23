package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Item> itemList;

    public MyAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.imgItem.setImageResource(item.getImage());
        holder.txtHeading.setText(item.getHeading());
        holder.txtNotice.setText(item.getNotice());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private ConstraintLayout wrapperItem;
        private ImageView imgItem;
        private TextView txtHeading;
        private TextView txtNotice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            wrapperItem = itemView.findViewById(R.id.wrapperItem);
            imgItem = itemView.findViewById(R.id.imgItem);
            txtHeading = itemView.findViewById(R.id.txtHeading);
            txtNotice = itemView.findViewById(R.id.txtNotice);
        }
    }
}