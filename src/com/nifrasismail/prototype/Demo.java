package com.nifrasismail.prototype;

/**
 * Created by nifras on 3/29/17.
 */
public class Demo {
    public static void main(String[] args) {
        EmployeeCache.loadEmployeeDatabaseCache();

        Employee employee1 = (Employee) EmployeeCache.getEmployee("EMP_FIX");
        System.out.println("Employee : " + employee1.getEmpType());

        Employee employee2 = (Employee) EmployeeCache.getEmployee("EMP_HOUR");
        System.out.println("Employee : " + employee2.getEmpType());

        Employee employee3 = (Employee) EmployeeCache.getEmployee("EMP_SHARE");
        System.out.println("Employee : " + employee3.getEmpType());

    }
}
