package com.example.raja.drawlines;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

/**
 * Created by raja on 2/15/2017.
 */

public class DrawView extends View {
    Paint paint = new Paint();
    public DrawView(Context context) {

        super(context);
        Log.d("codekamp","ravilund");
        paint.setColor(Color.BLUE);


    }
    @Override
    protected void onDraw(Canvas canvas)
    {
        canvas.drawLine(20,120,130,30,paint);
        Log.d("codekamp","ashhjas");
        canvas.drawLine(20,20,207,220,paint);


    }

}
