package com.example;

/**
 * partTimeHourly class extends Employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   10/3/2022
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
     * @param basePaySet sets the employee's baseHourlyPay
     */
    public void setBaseHourlyPay(double basePaySet)
    {
        baseHourlyPay = basePaySet;
    }
    /**
     * @return retrieves baseHourlyPay of employee
     */
    public double getBaseHourlyPay()
    {
        return baseHourlyPay;
    }
    /**
     * @param displaySSN displays SSN depending if it is true or false
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
            System.out.println("Person Info: " + super.getFirstName() + " " + super.getLastName() + ", " + super.getAge() + " years old, " + super.getAddress() + ", " + super.getGender() + ", weight: " + super.getWeight() + " lbs, Base Pay: " + baseHourlyPay);
        }
    }
    /**
     * @param hrs inputs amnt of hrs worked
     * @return retrieves amnt payed depending on base pay and hrs worked
     */
    public Double computePay(int hrs)
    {
        return (hrs * baseHourlyPay);
    }
    /**
     * @return retrieves employee's info
     */
    public String toString()
    {
        String personInfo =  super.toString() + ", Base Pay: " + baseHourlyPay;
        return personInfo;
    }
    
}

