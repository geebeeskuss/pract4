package com.example.pract4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<String> {
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<String> items;
    public ListViewAdapter(Context context, int layout,
                           ArrayList<String> items) {
        super(context, layout, items);
        this.items = items;
        this.layout = layout;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        View view=inflater.inflate(this.layout, parent, false);
        TextView textView = view.findViewById(R.id.list_item_text);
        ImageView imageView = view.findViewById(R.id.list_item_image);
        String item = items.get(position);
        textView.setText(item);
        imageView.setImageDrawable(parent.getContext().getDrawable(R.drawable.sakura2));
        return view;
    }
}
