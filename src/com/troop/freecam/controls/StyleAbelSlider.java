package com.troop.freecam.controls;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import com.troop.freecam.HDR.BitmapHandler;
import com.troop.freecam.R;

/**
 * Created by troop on 22.12.13.
 */
public class StyleAbelSlider extends View
{
    //the activity
    Context context;
    //the sliderimage stored in memory
    Bitmap sliderImage;
    //the minmal value of the slider
    int min;
    //the max value of the slider
    int max;
    //the current value of the slider
    int current;
    int sliderWidth;
    int sliderHeight;
    int drawPosition;
    boolean horizontal;

    int picID;

    public StyleAbelSlider(Context context) {
        super(context);
        //init(context);
    }

    public StyleAbelSlider(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);

    }

    public StyleAbelSlider(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs)
    {
        this.context = context;
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.StyleAbelSlider,
                0, 0);


        picID = a.getResourceId(R.styleable.StyleAbelSlider_horizontal, R.drawable.icon_shutter_thanos_blast);
        horizontal = a.getBoolean(R.styleable.StyleAbelSlider_horizontal, false);
        min = 0;
        max = 100;
        current = 50;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (sliderImage == null)
        {
            if (horizontal)
            {
                sliderImage = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), picID), this.getHeight(), this.getHeight(), false);
            }
            else
            {
                sliderImage = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), picID), this.getWidth(), this.getWidth(), false);
            }
        }
        if (sliderImage != null)
            canvas.drawBitmap(sliderImage, getPosToDraw().left, getPosToDraw().top, new Paint());
    }

    private Rect getPosToDraw()
    {
        if (horizontal)
        {
            int pos = getWidth() / max * current;
            int half = sliderWidth / 2;
            Rect ret = new Rect(pos - half, 0, sliderWidth, sliderHeight);
            return ret;
        }
        else
        {
            int pos = getHeight() /max *current;
            int half = sliderHeight / 2;
            Rect ret = new Rect(0, pos - sliderHeight , sliderWidth, sliderHeight);
            return ret;
        }
    }
}
