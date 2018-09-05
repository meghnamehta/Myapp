package com.example.meghna.myapplication;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class chronometer_timer extends AppCompatActivity {
   Chronometer simpleChronometer;
    Button start, stop, restart, setFormat, clearFormat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chronometer_timer);
        simpleChronometer = (Chronometer) findViewById(R.id.simpleChronometer);
        start = (Button) findViewById(R.id.startButton);
        stop = (Button) findViewById(R.id.stopButton);
        restart = (Button) findViewById(R.id.restartButton);
        setFormat = (Button) findViewById(R.id.setFormat);
        clearFormat = (Button) findViewById(R.id.clearFormat);
        // perform click  event on start button to start a chronometer
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChronometer.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChronometer.stop();
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChronometer.setBase(SystemClock.elapsedRealtime());
            }
        });
        setFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChronometer.setFormat("Time (%s)");
            }
        });
        clearFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleChronometer.setFormat(null);
            }
        });
    }
}
