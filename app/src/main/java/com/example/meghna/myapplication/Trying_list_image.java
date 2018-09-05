package com.example.meghna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class Trying_list_image extends AppCompatActivity {
    ListView lv;
    Spinner sp;
    String countries[];
    int img[]={android.R.drawable.btn_star,android.R.drawable.btn_star,android.R.drawable.btn_star,android.R.drawable.btn_star};;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_trying_list_image);
        lv=findViewById(R.id.lv);
        countries=getResources().getStringArray(R.array.country);

        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_list_item_1,countries);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Trying_list_image.this,countries[position],Toast.LENGTH_SHORT).show();
            }
        });
        sp=findViewById(R.id.spinner1);
        ArrayAdapter aa1=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,countries);
        sp.setAdapter(aa1);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Trying_list_image.this,countries[position],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        CustomAdapter ca=new CustomAdapter(this,countries,img);
        lv.setAdapter(ca);
        sp.setAdapter(ca);
    }
}
