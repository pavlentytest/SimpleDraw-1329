package ru.samsung.itschool.book.simpledraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import task.Task;

public class MyView extends View {
    Paint paint = new Paint();
    float x = 0;
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(x, 300, 20, paint);
        // готовим x для следущего кадра
        x += 0.5f;
        invalidate();
    }
}
