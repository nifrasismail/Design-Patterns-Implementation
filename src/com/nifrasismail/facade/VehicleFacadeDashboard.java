package com.nifrasismail.facade;

/**
 * Created by nifras on 3/29/17.
 */
public class VehicleFacadeDashboard {
    VehicleParts engine;
    VehicleParts electricity;

    public VehicleFacadeDashboard(){
        engine = new Engine();
        electricity = new Electricity();
    }

    public void switchOn(){
        engine.start();
        electricity.start();

        engine.process();
        electricity.process();
    }

    public void switchOff(){
        electricity.stop();
        engine.stop();
    }
}
