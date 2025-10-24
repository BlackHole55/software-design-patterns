package Assignment6.Context;

import Assignment6.Strategy.LightingMode;

public class SmartLightMode {
    private LightingMode lightingMode;

    public SmartLightMode(LightingMode lightingMode) {
        this.lightingMode = lightingMode;
    }

    public void setLightingMode(LightingMode lightingMode) {
        this.lightingMode = lightingMode;
    }

    public void applyLightingMode() {
        this.lightingMode.adjust_light();
    }
}
