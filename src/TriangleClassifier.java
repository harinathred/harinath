public class TriangleClassifier {
    public static void main(String[] args){
        int s1=20,s2=20,s3=20;
        if (s1==s2 && s2==s3){
            System.out.println("equilateral triangle");
        } else if (s1==s2 || s2==s3 ) {
            System.out.println("isosclense triangle");
        }
        else {
            System.out.println("scalence triangle");
        }
    }
}
