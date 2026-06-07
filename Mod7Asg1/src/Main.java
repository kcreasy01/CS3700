class Student {
  String name = "";
  int age = 0;
  String email = "";
  String phoneNumber = "";
  String stage = "";
  String[] courses;


  // create fully parameterized constructor
  public Student(String studentName, int age, String email, String phoneNumber,
                 String stage, String[] courses) {
    this.name = studentName;
    this.age = age;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.stage = stage;
    this.courses = courses;


  }
  // create method to print each student's info

  public void printMe(){
    String message = "Student Name: " + name + "\n" + "Age: " + age + "\n" + "Email Address: " + email + "\n" + "Phone Number: " +
            phoneNumber + "\n" + "Stage: " + stage + "\n" + "Courses: " ;
    System.out.println(message + Arrays.toString(courses));
  }

}



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  // create first student using constructor
  Student firstStudent = new Student("Jane Smith", 18, "jsmith@gmail.com",
          "311-255-7000", "3rd", new String[]{"CS3700", "PH3000", "CS4500"});

  // create second student using constructor
  Student secondStudent = new Student("Bruce Banner", 20, "bbanner@gmail.com", "311-555-7101",
         "4th", new String[]{"CS3700", "MA2500", "MA2700", "CS1500"});

  // create third student using constructor
  Student thirdStudent = new Student("Wanda Maximoff", 19, "wmaximoff@gmail.com", "311-555-2777",
          "2nd", new String[]{"CS3700", "MA2500", "MA2700", "CS1500", "CS3000"});

  // print each student's information
  System.out.println();
  firstStudent.printMe();
  System.out.println();
  secondStudent.printMe();
  System.out.println();
  thirdStudent.printMe();
}
