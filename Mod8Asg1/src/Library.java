import java.util.Scanner;

public class Library {
    Scanner scanner = new Scanner(System.in);
    int choice;

    // Use switch statement to get input

    // function to show menu

    public void showMenu() {
        do {
            System.out.println("MENU");
            System.out.println("1. Check out Book");
            System.out.println("2. Create new patron");
            System.out.println("3. Show patron's balance");
            System.out.println("4. Add book to system");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");


        // validate input

        if(scanner.hasNextInt()) {
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Prompt for Call Number
                    // Validate entry


                    // end case 1

                case 2:
                    // prompt for new patron's name and birthday

                    // end case 2

                case 3:
                    // prompt for patron's name
                    // calculate balance
                    // display balance

                    // end case 3

                case 4:
                    // prompt for book's title
                    // assign call number

                case 5:
                    // terminate program

                    // invalid selection case
                default:
                    System.out.println("/nInvalid option.");


            }
        }
        else{
                System.out.println("/nInvalid input. Please enter a valid selection./n");
                scanner.next();
                choice = 0;

            }


    } while(choice != 4);


}
}



