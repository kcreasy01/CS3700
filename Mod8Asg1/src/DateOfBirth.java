public class DateOfBirth {
    public static int month;
    private static int day;
    private static int year;

    public static void setMonth(int newMonth){

        month = newMonth;
    }

    public static void setDay(int newDay){

        day = newDay;
    }

    public static void setYear(int newYear){

        year = newYear;
    }

    // Create Date method to set new birthdate
    public static void setBirth(int newMonth, int newDay, int newYear){
        setMonth(newMonth);
        setDay(newDay);
        setYear(newYear);
    }



}
/*Update your code from the Module 7 Assignment: Objects, Final Variables, and Constructors such that it does the following:
Create a DateOfBirth class and replace the age property in the Student class with a DateOfBirth object (using composition).
Update the Student constructor so it receives a DateOfBirth object along with the other properties and initializes all fields.
Add a static counter variable in the Student class that increments each time a new student is created.
Implement one (1) or more static methods (e.g., to return or display the total number of created students).
Create three (3) Student objects with different course counts and use printMe to display their full info.
Submit a link to your assignment repository below*/