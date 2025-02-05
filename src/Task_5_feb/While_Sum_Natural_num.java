package Task_5_feb;

public class While_Sum_Natural_num {
    public static void main(String[] args){
        int n=1,sum=0;
        while(n<=10){
            sum+=n;
            n++;
        }
        System.out.println("sum of first 10 natural numbers = "+sum);
    }
}
