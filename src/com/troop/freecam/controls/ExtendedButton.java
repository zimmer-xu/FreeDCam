package com.troop.freecam.controls;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.troop.freecam.R;

/**
 * Created by troop on 23.12.13.
 */
public class ExtendedButton extends View
{
    String topString;
    String midString;
    String botString;

    public ExtendedButton(Context context) {
        super(context);
    }

    public ExtendedButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, context);
    }

    public ExtendedButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, context);
    }

    private void init(AttributeSet attrs, Context context)
    {
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.ExtendedButton,
                0, 0);
        topString = a.getString(R.styleable.ExtendedButton_StringTop);
        botString = a.getString(R.styleable.ExtendedButton_StringBot);
        a.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        //getBackground().draw(canvas);
        int height = getHeight()/3;
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL);
        Paint paintBlack = new Paint();
        paintBlack.setColor(Color.BLACK);
        paintBlack.setStyle(Paint.Style.FILL);

        getMatchingTextSize(paintBlack, height, topString);
        canvas.drawText(topString, 2, height - 2, paintBlack);
        getMatchingTextSize(paint, height, topString);
        canvas.drawText(topString, 0, height - 2, paint);

        if (midString != null)
            canvas.drawText(midString, 0, height*2 - 4 , paint);
        getMatchingTextSize(paintBlack, height, botString);
        canvas.drawText(botString, 2, height*3 - 6, paintBlack);
        getMatchingTextSize(paint, height, botString);
        canvas.drawText(botString, 0, height*3 - 6, paint);


    }

    private void getMatchingTextSize(Paint paint, int height, String _string)
    {
        paint.setTextSize(height);
        int count = height;
        int length = (int)paint.measureText(_string);
        if (length > getWidth())
        {
            int dif = length - getWidth();
            for (int i = 0; i < dif; i++)
            {
                count--;
                paint.setTextSize(count);
                length = (int)paint.measureText(_string);
                if (length <= getWidth())
                    break;
            }
        }
    }
}
