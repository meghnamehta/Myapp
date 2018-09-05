package com.example.meghna.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView t1,t2,t3;
    EditText tv;
    Button btn;
    RadioGroup rgb;
    CheckBox ch1,ch2,ch3;
    String str_rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1=findViewById(R.id.t_empname);
        t2=findViewById(R.id.textView_gender);
        t3=findViewById(R.id.textView_hobbies);
        tv=findViewById(R.id.editText_name);
        btn=findViewById(R.id.button_empsubmit);
        rgb=findViewById(R.id.radiogroup_1);
        ch1=findViewById(R.id.checkBox_music);
        ch2=findViewById(R.id.checkBox_dancing);
        ch3=findViewById(R.id.checkBox_p1);
        str_rg="Female";
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main3Activity.this,Display_Employee.class);
                i.putExtra("empname",tv.getText().toString());
                i.putExtra("gender",str_rg);
                String hobbies[]=new String[2];
                if(ch1.isChecked())
                {
                    hobbies[0]=ch1.getText().toString();
                   // i.putExtra("hobbies",hobbies[0]);
                }
                if(ch2.isChecked())
                {
                    hobbies[1]=ch2.getText().toString();
                    //i.putExtra("hobbies",hobbies[1]);
                }
                if(ch3.isChecked())
                {
                    hobbies[2]=ch3.getText().toString();
                    //i.putExtra("hobbies",hobbies[2]);
                }
               // i.putExtra("hobbies",hobbies);
                Bundle bundle = new Bundle();
                bundle.putStringArray("Hobbies_Array",hobbies);
                i.putExtras(bundle);
                startActivity(i);

            }
        });
        rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                    if(i==R.id.radioButton_FEMALE){
                        str_rg="FEMALE";
                    }
                else{
                    str_rg="MALE";
                }
            }
        });
    }
}
