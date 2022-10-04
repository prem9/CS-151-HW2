package com.example;

/**
 * Employee class sets up employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public class Customer extends Person
{
    private int customerId = 0;
    private String payPreference = "payPreference";
    
    Customer()
    {

    }
    
    Customer(String firstName, String lastName, int age, String i, Address address, String gender, double d)
    {
        super(firstName, lastName, age, i, address, gender, d);
    }
    /**
     * @param employeeIdSet sets the employees id
     */
    public void setCustomerId(int customerIdSet)
    {
        customerId = customerIdSet;
    }
    /**
     * @return retrieves employee Id
     */
    public int getCustomerId()
    {
        return customerId;
    }
    /**
     * @param employeeStatusSet sets status of employee
     */
    public void setPayPreference(String paypreferenceSet)
    {
        payPreference = paypreferenceSet;
    }
    /**
     * @return retrieves employee Id
     */
    public String getPayPreference()
    {
        return payPreference;
    }
    
    public String toString()
    {
        String personInfo =  "Person Info: " + super.getFirstName() + " " + super.getLastName() + ", " + super.getAge() + " years old," + super.getAddress() + ", " + super.getGender() + ", weight: " + super.getWeight() + " lbs, Customer Id: " + customerId + ", Pay Preference: " + payPreference;
        return personInfo;
    }
    public void introduce() //incomplete
    {
        String introducePerson = toString();
        System.out.print(introducePerson);
    }
    public void makePayment()
    {
        System.out.println("Preferred Payment Method: " + payPreference);
    }
    
}

