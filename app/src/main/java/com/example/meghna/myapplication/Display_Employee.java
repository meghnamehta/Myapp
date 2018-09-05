package com.example.meghna.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display_Employee extends AppCompatActivity {
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__employee);
        t1=findViewById(R.id.textView_demp_name);
        t2=findViewById(R.id.textView_demp_gender);
        t3=findViewById(R.id.textView_demp_hobby);
        Intent i=getIntent();
        String demp_name=i.getExtras().getString("empname");
        String demp_gender=i.getExtras().getString("gender");
        //String demp_hobby=i.getExtras().getString("hobbies");
        //String[] demo=i.getStringArrayExtra("hobbies");
        Bundle bundle = getIntent().getExtras();
        String arrayReceived[] = bundle.getStringArray("Hobbies_Array");
        t1.setText("EMPLOYEE NAME: "+demp_name);
        t2.setText("EMPLOYEE GENDER: "+demp_gender);
        t3.setText("EMPLOYEE HOBBIES: ");
        for(int j=0;j<arrayReceived.length;j++)
        {
            t3.append(arrayReceived[j]+"\n");
        }
    }
}
