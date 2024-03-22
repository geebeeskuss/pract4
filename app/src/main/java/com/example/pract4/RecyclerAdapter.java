package com.example.pract4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private final ArrayList<String> items;
    private final Context context;

    public RecyclerAdapter(ArrayList<String> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item = items.get(position);
        holder.text.setText(item);
        holder.image.setImageDrawable(context.getDrawable(R.drawable.sakura3));
        holder.layout.setOnClickListener(view -> {
            Toast.makeText(context, "meow in RecyclerView", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text;
        public ImageView image;
        public ViewGroup layout;

        public ViewHolder(View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.list_item_text);
            image = itemView.findViewById(R.id.list_item_image);
            layout = itemView.findViewById(R.id.item_container);
        }
    }
}
