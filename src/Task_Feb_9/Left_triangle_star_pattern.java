package Task_Feb_9;

public class Left_triangle_star_pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
