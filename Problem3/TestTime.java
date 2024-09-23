package Problem3;

public class TestTime {
    public static void main(String[] args) {

        //Create 2 object and set values, initialize with default values
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        //Set time for both objects
        t1.setTime(22, 15, 20);
        t2.setTime(10, 20, 30);

        //Display initial time
        System.out.println("\nThe Time Class");
        System.out.println("\nInitial Times:");
        System.out.println("Time 1 = " + t1);
        System.out.println("Time 2 = " + t2);

        //call nextSecond() for t1 and previousSecond() for t2

        t1.nextSecond();
        t2.previousSecond();

        //Display new times after modification

        System.out.println("\nTime after modifications: ");
        System.out.println("Time 1 (next second) = " + t1);
        System.out.println("Time 2 (previous second) = " + t2); 
    }
}
