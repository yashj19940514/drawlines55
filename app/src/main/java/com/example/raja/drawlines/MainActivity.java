package com.example.raja.drawlines;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private DrawView dv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         dv = new DrawView(this);
        dv.setBackgroundColor(Color.WHITE);
        setContentView(dv);





    }


    public static void rr(){

        int k;

    }

}
