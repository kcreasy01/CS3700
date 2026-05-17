//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class OverloadDemo{
    public static void main() {
        // Declare variable for single parameter method.
        int demo1num = 5;
        // Declare variables for double parameter method to find average.
        double demo2num1 = 7;
        double demo2num2 = 7;
        // Declare variables for three parameter method to find max.
        int demo3num1 = 3;
        int demo3num2 = 9;
        int demo3num3 = 7;

        // Call multiUse with 1 parameter to count from 1 to the parameter.
        multiUse(demo1num);
        // Call multiUse with 2 parameters to find the average of the two.
        multiUse(demo2num1, demo2num2);
        // Call multiUse with 3 parameters to find the highest of the three numbers.
        multiUse(demo3num1, demo3num2, demo3num3);

    }

    public static void multiUse(int num){
        for(int i = 1; i <=num; i++){
            System.out.println(i);
        }
    }
    // End multiUse single parameter declaration
    public static void multiUse(double num, double num2){
        double avg = (double) (num + num2) / 2;
        System.out.println("Avg: " + avg);
    }
    // End multiUse double parameter declaration
    public static void multiUse(int num, int num2, int num3){
        int max = num;
        if (num < num2){
            max = num2;

        }
        if (max < num3){
            max = num3;
        }
        System.out.println("Max: " + max);

    }
    // End multiUse three parameter declaration


}



