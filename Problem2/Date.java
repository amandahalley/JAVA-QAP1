package Problem2;

public class Date {
    private int day; //[0,23]
    private int month; //[0,23]
    private int year; //[0,59]

   //Constructor - initialize date
   public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
   } 

   //Getters - Return individual date components
   public int getDay() {
    return day;
   }

   public int getMonth() {
    return month;
   }

   public int getYear() {
    return year;
   }

   //Setters - Allow modification of individual date components
   public void setDay(int day) {
    this.day = day;
   }

   public void setMonth(int month) {
    this.month = month;
   }

   public void setYear(int year) {
    this.year = year;
   }

   //Set complete date
   public void setDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
   }

   //toString method - return date in given format
   public String toString() {
    return String.format("%02d/%02d/%04d", day, month, year);
   }


}

