import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class Patrons extends Library {

    String lastName;
    String fullName;
    ArrayList<String> patrons = new ArrayList<>();
    HashMap<String, String> checkedOut = new HashMap<>();


    public Patrons() {

        patrons.add("Matthew Wilkes");
        patrons.add("Hope Lovelace");
        patrons.add("Jennifer Valentine");

        // map patrons to null where null will be replaced with books checked out
        checkedOut.put("Matthew Wilkes", null);
        checkedOut.put("Hope Lovelace", null);
        checkedOut.put("Jennifer Valentine", null);
    }

    // create scanner for user input
    Scanner input = new Scanner(System.in);


    // Create list to hold patrons


    // method to add a new patron
    void setPatron(List<String> patrons, String value) {
        patrons.add(value);


    }

    String getPatron() {
        return (lastName);
    }

    public void enterPatronName(){
        System.out.println("Enter first and last name of patron: ");
        fullName = input.nextLine();
        setPatron(patrons, fullName);


    }

    public void nameSearch(){
        if(patrons.contains(lastName))
            Books.promptBook();

    }

    public void showPatronInfo(){
        System.out.println("Patron Name: ");
        for (String patrons : patrons) {
            System.out.println(patrons);
        }

        System.out.println("Book checked out: ");
        for (String patrons : patrons) {
            System.out.println(patrons);
        }

    }
}