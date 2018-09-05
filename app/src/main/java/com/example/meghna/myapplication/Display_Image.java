package com.example.meghna.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Display_Image extends AppCompatActivity {
    TextView t1;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__image);
        img=findViewById(R.id.imageView);
        Intent i=getIntent();
        //int st=Integer.parseInt(i.getExtras().getString("i1_source"));
        //t1=findViewById(R.id.textView_imageview);
        //t1.setText(Integer.toString(st));
        int str=i.getExtras().getInt("i1_source");
//        t1=findViewById(R.id.textView_imageview);
//        t1.setText(str);
       img.setImageResource(str);
        //img.setImageResource(android.R.drawable.btn_star_big_on);
    }
}
