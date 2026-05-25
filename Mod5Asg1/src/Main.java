//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


void main() {
    // Create 1st input matrix
  int [] [] a;
  a = new int [2] [2];

    //Create 2nd input matrix
  int [] [] b;
  b = new int [2] [2];

   // Create result input matrix
  int [] [] res;
  res = new int [2][2];
  // Declare object matrix to accept input
  Scanner matrix = new Scanner(System.in);


  System.out.println("Enter matrix a elements: ");
  // for loop to get rows input
  for (int i = 0;  i < 2; i++) {
    // for loop to get columns input
      for(int k = 0; k < 2; k++){
        a[i][k] = matrix.nextInt();
  }
  }
// prompt user for elements of the second matrix.
  System.out.println("Enter matrix b elements: ");
  // for loop to get rows input
  for (int i = 0;  i < 2; i++) {
    // for loop to get columns input
    for(int k = 0; k < 2; k++){
      b[i][k] = matrix.nextInt();
    }
  }




  // advance for loop to calculate resulting multiplication matrix
  int rIndex = 0;
  for (int[] t : a) {
    int cIndex = 0;

    for(int[] u : b){
      res[rIndex][cIndex] = t[0] * b[0][cIndex] + t[1] * b[1][cIndex];
      cIndex++;
    }
    rIndex++;
  }
  // enhanced for loop to print matrix.
for (int[] t: res){
  for (int element : t){
    System.out.print(element + " ");
  }
  System.out.println();
}






}

