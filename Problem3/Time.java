package Problem3;

public class Time {
    private int hour; //[0,23]
    private int minute; // [0, 23]
    private int second; // [0, 59]


    //Constructor .. initialize time
    public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
    }


    //Getters .. return individual time components
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }


    //Setters .. allow modification of indivial time components

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second; 
    }

    //Set conplete time
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //increment time by 1 second method
    public Time nextSecond(){
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    //decrement time by 1 second method 
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if(hour < 0 ) {
                    hour = 23;
                }

            }
        }
        return this;
    }

    //Return time in given format
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
}
