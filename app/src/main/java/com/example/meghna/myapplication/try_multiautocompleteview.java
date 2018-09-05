package com.example.meghna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class try_multiautocompleteview extends AppCompatActivity {
    String fruits[]={"Apple", "Banana", "Cherry", "Date", "Grape", "Kiwi", "Mango", "Pear"};
    MultiAutoCompleteTextView mtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_multiautocompleteview);
        mtv=findViewById(R.id.multiAutoCompleteTextView);
        ArrayAdapter<String> a1=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,fruits);
        mtv.setThreshold(2);
        mtv.setAdapter(a1);
        mtv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
