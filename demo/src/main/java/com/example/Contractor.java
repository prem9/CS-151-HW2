package com.example;

/**
 * Employee class sets up employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public class Contractor extends Employee
{
    private Double basePay = 0.0;
    
    
    Contractor()
    {
        
    }
    
    Contractor(String firstName, String lastName, int age, String sSN, Address address, String gender, double d)
    {
        super(firstName, lastName, age, sSN, address, gender, d);
    }
    /**
     * @param employeeIdSet sets the employees id
     */
    public void setBasePay(double basePaySet)
    {
        basePay = basePaySet;
    }
    /**
     * @return retrieves employee Id
     */
    public double getBasePay()
    {
        return basePay;
    }
    
    
    public String toString()
    {
        String personInfo =  super.toString() + ", Base Pay: " + basePay;
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
            System.out.println("Person Info: " + super.getFirstName() + " " + super.getLastName() + ", " + super.getAge() + " years old, " + super.getAddress() + ", " + super.getGender() + ", weight: " + super.getWeight() + " lbs, Base Pay: " + basePay);
        }
    }
    public Double computePay(int numHrs)
    {
        double pay = basePay * numHrs;
        return pay;
    }
}

