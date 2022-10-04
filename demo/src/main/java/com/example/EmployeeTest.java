package com.example;


/**
 * EmployeeTest tests out all the other classes
 * @author  Prem Agarwal
 * @version 1.0
 * @since   10/3/2022
 */
public class EmployeeTest 
{
    /**
     * Rigorous Test :-)
     */
    
    public static void main(String args[])
    {
        //Base Customer class without any inputs
        Customer Base = new Customer();
        System.out.println(Base.toString());
        System.out.println();

        //Customer class with stuff setted
        Address joeAddress = new Address(2547, "Good Fellow Ave.", "San Jose", "95123", "california");
        Customer Joe = new Customer("Joe", "Smith", 46, "123456431", joeAddress, "Male", 134.0);
        Joe.setPayPreference("Credit");
        Joe.setCustomerId(12341234);
        System.out.println(Joe.toString());
        System.out.println();

        //Contracter without inputs
        Contractor Base1 = new Contractor();
        Base1.introduce(false);
        System.out.println(Base1.computePay(6));
        System.out.println();

        //Contracter with inputs
        Address jimAddress = new Address(2567, "1st Ave.", "San Jose", "95412", "california");
        Contractor Jim = new Contractor("Jim", "Dill", 23, "354361546", jimAddress, "male", 154.2);
        Jim.setBasePay(86.34);
        Jim.setDirectDeposit(true);
        Jim.setEducation("College level");
        Jim.setID(561562346);
        Jim.introduce(true);
        System.out.println("amount payed for 6 hrs: " + Jim.computePay(6));
        System.out.println();
        

        //fulltime Employee without inputs
        fullTimeEmployee base2 = new fullTimeEmployee();
        System.out.println(base2.toString());
        System.out.println();

        //fullTime Employee with inputs
        Address marAddress = new Address(6835, "2nd Str.", "San Jose", "52356", "california");
        fullTimeEmployee Margaret = new fullTimeEmployee("Margaret", "Thatcher", 54, "23462367", marAddress, "female", 128.3);
        Margaret.setID(146123657);
        Margaret.setBasePay(713.4);
        Margaret.setDirectDeposit(false);
        Margaret.setEducation("College level");
        Margaret.introduce(false);
        System.out.println();

        //part time hourly without inputs
        partTimeHourly base3 = new partTimeHourly();
        base3.introduce(true);
        System.out.println("amount payed for 56 hrs: " + base3.computePay(56));
        System.out.println();

        //part time hourly with inputs
        Address jillAddress = new Address(7524, "3rd Str", "San Jose", "36783", "California");
        partTimeHourly Jill = new partTimeHourly("Jill", "Valentine", 36, "3568383567", jillAddress, "female", 133.7);
        Jill.setBaseHourlyPay(16.6);
        Jill.setID(902567824);
        Jill.setEducation("Highschool level");
        Jill.setDirectDeposit(true);
        System.out.println("Pay for 16 hrs: " + Jill.computePay(16));
        Jill.introduce(true);
        System.out.println();

        //Executive without inputs
        Executive base4 = new Executive();
        System.out.println("Amount payed: " + base4.computePay());
        base4.introduce(true);
        System.out.println();

        //Executive with inputs
        Address joesephAddress = new Address(5277, "5th Str", "San Jose", "78905", "california");
        Executive Joeseph = new Executive("Joeseph", "Joestar", 64, "892346789789", joesephAddress, "male", 145.7);
        Joeseph.setID(34678902);
        Joeseph.setEducation("Highschool level");
        Joeseph.setDirectDeposit(false);
        Joeseph.setBonus(789.7);
        Joeseph.setCompensation(537804.55);
        System.out.println("Amnt payed this year: " + Joeseph.computePay());
        Joeseph.introduce(true);

        //Full Time Salaried without inputs
        fullTimeSalaried base5 = new fullTimeSalaried();
        System.out.println("Amnt Payed" + base5.computePay(4));
        base5.introduce(false);
        System.out.println();

        //full time salaried with inputs
        Address jolynAddress = new Address(3478, "10th STreet", "city", "54789", "California");
        fullTimeSalaried Jolyne = new fullTimeSalaried("Jolyne", "Kujo", 20, "7890789054", jolynAddress, "female", 128.5);
        Jolyne.setID(54789052);
        Jolyne.setEducation("Highschool Level");
        Jolyne.setDirectDeposit(true);
        Jolyne.setBasePay(784.6);
        Jolyne.introduce(false);
        System.out.println("total pay: " + Jolyne.computePay(5));
        System.out.println();

        //full time hourly without inputs
        fullTimeHourly base6 = new fullTimeHourly();
        System.out.println("Amnt Payed: " + base6.computePay(64));
        base6.introduce(true);
        System.out.println();

        //fulltime hourly with inputs
        Address robertAddress = new Address(5478, "11th street", "New York", "78908", "New York");
        fullTimeHourly Robert = new fullTimeHourly("Robert", "Speedwagon", 65, "58979854", robertAddress, "male", 155.4);
        Robert.setID(789078904);
        Robert.setEducation("Doctorate");
        Robert.setDirectDeposit(true);
        Robert.setBasePay(300.45);
        Robert.setOvertimePay(200.45);
        Robert.introduce(true);
        System.out.println(Robert.computePay(45));

    }
}
