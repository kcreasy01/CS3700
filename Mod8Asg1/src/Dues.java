// subclass to maintain Dues
public class Dues extends Library{

    //create constant for daily late charge
    private double LATE_CHARGE = 0.10;
    // create dueTotal variable to keep track of a patron's dues
    public double dueTotal = 0;



    // method to calculate total
    private double calculateTotal(){
        // dueTotal = daysLate * LATE_CHARGE;
        return dueTotal;

    }

}

