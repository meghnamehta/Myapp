package com.example.meghna.myapplication;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

public class Try_date_time extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_date_time);
        b1=findViewById(R.id.button_DATE);
        b2=findViewById(R.id.button_Time);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Try_date_time.this,"",Toast.LENGTH_SHORT).show();
                showDialog(1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Try_date_time.this,"",Toast.LENGTH_SHORT).show();
                showDialog(2);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if(id==1){
            DatePickerDialog dp=new DatePickerDialog(Try_date_time.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                }
            },2018,07,19);
            return dp;
        }
        else{

            TimePickerDialog tp=new TimePickerDialog(Try_date_time.this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                }
            },5,20,true);
            return tp;
        }

    }
}
