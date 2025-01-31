package Task30;

public class Check_Leap_Not {
    public static void main(String[] args) {
        int year = 2024;
        Boolean Is_leap = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            Is_leap = true;
            System.out.println("Is_Leap_year=" + Is_leap);
        } else {
            System.out.println("Is_Leap_year=" + Is_leap);
        }
    }
}
