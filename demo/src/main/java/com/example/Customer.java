package com.example;

/**
 * Employee class sets up employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public class Customer extends Person
{
    private int customerId;
    private String payPreference;
    

    
    Customer(String firstName, String lastName, int age, int sSN, Address address, String gender, float weight)
    {
        super(firstName, lastName, age, sSN, address, gender, weight);
    }
    /**
     * @param employeeIdSet sets the employees id
     */
    public void setCustomerId(int customerIdSet)
    {
        customerId = customerIdSet;
    }
    /**
     * @return retrieves employee Id
     */
    public int getCustomerId()
    {
        return customerId;
    }
    /**
     * @param employeeStatusSet sets status of employee
     */
    public void setPayPreference(String paypreferenceSet)
    {
        payPreference = paypreferenceSet;
    }
    /**
     * @return retrieves employee Id
     */
    public String getPayPreference()
    {
        return payPreference;
    }
    
    public String toString()
    {
        String personInfo =  super.toString() + ", Customer Id: " + customerId + ", Pay Preference: " + payPreference;
        return personInfo;
    }
    
}

