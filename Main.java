//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Import class scanner for input from user

import java.util.Scanner;





void main() {

    // Declare integer operands x and y.
    int x = 0;
    int y = 0;
    // Declare integer for result of each operation.
    int z;

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    // Prompt user for operands to perform operations on.
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an operand: ");
    x = input.nextInt();

    System.out.print("Enter an operand: ");
    y = input.nextInt();

    // Perform addition and output result.

    z = x + y;
    System.out.println(x+" + "+y + " = " + z);

    // Perform subtraction and output result.
    z = x - y;
    System.out.println(x+" - "+y + " = " + z);

    // Perform multiplication and output result.

    z = x * y;
    System.out.println(x+" * "+y + " = " + z);

    // Perform division and output result.

    z = x / y;
    System.out.println(x+" / "+y + " = " + z);




    }

