package com.example;

/**
 * Employee class extends Person
 * @author  Prem Agarwal
 * @version 1.0
 * @since   10/3/2022
 */
public class Employee extends Person
{
    private int employeeId = 0;
    private String educationLevel = "educationLevel";
    private boolean directDeposit = false;

    Employee()
    {

    }
    Employee(String firstName, String lastName, int age, String sSN, Address address, String gender, double weight)
    {
        super(firstName, lastName, age, sSN, address, gender, weight);
    }
    /**
     * @param employeeIdSet sets the employees id
     */
    public void setID(int employeeIdSet)
    {
        employeeId = employeeIdSet;
    }
    /**
     * @return retrieves employee Id
     */
    public int getID()
    {
        return employeeId;
    }
    /**
     * @param employeeStatusSet sets status of employee
     */
    public void setEducation(String educationLevelSet)
    {
        educationLevel = educationLevelSet;
    }
    /**
     * @return retrieves employee Id
     */
    public String getEducation()
    {
        return educationLevel;
    }
    /**
     * @param employeePaySet sets employee's pay
     */
    public void setDirectDeposit(Boolean depositSet)
    {
        directDeposit = depositSet;
    }
    /**
     * @return retrieves employee Id
     */
    public Boolean getDirectDeposit()
    {
        return directDeposit;
    }
    
    public String toString()
    {
        String personInfo =  super.toString() + ", Employee Id: " + employeeId + ", Employee Education: " + educationLevel + ", Employee Direct Deposit: " + directDeposit;
        return personInfo;
    }
    
    
}

