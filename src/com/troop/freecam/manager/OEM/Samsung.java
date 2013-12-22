package com.troop.freecam.manager.OEM;

/**
 * Created by George on 12/20/13.
 */
public class Samsung {


    ///:::::::::::::::::::: EXYNOS 5 (2013)::::::::::::::::::::::::::::::::::::::::
    String[]  supported_iso_exynos5 = "auto,50,100,200,400,800,1600,3200,movie,sports,night".split(",");
    public String supported_focus_modes_exynos5 = "auto,continuous-picture,continuous-picture-macro,continuous-video,face-priority,macro,infinity";
    public String supported_effect_modes_exynos5 = "none,faded-colours,mono,negative,nostalgia,point-blue,point-green,point-red-yellow,posterize,retro,sepia,solarize,sunshine,vintage,vintage-cold,vintage-warm,washed";
    String[] supported_exposure_modes_exynos5 = "center,matrix,spot".split(",");

    public String[] getSupported_iso_exynos5() {
        return supported_iso_exynos5;
    }
    public String[] getSupported_exposure_modes_exynos5()
    {
        return supported_exposure_modes_exynos5;
    }

    public String supported_fps_factor_exynos5 = "1,2,3";
    public String supported_ev_compensate_exynos5 = "-2.0,-1.5,-1.0,0,1.0,1.5,2.0";
    public String supported_stablization_modes_exynos5 = "off,on,rsc";
    public String supported_scene_modes_exynos5 = "auto,aqua_scn,back-light,beach,candlelight,dusk-dawn,fall-color,fireworks,landscape,night,party,portrait,sports,sunset,text";



    //##############################################################################

    ///:::::::::::::::::::: Qualcomm S600++::::::::::::::::::::::::::::::::::::::::

    //##############################################################################
}
