package com.example.meghna.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class try_fragement extends AppCompatActivity {
    Button b1,b2;
    FrameLayout f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_fragement);
        b1=findViewById(R.id.button_fragement1);
        b2=findViewById(R.id.button_fragement2);
        f=findViewById(R.id.framelayout);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.framelayout,new FirstFragement());
                ft.commit();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.framelayout,new SecondFragement());
                ft.commit();
            }
        });
    }
}
