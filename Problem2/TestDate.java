package Problem2;

public class TestDate {
    public static void main(String[] args) {
        
        //create date object
        Date initalDate = new Date (17, 9, 2024);

        //print initial date using toString()
        System.out.println("\nThe Date Class");
        System.out.println("\nInitial date: " + initalDate);

        //modify date using setters
        initalDate.setDay(10);
        initalDate.setMonth(2);
        initalDate.setYear(2027);

        //print modified date
        System.out.println("Updated date: " + initalDate);

        //set date using setDate
        initalDate.setDate(10,10,2030);

        //print set date
        System.out.println("Final set date: " + initalDate);

    }

    
}
