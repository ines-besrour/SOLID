package com.directi.training.isp.exercise_refactored;

import java.util.Random;

public class Sensor
{
    public void register(IProximity proximity)
    {
        while (true) {
            if (isPersonClose()) {
                proximity.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
