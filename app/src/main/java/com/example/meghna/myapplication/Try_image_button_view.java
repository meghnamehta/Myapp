package com.example.meghna.myapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Try_image_button_view extends AppCompatActivity implements View.OnClickListener{
    ImageButton i1,i2,i3,i4;
    int images[]={android.R.drawable.btn_star_big_on,android.R.drawable.ic_btn_speak_now,android.R.drawable.ic_delete,android.R.drawable.ic_lock_lock};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_image_button_view);
        i1=findViewById(R.id.imageButton_star);
        i2=findViewById(R.id.imageButton_Mike);
        i3=findViewById(R.id.imageButton_Cross);
        i4=findViewById(R.id.imageButton_Alert);
        i1.setOnClickListener((View.OnClickListener) this);
        i2.setOnClickListener((View.OnClickListener) this);
        i3.setOnClickListener((View.OnClickListener) this);
        i4.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.imageButton_star)
        {

            Intent i=new Intent(this,Display_Image.class);
            i.putExtra("i1_source",images[0]);
            startActivity(i);
        }
        if(v.getId()==R.id.imageButton_Mike)
        {

            Intent i=new Intent(this,Display_Image.class);
            i.putExtra("i1_source",images[1]);
            startActivity(i);
        }
        if(v.getId()==R.id.imageButton_Alert)
        {

            Intent i=new Intent(this,Display_Image.class);
            i.putExtra("i1_source",images[2]);
            startActivity(i);
        }
        if(v.getId()==R.id.imageButton_Cross)
        {

            Intent i=new Intent(this,Display_Image.class);
            i.putExtra("i1_source",images[3]);
            startActivity(i);
        }
    }
}
