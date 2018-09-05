package com.example.meghna.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] countries;
    int[] imgs;

    public CustomAdapter(Context context, String[] countries, int[] imgs) {
        this.context = context;
        this.countries = countries;
        this.imgs = imgs;
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.custom_list_item, null);
        TextView tv;
        ImageView img;
        tv = v.findViewById(R.id.tv1);
        img = v.findViewById(R.id.img);
        tv.setText(countries[position]);
        img.setImageResource(imgs[position]);

        return v;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.custom_list_item, null);
        TextView tv;
        ImageView img;
        tv = v.findViewById(R.id.tv1);
        img = v.findViewById(R.id.img);
        tv.setText(countries[position]);
        img.setImageResource(imgs[position]);
        return v;
    }
}

