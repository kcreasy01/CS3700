import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Declare first and second integer variables
    int x = 0;
    int y = 0;


    // Assign input to choice variable.
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
        // Display menu
        IO.println("1: Enter two (2) numbers (x and y). ");
        IO.println("2: Print all numbers between x and y. ");
        IO.println("3: Find the average of all numbers between x and y. ");
        IO.println("4: Find all prime numbers between x and y. ");
        IO.println("5: Exit");

        // Prompt user for choice.
        IO.println("Please enter the number of your choice: ");
        choice = scanner.nextInt();


// Begin do-while statement to repeat menu until user exits.


        if (choice == 1) {
            IO.println("Enter a number: ");
            x = scanner.nextInt();

            // Prompt for second number.
            IO.println("Enter a number: ");
            y = scanner.nextInt();

            // If x is not greater than y, swap them.

            if (x > y){
                int temp = x;
                x = y;
                y = temp;
            }

        } else if (choice == 2) {
            // while x is less than or equal to y, print x.
            for (int count = x+1; count < y; count++)
                IO.println(count);
        } else if (choice == 3) {
            // Declare variables counter and sum to calculate average.

            int counter = 0;
            double sum = 0;
            // Declare double variable avg.


            while (x <= y) {
                counter++;
                sum += x;
                x += 1;

            }
            // Calculate average and display result.
            double avg = (sum / counter);
            IO.println(String.format("Average: " + avg));

        }
        // for loop to display prime numbers
        else if (choice == 4) {

            for (int count = x; count <= y; count++) {
                boolean isPrime = true;
                // check for divisors
                for(int i = 2; i <= Math.sqrt(count); i++){
                    if(count % i == 0){
                        isPrime = false;
                        break;

                    }


                    }
                if (isPrime) {
                    System.out.println(count);
                }
                    {

                    }


                }




            }


        // If choice is 5, exit program
        else if (choice == 5) {
            int status = 0;
            System.exit(status);
        }
        // End do-while statement

    } while (choice > 0 && choice <= 5);
}


















