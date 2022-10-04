package com.example;

/**
 * fullTimeEmployee class extends Employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   10/3/2022
 */
public class fullTimeEmployee extends Employee
{
    private Double basePay = 0.0;
    
    
    fullTimeEmployee()
    {
        
    }
    
    fullTimeEmployee(String firstName, String lastName, int age, String sSN, Address address, String gender, double d)
    {
        super(firstName, lastName, age, sSN, address, gender, d);
    }
    /**
     * @param basePaySet sets the employee's basePay
     */
    public void setBasePay(double basePaySet)
    {
        basePay = basePaySet;
    }
    /**
     * @return retrieves employee's basePay
     */
    public double getBasePay()
    {
        return basePay;
    }
    
    /**
     * @return retrieves employee's info
     */
    public String toString()
    {
        String personInfo =  super.toString() + ", Base Pay: " + basePay;
        return personInfo;
    }
    /**
     * @param displaySSN displays SSN if true doesn't if false
     */
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
    
}

