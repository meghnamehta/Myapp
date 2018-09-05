package com.example.meghna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class try_simple_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_simple_menu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"Menu Item1");
        menu.add(1,0,1,"MenuItem2");
        SubMenu sb=menu.addSubMenu(2,0,2,"MenuItem3");
        sb.add(0,1,0,"Add");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==0){


        }
        return super.onOptionsItemSelected(item);
    }
}
