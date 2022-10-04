package com.example;

/**
 * Employee class sets up employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public class partTimeHourly extends Employee
{
    private Double baseHourlyPay = 0.0;
    
    
    partTimeHourly()
    {
        
    }
    
    partTimeHourly(String firstName, String lastName, int age, String sSN, Address address, String gender, double d)
    {
        super(firstName, lastName, age, sSN, address, gender, d);
    }
    /**
     * @param employeeIdSet sets the employees id
     */
    public void setBaseHourlyPay(double basePaySet)
    {
        baseHourlyPay = basePaySet;
    }
    /**
     * @return retrieves employee Id
     */
    public double getBaseHourlyPay()
    {
        return baseHourlyPay;
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
            System.out.println("Person Info: " + super.getFirstName() + " " + super.getLastName() + ", " + super.getAge() + " years old, " + super.getAddress() + ", " + super.getGender() + ", weight: " + super.getWeight() + " lbs, Base Pay: " + baseHourlyPay);
        }
    }
    public Double computePay(int hrs)
    {
        return (hrs * baseHourlyPay);
    }
    public String toString()
    {
        String personInfo =  super.toString() + ", Base Pay: " + baseHourlyPay;
        return personInfo;
    }
    
}

