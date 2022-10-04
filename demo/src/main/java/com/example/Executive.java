package com.example;

/**
 * Executive class extends Employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   10/3/2022
 */
public class Executive extends Employee
{
    private Double yearlyBonus = 0.0;
    private Double yearlyCompensation = 0.0;
    
    Executive()
    {
        
    }
    
    Executive(String firstName, String lastName, int age, String sSN, Address address, String gender, double d)
    {
        super(firstName, lastName, age, sSN, address, gender, d);
    }
    /**
     * @param bonusSet sets the yearlyBonus of executive
     */
    public void setBonus(Double bonusSet)
    {
        yearlyBonus = bonusSet;
    }
    /**
     * @return retrieves executive yearly bonus
     */
    public Double getBonus()
    {
        return yearlyBonus;
    }
    /**
     * @param compensationSet sets the executive's yearlyCompensation
     */
    public void setCompensation(Double compensationSet)
    {
        yearlyCompensation = compensationSet;
    }
    /**
     * @return retrieves executive's yearly compensation
     */
    public Double getCompensation()
    {
        return yearlyCompensation;
    }
    /**
     * @return retrieves amnt payed for the year
     */
    public Double computePay()
    {
        return yearlyCompensation + yearlyBonus;
    }
    /**
     * @return retrieves executive's info
     */
    public String toString()
    {
        String personInfo =  super.toString() + ", Yearly Bonus Pay: " + yearlyBonus + "Yearly Compensation" + yearlyCompensation;
        return personInfo;
    }
    /**
     * @param displaySSN makes sure whether SSN is displayed or not
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
            System.out.println("Person Info: " + super.getFirstName() + " " + super.getLastName() + ", " + super.getAge() + " years old, " + super.getAddress() + ", " + super.getGender() + ", weight: " + super.getWeight() + " lbs, yearly bonus: " + yearlyBonus + ", yearly compensation" + yearlyCompensation);
        }
    }
    
}

