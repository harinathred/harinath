package patterns;

public class patterns_1 {
    public static void main(String[] args){
        int n=5,f=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(f+" ");
                f++;
            }
            System.out.println();
        }
    }
}
