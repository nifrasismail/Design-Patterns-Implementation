package com.nifrasismail.facade;

public class Engine implements VehicleParts{

    @Override
    public void start() {
        System.out.println("Engine Start");
    }

    @Override
    public void process() {
        System.out.println("Engine on Process");
        System.out.println("Gears are swing");
        connectPetrolTank();
    }

    @Override
    public void stop() {
        System.out.println("Disconnect Process Start");
        System.out.println("Gears are Stopped");
        disconnectPetrolTank();
        System.out.println("Engine Stopped");
    }

    private void disconnectPetrolTank() {
        System.out.println("Petrol Flow Stopped");
        System.out.println("Disconnect to Petroll Tank");
    }

    void connectPetrolTank(){
        System.out.println("Connect to Petrol Tank");
        System.out.println("Petrol on Flow");
    }
}
