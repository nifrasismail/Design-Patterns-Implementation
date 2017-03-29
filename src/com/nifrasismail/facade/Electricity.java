package com.nifrasismail.facade;

public class Electricity implements VehicleParts {
    @Override
    public void start() {
        System.out.println("Electricity Process Start");
    }

    @Override
    public void process() {
        connectToBattery();
        System.out.println("Electricity on Flow");
        System.out.println("Light Signal Passes");
    }

    @Override
    public void stop() {
        disconnectToBattery();
        System.out.println("Electricity Disconnected");
    }

    private void connectToBattery(){
        System.out.println("Connect to Battery");
    }

    private void disconnectToBattery(){
        System.out.println("Disconnected from Battery");
    }
}
