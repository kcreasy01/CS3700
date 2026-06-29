public class Fly extends Insects implements Speak{
    // Override makeNoise method from Speak interface
    @Override
    public void makeNoise() {
        System.out.println("The fly says BZZZZZ!!");
    }

}
