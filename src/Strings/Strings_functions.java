package Strings;

import java.util.Arrays;

public class Strings_functions {
    public static void main(String[] args){
        String n1="harinath";
        String n2="harinath reddy";

        //1.charAt
        System.out.println(n1.charAt(3)); //output:-i
        //2.
        // 2. concat()
        System.out.println(n1.concat(" Patel")); //harinath Patel

        // 3. contains()
        System.out.println(n2.contains("harinath")); //true

       // 4. equals()
        System.out.println(n1.equals("harinath")); //true

        // 5. equalsIgnoreCase()
        System.out.println(n2.equalsIgnoreCase("harinath"));

        // 6. indexOf()
        System.out.println(n1.indexOf('o'));//h

        // 7. length()
        System.out.println(n2.length()); //14

        // 8. replace( , )
        System.out.println(n2.replace('a', 'A')); //hArinAth reddy

        // 9. split()

        String name4 = "Sonal Harish";
        String[] split = name4.split(" ");
        System.out.println(Arrays.toString(split));
        System.out.println(split[0]);
        System.out.println(split[1]);

        // 10. substring( , )
        System.out.println(n1.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println(n2.toUpperCase());

        // 13. replaceAll()
      System.out.println(n2.replaceAll(" ", " Harish "));

        // 14. startsWith()
        System.out.println(n1.startsWith("h"));

        // 15. endsWith()
        System.out.println(n2.endsWith("y"));

        // 16. isEmpty()
        System.out.println(n2.isEmpty());

        // 17. trim()
        String name3 = "    Sonal Harish     ";
        System.out.println(name3.trim());

        // 18. compareTo()
        System.out.println(n1.compareTo("harinath"));

        // 19. compareToIgnoreCase()
        System.out.println(n1.compareToIgnoreCase("harinath"));

        // 20. lastIndexOf()
        System.out.println(n1.lastIndexOf("a"));

        // 21. repeat()
        System.out.println(n2.repeat(2));

    }
}
