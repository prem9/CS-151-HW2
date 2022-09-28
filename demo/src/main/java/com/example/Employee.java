package com.example;

/**
 * Employee class sets up employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public class Employee extends Person
{
    private int employeeId;
    private String employeeStatus;
    private String employeePay;

    Employee(String firstName, String lastName, int age, int sSN, String address, String gender, float weight)
    {
        super(firstName, lastName, age, sSN, address, gender, weight);
    }
    /**
     * @param employeeIdSet sets the employees id
     */
    public void setEmployeeId(int employeeIdSet)
    {
        employeeId = employeeIdSet;
    }
    /**
     * @return retrieves employee Id
     */
    public int getEmployeeId()
    {
        return employeeId;
    }
    /**
     * @param employeeStatusSet sets status of employee
     */
    public void setEmployeeStatus(String employeeStatusSet)
    {
        employeeStatus = employeeStatusSet;
    }
    /**
     * @return retrieves employee Id
     */
    public String getEmployeeStatus()
    {
        return employeeStatus;
    }
    /**
     * @param employeePaySet sets employee's pay
     */
    public void setEmployeePay(String employeePaySet)
    {
        employeePay = employeePaySet;
    }
    /**
     * @return retrieves employee Id
     */
    public String getEmployeePay()
    {
        return employeePay;
    }
    /**
     * @param time provides time worked
     * @return gives the pay calculated depending on the time and salary
     */
    public double calculatePay(String time)
    {
       
        double salary = Double.parseDouble(employeePay.replaceAll("[^0-9]", ""));
        double totalPay = 0;
        double timeInt = Double.parseDouble(time.replaceAll("[^0-9]", ""));
        
        if (employeePay.contains("hr"))
        {
            totalPay = salary * timeInt;
        }
        else if (employeePay.contains("yr"))
        {
            totalPay = (salary * timeInt)/52;
            
        }
        totalPay = totalPay * 100;
        totalPay = Math.round(totalPay);
        totalPay = totalPay/100;
        return totalPay;
    }
    /**
     * @return prints out all the employee's info
     */
    
    public String toString()
    {
        String personInfo =  super.toString() + ", Employee Id: " + employeeId + ", Employee Status: " + employeeStatus + ", Employee Salary: " + employeePay;
        return personInfo;
    }
    /**
     * @return introduces employee
     */
    @Override
    public void introduce()
    {
        //String introducePerson = "";
        
        System.out.println(toString());
    }
    
}

