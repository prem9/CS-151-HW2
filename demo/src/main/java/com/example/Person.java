package com.example;

/**
 * Person Class initializes the person
 *
 * @author  Prem Agarwal
 * @version 1.0
 * @since   8/25/22
 */
public class Person 
{
    private String lastName;
    private String firstName;
    private int age;
    private int sSN;
    private String address;
    private String gender;
    private float weight;
    public Person(String firstName2, String lastName2, int age2, int sSN2, String address2, String gender2, float weight2) 
    {
        this.firstName = firstName2;
        this.lastName = lastName2;
        this.age = age2;
        this.sSN = sSN2;
        this.address = address2;
        this.gender = gender2;
        this.weight = weight2;
    }
    /**
     * @param setLastName the last name which sets the lastName of Person
     */
    public void setLastName(String setLastName)
    {
        lastName = setLastName;
    }
    /**
     * @return the last name of the Person it is set to
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * @param setFirstName sets the first name of the Person
     */
    public void setFirstName(String setFirstName)
    {
        firstName = setFirstName;
    }
    /**
     * @return firstName of the person
     */
    public String getFirstName()
    {
        return firstName;
    }
    /**
     * @param setAge sets the age of the person
     */
    public void setAge(int setAge)
    {
        age = setAge;
    }
    /**
     * @return gives the age of the person
     */
    public int getAge()
    {
        return age;
    }
    /**
     * @param d sets the SSN of the person
     */
    public void setSSN(int d)
    {
        sSN = d;
    }
    /**
     * @return retrives the ssn of the person
     */
    public int getsSN()
    {
        return sSN;
    }
    /**
     * @param addressString sets the address of the  person
     */
    public void setAddress(String addressString)
    {
        address = addressString;
    }
    /**
     * @return retrieves person's address
     */
    public String getAddress()
    {
        return address;
    }
    /**
     * @param genderSet sets gender of the person
     */
    public void setGender(String genderSet)
    {
        gender = genderSet;
    }
    /**
     * @return retreives gender of the person
     */
    public String getGender()
    {
        return gender;
    }
    /**
     * @param weightSet sets the weight of the person
     */
    public void setWeight(Float weightSet)
    {
        weight = weightSet;
    }
    /**
     * @return returns weight of the person
     */
    public float getWeight()
    {
        return weight;
    }
    /**
     *  @return person info as well as student info of the person
     */
    public String toString()
    {
        String personInfo = "Person Info: " + firstName + " " + lastName + ", " + age + " years old, SSN: " + sSN + ", " + address + ", " + gender + ", weight: " + weight + " lbs";
        return personInfo;
    }
    /**
     * @return introduces the person
     */
    public void introduce() //incomplete
    {
        String introducePerson = toString();
        System.out.print(introducePerson);
    }

}

