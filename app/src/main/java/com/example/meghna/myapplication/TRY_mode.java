package com.example.meghna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class TRY_mode extends AppCompatActivity implements View.OnClickListener {
    SeekBar red,blue,green;
    private int seekR, seekG, seekB;
    LinearLayout mScreen;
    Button btn;
    RatingBar rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_try_mode);
        rb=findViewById(R.id.ratingBar);
        btn=findViewById(R.id.button_ratings);
        mScreen = findViewById(R.id.myScreen);
        red=findViewById(R.id.seekBar_red);
        blue=findViewById(R.id.seekBar_blue);
        green=findViewById(R.id.seekBar_green);
        //updateBackground();
        btn.setOnClickListener(this);
        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateBackground();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateBackground();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateBackground();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    private void updateBackground()
    {
        seekR = red.getProgress();
        seekG = green.getProgress();
        seekB = blue.getProgress();
        mScreen.setBackgroundColor(
                0xff000000+

                        + seekR * 0x10000
                        + seekG * 0x100
                        + seekB
        );
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button_ratings){
            //int stars=rb.getNumStars();
            Toast t=Toast.makeText(this,String.valueOf(rb.getRating()),Toast.LENGTH_SHORT);
            t.setGravity(Gravity.LEFT,0,0);
            t.show();
        }
    }
}
