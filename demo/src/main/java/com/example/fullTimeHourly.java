package com.example;

/**
 * Employee class sets up employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   10/3/2022
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
     * @param overtimePaySet sets the employee's overtimePay
     */
    public void setOvertimePay(double overtimePaySet)
    {
        overtimePay = overtimePaySet;
    }
    /**
     * @return retrieves employee's Pay
     */
    public double getOvertimePay()
    {
        return overtimePay;
    }
    
    /**
     * @return retrieves employee's info
     */
    public String toString()
    {
        String personInfo =  super.toString() + ", Overtime Pay: " + overtimePay;
        return personInfo;
    }
    /**
     * @param displaySSN displays SSN if true doesn't if false with personInfo
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
            System.out.println("Person Info: " + super.getFirstName() + " " + super.getLastName() + ", " + super.getAge() + " years old, " + super.getAddress() + ", " + super.getGender() + ", weight: " + super.getWeight() + " lbs, Overtime Pay: " + overtimePay);
        }
    }
    /**
     * @param numHrs inputs amnt of hrs employee worked
     * @return retrieves amnt of pay the employee gets
     */
    public Double computePay(int numHrs)
    {
        double pay = (super.getBasePay() * numHrs) + overtimePay;
        return pay;
    }
    
}

