package AirConditional;

public class Aircondition {
    public boolean isSwitchedOff;
    private int temperatureControl;

    public void Aircondition() {
        int defaultTemperture = 24;
        temperatureControl = defaultTemperture;

    }
    public boolean switchButtonOn() {
        isSwitchedOff = !isSwitchedOff;
        return isSwitchedOff;
    }
}

