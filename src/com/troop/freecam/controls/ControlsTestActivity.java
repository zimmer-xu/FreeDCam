package com.troop.freecam.controls;

import android.app.Activity;
import android.os.Bundle;

import com.troop.freecam.R;

/**
 * Created by troop on 23.12.13.
 */
public class ControlsTestActivity extends Activity
{
    StyleAbelSlider slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.controlstest_main);
        slider = (StyleAbelSlider)findViewById(R.id.view2);
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
