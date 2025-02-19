package interview_program;

public class SmallAndLargeString {
    public static void main(String[] args) {
        String str= "vision without action is day dream";
        String[] arr=str.split(" ");
        String small=arr[0];
        String large=arr[0];
        for(int i=0;i<arr.length;i++){
         if(arr[i].length()>large.length()){
             large=arr[i];
         }
         else if(arr[i].length()<small.length()){
             small=arr[i];
         }

        }
        System.out.println(large);
        System.out.println(small);
    }
}
