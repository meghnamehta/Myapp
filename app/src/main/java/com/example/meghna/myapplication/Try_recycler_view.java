package com.example.meghna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class Try_recycler_view extends AppCompatActivity {

    //ArrayList personNames = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7"));
    String personNames[]={"Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7"};
    RecyclerView rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_recycler_view);
        rc=findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        rc.setLayoutManager(linearLayoutManager);
        CustomAdapter_1 customAdapter_1=new CustomAdapter_1(this,personNames);
        rc.setAdapter(customAdapter_1);
    }
}
