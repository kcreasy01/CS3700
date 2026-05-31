import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AverageTest {
    @Test
    void avgTests(){
        var average = new Average();
        double num1, num2, num3;
        // test for the average of 2, 3, and 4 to be 3
        assertEquals(3, average.calcAvg(2,3,4));



    }
    @Test
    void avgTest2(){
        var average = new Average();
        double num1, num2, num3;
        // test for the average of 22, 212, and 309 to be 181
        assertEquals(181, average.calcAvg(22,212,309));
    }
    @Test
    void avgTest3() {
        var average = new Average();
        double num1, num2, num3;
        // test for the average of 0, 0, 0 to be 0
        assertEquals(0, average.calcAvg(0, 0, 0));
    }
}