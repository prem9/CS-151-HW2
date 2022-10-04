package com.example;

/**
 * Employee class sets up employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public class fullTimeHourly extends fullTimeEmployee
{
    private Double overtimePay = 0.0;
    
    
    fullTimeHourly()
    {
        
    }
    
    fullTimeHourly(String firstName, String lastName, int age, String sSN, Address address, String gender, double d)
    {
        super(firstName, lastName, age, sSN, address, gender, d);
    }
    /**
     * @param employeeIdSet sets the employees id
     */
    public void setOvertimePay(double overtimePaySet)
    {
        overtimePay = overtimePaySet;
    }
    /**
     * @return retrieves employee Id
     */
    public double getOvertimePay()
    {
        return overtimePay;
    }
    
    
    public String toString()
    {
        String personInfo =  super.toString() + ", Overtime Pay: " + overtimePay;
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
            System.out.println("Person Info: " + super.getFirstName() + " " + super.getLastName() + ", " + super.getAge() + " years old, " + super.getAddress() + ", " + super.getGender() + ", weight: " + super.getWeight() + " lbs, Overtime Pay: " + overtimePay);
        }
    }
    public Double computePay(int numHrs)
    {
        double pay = (super.getBasePay() * numHrs) + overtimePay;
        return pay;
    }
    
}

