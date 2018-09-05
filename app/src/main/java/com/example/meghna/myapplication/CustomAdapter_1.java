package com.example.meghna.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdapter_1 extends RecyclerView.Adapter<CustomAdapter_1.MyViewHolder> {
    String[] personNames;
    Context context;
    public CustomAdapter_1(Context context, String[] personNames) {
        this.context = context;
        this.personNames=personNames;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = itemView.findViewById(R.id.textView_rc);
        }

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
        holder.name.setText(personNames[position]);
        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a tosast with person name on item click
                Toast.makeText(context,  personNames[position], Toast.LENGTH_SHORT).show();
            }
        });

    }



    @Override
    public int getItemCount() {
        return (personNames.length);
    }
}
