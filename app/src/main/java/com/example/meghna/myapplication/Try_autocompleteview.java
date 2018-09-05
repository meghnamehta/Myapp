package com.example.meghna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Try_autocompleteview extends AppCompatActivity {
    String fruits[]={"Apple", "Banana", "Cherry", "Date", "Grape", "Kiwi", "Mango", "Pear"};
    AutoCompleteTextView atv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_autocompleteview);
        atv=findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> a1=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,fruits);
        atv.setThreshold(1);
        atv.setAdapter(a1);
    }
}
