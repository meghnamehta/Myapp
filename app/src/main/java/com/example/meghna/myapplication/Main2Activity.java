package com.example.meghna.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    EditText t1,t2;
    Button b1,b2;
    TextView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);t1=findViewById(R.id.Username);
        t2=findViewById(R.id.Password);
        b1=findViewById(R.id.button_OK);
        b2=findViewById(R.id.button2_Cancel);
        l1=findViewById(R.id.text_Welcome);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button_OK){
            String uname=t1.getText().toString();
            String passwd=t2.getText().toString();
            if(uname.equals("Meghna") && (passwd.equals("passwd"))){
                l1.setText("You got it right!!");
                Toast t=Toast.makeText(this, "Good Enough!!", Toast.LENGTH_SHORT);
                t.setGravity(Gravity.LEFT,0,0);
                t.show();
            }
            else{
                t1.setText("");
                t2.setText("");
            }
        }
        else{
            Intent i=new Intent(this,MainActivity.class);
            i.putExtra("uname",t1.getText());
            startActivity(i);

        }
    }
}
