package com.example;

/**
 * fullTimeSalaried class extends fullTimeEmployee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   10/3/2022
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
     * @return employee's info
     */
    public String toString()
    {
        String personInfo =  super.toString();
        return personInfo;
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
            System.out.println("Person Info: " + super.getFirstName() + " " + super.getLastName() + ", " + super.getAge() + " years old, " + super.getAddress() + ", " + super.getGender() + ", weight: " + super.getWeight() + " lbs");
        }
    }
    /**
     * @param numWeeks inputs amnt of weeks employee worked
     * @return retrieves amnt of pay depending of base pay and num of weeks worked
     */
    public Double computePay(int numWeeks)
    {
        double pay = (super.getBasePay() * numWeeks * 40) ;
        return pay;
    }
    
}

