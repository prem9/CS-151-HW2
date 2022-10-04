package com.example;

/**
 * Contractor class extends Employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   10/3/2022
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
     * @param basePaySet sets the base pay
     */
    public void setBasePay(double basePaySet)
    {
        basePay = basePaySet;
    }
    /**
     * @return retrieves base pay
     */
    public double getBasePay()
    {
        return basePay;
    }
    
    /**
     * @return returns person info with base pay
     */
    public String toString()
    {
        String personInfo =  super.toString() + ", Base Pay: " + basePay;
        return personInfo;
    }
    /**
     * @param displaySSN tells whether to display SSN or not
     */
    public void introduce(boolean displaySSN) 
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
    /**
     * @param numHrs sets num of hrs worked
     * @return returns amnt payed
     */
    public Double computePay(int numHrs)
    {
        double pay = basePay * numHrs;
        return pay;
    }
}

