package com.nifrasismail.prototype;

public class HourlyEmployee extends Employee {
    public HourlyEmployee(){
        empType = "Hourly Employee";
    }

    @Override
    void calculateSalary() {
        System.out.println("Hourly Employee Salary is $200/Hr");
    }
}

