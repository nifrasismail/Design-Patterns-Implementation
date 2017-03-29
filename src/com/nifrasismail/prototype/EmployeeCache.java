package com.nifrasismail.prototype;

import java.util.Hashtable;

public class EmployeeCache {
    private static Hashtable<String, Employee> map = new Hashtable<String, Employee>();

    public static Employee getEmployee(String empId){
        Employee cacheEmployee = map.get(empId);
        return (Employee)cacheEmployee.clone();
    }

    public static void loadEmployeeDatabaseCache(){
        FixedEmployee fixedEmployee = new FixedEmployee();
        fixedEmployee.setEmpId("EMP_FIX");
        map.put(fixedEmployee.getEmpId(),fixedEmployee);

        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.setEmpId("EMP_HOUR");
        map.put(hourlyEmployee.getEmpId(),hourlyEmployee);

        ShareHolderEmployee shareHolderEmployee = new ShareHolderEmployee();
        shareHolderEmployee.setEmpId("EMP_SHARE");
        map.put(shareHolderEmployee.getEmpId(),shareHolderEmployee);
    }
}
