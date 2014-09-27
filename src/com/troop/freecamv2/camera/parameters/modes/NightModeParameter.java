package com.troop.freecamv2.camera.parameters.modes;

import android.hardware.Camera;

import com.troop.freecamv2.camera.parameters.I_ParameterChanged;
import com.troop.freecamv2.utils.DeviceUtils;

/**
 * Created by troop on 26.09.2014.
 */
public class NightModeParameter extends BaseModeParameter
{
    public NightModeParameter(Camera.Parameters parameters, I_ParameterChanged parameterChanged, String value, String values) {
        super(parameters, parameterChanged, value, values);
    }

    @Override
    public boolean IsSupported()
    {
        if (DeviceUtils.isZTEADV())
            return true;
        else
            return false;
    }

    @Override
    public void SetValue(String valueToSet) {
        parameters.set("night_key", valueToSet);
        if (throwParameterChanged != null)
            throwParameterChanged.ParameterChanged();
    }

    @Override
    public String GetValue() {
        return parameters.get("night_key");
    }

    @Override
    public String[] GetValues() {
        return new String[] {"off","on","tripod"};
    }
}