package com.example;

/**
 * Employee class sets up employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public class fullTimeSalaried extends fullTimeEmployee
{
    
    
    fullTimeSalaried()
    {
        
    }
    
    fullTimeSalaried(String firstName, String lastName, int age, String sSN, Address address, String gender, double d)
    {
        super(firstName, lastName, age, sSN, address, gender, d);
    }
    /**
     * @param employeeIdSet sets the employees id
     */
    
    
    
    public String toString()
    {
        String personInfo =  super.toString();
        return personInfo;
    }
    public void introduce(boolean displaySSN) //incomplete
    {
        if (displaySSN)
        {
            String introducePerson = toString();
            System.out.println(introducePerson);
        }
        else
        {
            System.out.println("Person Info: " + super.getFirstName() + " " + super.getLastName() + ", " + super.getAge() + " years old, " + super.getAddress() + ", " + super.getGender() + ", weight: " + super.getWeight() + " lbs");
        }
    }
    public Double computePay(int numWeeks)
    {
        double pay = (super.getBasePay() * numWeeks * 168) ;
        return pay;
    }
    
}

