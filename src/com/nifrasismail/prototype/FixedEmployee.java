package com.nifrasismail.prototype;

public class FixedEmployee extends Employee {
    public FixedEmployee(){
        empType = "Fixed Employee";
    }

    @Override
    void calculateSalary() {
        System.out.println("Fixed Employee Salary is $ 20,000");
    }
}
