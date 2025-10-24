package Assignment6;

import Assignment6.ConcreteStrategies.NightMode;
import Assignment6.ConcreteStrategies.PartyMode;
import Assignment6.ConcreteStrategies.ReadingMode;
import Assignment6.Context.SmartLightMode;

public class Main {
    public static void main(String[] args) {
        // Named generally lightMode instead of specific lightMode (e.g. nightMode), because it can be changed
        SmartLightMode lightMode = new SmartLightMode(new NightMode());

        lightMode.applyLightingMode();

        lightMode.setLightingMode(new PartyMode());

        lightMode.applyLightingMode();

        lightMode.setLightingMode(new ReadingMode());

        lightMode.applyLightingMode();
    }
}
