package com.example;

/**
 * Employee class sets up employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public class Address
{
    private int streetNum;
    private String streetName;
    private String city;
    private String zip;
    private String state;
    public Address(int streetNum, String streetName, String city, String zip, String state)
    {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.zip = zip;
        this.state = state;

    }
    /**
     * @param employeeIdSet sets the employees id
     */
    public void setStreetNum(int streetNumSet)
    {
        streetNum = streetNumSet;
    }
    /**
     * @return retrieves employee Id
     */
    public int getStreetNum()
    {
        return streetNum;
    }
    /**
     * @param employeeStatusSet sets status of employee
     */
    public void setStreetName(String streetNameSet)
    {
        streetName = streetNameSet;
    }
    /**
     * @return retrieves employee Id
     */
    public String getStreetName()
    {
        return streetName;
    }
    /**
     * @param employeePaySet sets employee's pay
     */
    public void setCity(String citySet)
    {
        city = citySet;
    }
    /**
     * @return retrieves employee Id
     */
    public String getCity()
    {
        return city;
    }
    /**
     * @param employeePaySet sets employee's pay
     */
    public void setZip(String zipSet)
    {
        zip = zipSet;
    }
    /**
     * @return retrieves employee Id
     */
    public String getZip()
    {
        return zip;
    }
    /**
     * @param employeePaySet sets employee's pay
     */
    public void setState(String stateSet)
    {
        state = stateSet;
    }
    /**
     * @return retrieves employee Id
     */
    public String getState()
    {
        return state;
    }
    public String toString()
    {
        String addressInfo =  streetNum +" " + streetName + " " + city + " " + state + " " + zip;
        return addressInfo;
    }
    
    
}

