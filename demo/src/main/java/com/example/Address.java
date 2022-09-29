package com.example;

/**
 * Employee class sets up employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public class Address extends Person
{
    private int employeeId;
    private String educationLevel;
    private boolean directDeposit;

    Address(int string, String lastName, int age, int sSN, String address, String gender, float weight)
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

