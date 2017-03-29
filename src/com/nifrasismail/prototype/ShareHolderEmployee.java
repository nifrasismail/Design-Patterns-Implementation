package com.nifrasismail.prototype;

public class ShareHolderEmployee extends Employee{
    public ShareHolderEmployee(){
    empType = "Share Holder Employee";
}

    @Override
    void calculateSalary() {
        System.out.println("Share Holder Employee Salary is $ 2% of the monthly sales");
    }
}
