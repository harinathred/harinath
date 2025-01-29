public class leapyear {
    public static void main(String[] args){
        int year=2024;
        boolean isleapyear=false;
        if((year%4==0 && year%100!=0) || (year%400==0)){
            isleapyear=true;
        }
        if(isleapyear){
            System.out.println("is a leap year");
        }
        else {
            System.out.println("is not a year");
        }
    }
}
