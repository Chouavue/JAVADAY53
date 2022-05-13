
public class CounterMain {
    
    public static void main (String[] args){

        Counter counter1 = new Counter ();
        System.out.println( counter1);

        counter1.Increase();
        System.out.println("Increase " + counter1);

        counter1.Decrerase();
        System.out.println("Decrease " + counter1);

        counter1.increaseBy(5);
        System.out.println("Increase By " + counter1);

        counter1.decreaseBy(-6);
        System.out.println("Decrease By " + counter1);

    }
}
