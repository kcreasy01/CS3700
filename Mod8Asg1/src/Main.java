class Student {
    // create static counter variable
    public static int studentCounter = 0;

    String name = "";
    // Replace age field with DateOfBirth object.
    DateOfBirth birthdate;




    String email = "";
    String phoneNumber = "";
    String stage = "";
    String[] courses;

    // Create method to set a Date


    // create fully parameterized constructor
    public Student(String studentName, String email, String phoneNumber,
                   String stage, String[] courses) {
        this.name = studentName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.stage = stage;
        this.courses = courses;

        // increment student counter
        studentCounter++;




        // set birthdates of students
        DateOfBirth.setBirth(1, 4, 2026);
        DateOfBirth.setBirth(9, 19, 1986);
        DateOfBirth.setBirth(12, 31, 1995);





    }


    // create method to print each student's info

    public void printMe(){
        String message = "Student Name: " + name + "\n" + "Date of Birth: " +  "\n" + "Email Address: " + email + "\n" + "Phone Number: " +
                phoneNumber + "\n" + "Stage: " + stage + "\n" + "Courses: " ;
        System.out.println(message + Arrays.toString(courses));
    }

}


void main() {
    // create first student using constructor
    Student firstStudent = new Student("Jane Smith", "jsmith@gmail.com",
            "311-255-7000", "3rd", new String[]{"CS3700", "PH3000", "CS4500"});

    // create second student using constructor
    Student secondStudent = new Student("Bruce Banner", "bbanner@gmail.com", "311-555-7101",
            "4th", new String[]{"CS3700", "MA2500", "MA2700", "CS1500"});

    // create third student using constructor
    Student thirdStudent = new Student("Wanda Maximoff", "wmaximoff@gmail.com", "311-555-2777",
            "2nd", new String[]{"CS3700", "MA2500", "MA2700", "CS1500", "CS3000"});



    // print each student's information
    System.out.println();
    firstStudent.printMe();
    System.out.println();
    secondStudent.printMe();
    System.out.println();
    thirdStudent.printMe();

    // print number of students
    System.out.println("No. of students: " + Student.studentCounter);
}

