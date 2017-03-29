package com.nifrasismail.prototype;

import java.util.Objects;

/**
 * Created by nifras on 3/29/17.
 */
public abstract class Employee implements Cloneable{
    private String empId;
    protected String empType;

    abstract void calculateSalary();

    public String getEmpId() {
        return empId;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return clone;
    }
}
