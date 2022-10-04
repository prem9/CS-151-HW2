package com.example;

/**
 * Employee class sets up employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
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
     * @param employeeIdSet sets the employees id
     */
    public void setBonus(Double bonuSet)
    {
        yearlyBonus = bonuSet;
    }
    /**
     * @return retrieves employee Id
     */
    public Double getBasePay()
    {
        return yearlyBonus;
    }
    /**
     * @param employeeIdSet sets the employees id
     */
    public void setCompensation(Double compensationSet)
    {
        yearlyCompensation = compensationSet;
    }
    /**
     * @return retrieves employee Id
     */
    public Double getCompensation()
    {
        return yearlyCompensation;
    }
    public Double computePay()
    {
        return yearlyCompensation + yearlyBonus;
    }
    
    public String toString()
    {
        String personInfo =  super.toString() + ", Yearly Bonus Pay: " + yearlyBonus + "Yearly Compensation" + yearlyCompensation;
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
            System.out.println("Person Info: " + super.getFirstName() + " " + super.getLastName() + ", " + super.getAge() + " years old, " + super.getAddress() + ", " + super.getGender() + ", weight: " + super.getWeight() + " lbs, yearly bonus: " + yearlyBonus + ", yearly compensation" + yearlyCompensation);
        }
    }
    
}

