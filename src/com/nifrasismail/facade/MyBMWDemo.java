package com.nifrasismail.facade;

public class MyBMWDemo {
    public static void main(String[] args) {
        VehicleFacadeDashboard dashboard = new VehicleFacadeDashboard();
        dashboard.switchOn();
        System.out.println("###################################################");
        System.out.println("Travel MODE");
        System.out.println("###################################################");
        dashboard.switchOff();
    }
}
