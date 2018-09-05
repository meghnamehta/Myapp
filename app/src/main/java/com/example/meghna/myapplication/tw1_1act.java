package com.example.meghna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tw1_1act extends AppCompatActivity implements View.OnClickListener {
    int operator1,operator2,result;
    char op;
    EditText t1;
    String t2;
    Button bt_backsp,bt_clear,bt_div,bt_nine,bt_eight,bt_seven,bt_six,bt_five,bt_four,bt_three,bt_two,bt_one,bt_zero,bt_mul,bt_add,bt_sub,bt_equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tw1_1act);
        operator1=operator2=result=0;
        t1=findViewById(R.id.editText_value);
        bt_one=findViewById(R.id.butt_one);
        bt_two=findViewById(R.id.butt_two);
        bt_equal=findViewById(R.id.button_equal);
        bt_add=findViewById(R.id.butt_add);
        bt_sub=findViewById(R.id.butt_sub);
        bt_mul=findViewById(R.id.butt_mul);
        bt_div=findViewById(R.id.butt_divide);
        bt_three=findViewById(R.id.butt_three);
        bt_three.setOnClickListener(this);
        bt_four=findViewById(R.id.butt_four);
        bt_four.setOnClickListener(this);
        bt_five=findViewById(R.id.butt_five);
        bt_five.setOnClickListener(this);
        bt_six=findViewById(R.id.butt_six);
        bt_six.setOnClickListener(this);
        bt_seven=findViewById(R.id.butt_seven);
        bt_seven.setOnClickListener(this);
        bt_eight=findViewById(R.id.butt_eight);
        bt_eight.setOnClickListener(this);
        bt_nine=findViewById(R.id.butt_nine);
        bt_nine.setOnClickListener(this);
        bt_zero=findViewById(R.id.butt_zero);
        bt_zero.setOnClickListener(this);
       bt_one.setOnClickListener(this);
        bt_two.setOnClickListener(this);
       bt_add.setOnClickListener(this);
       bt_sub.setOnClickListener(this);
      bt_equal.setOnClickListener(this);
      bt_mul.setOnClickListener(this);
      bt_div.setOnClickListener(this);
      bt_backsp=findViewById(R.id.butt_backspace);
      bt_backsp.setOnClickListener(this);
      bt_clear=findViewById(R.id.butt_clear);
      bt_clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.butt_clear){
            t1.setText(null);
        }
        if(v.getId()==R.id.butt_one){
            t1.append("1");

        }
        if(v.getId()==R.id.butt_two){
            t1.append("2");
        }
        if(v.getId()==R.id.butt_three){
            t1.append("3");
        }
        if(v.getId()==R.id.butt_four){
            t1.append("4");
        }
        if(v.getId()==R.id.butt_five){
            t1.append("5");
        }
        if(v.getId()==R.id.butt_six){
            t1.append("6");
        }
        if(v.getId()==R.id.butt_seven){
            t1.append("7");
        }
        if(v.getId()==R.id.butt_eight){
            t1.append("8");
        }
        if(v.getId()==R.id.butt_nine){
            t1.append("9");
        }
        if(v.getId()==R.id.butt_zero){
            t1.append("0");
        }
        if(v.getId()==R.id.butt_add){
            operator1=Integer.parseInt(t1.getText().toString());
            op='+';
            t1.setText(null);
        }
        if(v.getId()==R.id.butt_sub){
            operator1=Integer.parseInt(t1.getText().toString());
            op='-';
            t1.setText(null);
        }
        if(v.getId()==R.id.butt_mul){
            operator1=Integer.parseInt(t1.getText().toString());
            op='*';
            t1.setText(null);
        }
        if(v.getId()==R.id.butt_divide){
            operator1=Integer.parseInt(t1.getText().toString());
            op='/';
            t1.setText(null);
        }
        if(v.getId()==R.id.button_equal){
            operator2=Integer.parseInt(t1.getText().toString());
            if(op=='+'){
                result=operator1+operator2;
            }
            if(op=='-'){
                result=operator1-operator2;
            }
            if(op=='*'){
                result=operator1*operator2;
            }
            if(op=='/'){
                result=operator1/operator2;
            }
           t1.setText(Integer.toString(result));
        }

    }
}
