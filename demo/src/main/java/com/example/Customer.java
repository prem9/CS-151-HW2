package com.example;

/**
 * Customer class extends Person
 * @author  Prem Agarwal
 * @version 1.0
 * @since   10/3/2022
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
     * @param customerIdSet sets the customer's id
     */
    public void setCustomerId(int customerIdSet)
    {
        customerId = customerIdSet;
    }
    /**
     * @return retrieves customer's Id
     */
    public int getCustomerId()
    {
        return customerId;
    }
    /**
     * @param paypreferenceSet sets payPreference of customer
     */
    public void setPayPreference(String paypreferenceSet)
    {
        payPreference = paypreferenceSet;
    }
    /**
     * @return retrieves pay preference
     */
    public String getPayPreference()
    {
        return payPreference;
    }
    /**
     * @return retrieves customer's info without ssn
     */
    public String toString()
    {
        String personInfo =  "Person Info: " + super.getFirstName() + " " + super.getLastName() + ", " + super.getAge() + " years old," + super.getAddress() + ", " + super.getGender() + ", weight: " + super.getWeight() + " lbs, Customer Id: " + customerId + ", Pay Preference: " + payPreference;
        return personInfo;
    }
    public void introduce() 
    {
        String introducePerson = toString();
        System.out.print(introducePerson);
    }
    public void makePayment()
    {
        System.out.println("Preferred Payment Method: " + payPreference);
    }
    
}

