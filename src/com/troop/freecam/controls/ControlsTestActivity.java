package com.troop.freecam.controls;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.troop.freecam.R;
import com.troop.freecam.manager.interfaces.IStyleAbleSliderValueHasChanged;

/**
 * Created by troop on 23.12.13.
 */
public class ControlsTestActivity extends Activity
{
    StyleAbelSlider slider;
    TextView values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.controlstest_main);
        values = (TextView)findViewById(R.id.textView);
        slider = (StyleAbelSlider)findViewById(R.id.viewSlider);

        slider.valueHasChanged = new IStyleAbleSliderValueHasChanged()
        {
            @Override
            public void ValueHasChanged(int value)
            {
                String s = value + "";
                values.setText(s);
            }
        };
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
