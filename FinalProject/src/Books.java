
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Books extends Library {
    Scanner input = new Scanner(System.in);
    HashMap<String, String> books = new HashMap<>();





        // Build map of books that are in collection and use key to assign call numbers

        public Books() {
            books.put("E178.1", "Crime and Punishment");
            books.put("QC173.59", "Frankenstein");
            books.put("PS3556.33", "Memory");
            books.put("TK5105.875", "Jane Eyre");
            books.put("A192.4", "A Team of Rivals");
        }


    public String bookTitle = "";

    public String promptCallNumber() {
        System.out.println("Enter the call number: ");
        String callNumber = input.nextLine();
        return callNumber;

    }

    public void checkoutBook() {
        String key = promptCallNumber();
        String checkedOut = books.remove(key);
        System.out.println(checkedOut + " has been checked out.");

    }





    private String getBookTitle() {
        return (bookTitle);
    }

    protected void addBookPatron(){



    }

    static public void promptBook(){

    }

    public void catalogBook(){


    }
}
