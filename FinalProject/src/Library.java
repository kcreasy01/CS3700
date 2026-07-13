import java.awt.print.Book;

public class Library{
    Patrons patron = new Patrons();

    Library(){




    }

    // method to show menu
    public void showMenu(){
        System.out.println("1. Add new patron");
        System.out.println("2. Check out book");
        System.out.println("3. Show patron information");
        System.out.println("4. Catalog new book");


    }

    public void selection(String choice) {
        switch(choice) {
            case "1" -> patron.enterPatronName();
            case "2" -> Books.checkoutBook();
            case "3" -> patron.showPatronInfo();
            case "4" -> Books.catalogBook();
            default -> System.out.println("Invalid Input"); // Or keep throwing the exception
        }
    }



    }




