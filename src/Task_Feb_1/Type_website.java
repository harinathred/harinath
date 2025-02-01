package Task_Feb_1;

import java.util.Scanner;

public class Type_website {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the website URL: ");
        String url = scanner.nextLine().toLowerCase(); // Convert to lowercase to handle case insensitivity

        // Extracting the domain extension
        String[] parts = url.split("\\."); // Split URL by "."
        String domainExtension = parts[parts.length - 1]; // Get the last part

        // Determine website type based on the domain extension
        String websiteType = "Unknown or other types of websites"; // Default type

        switch(domainExtension) {
            case "com":
                websiteType = "Commercial website";
                break;
            case "org":
                websiteType = "Non-profit organization";
                break;
            case "edu":
                websiteType = "Educational institution";
                break;
            case "gov":
                websiteType = "Government website";
                break;
            case "net":
                websiteType = "Network-related website";
                break;
            case "info":
                websiteType = "Informational website";
                break;
            default:
                // If it doesn't match any of the above, we keep the default type
                break;
        }

        // Output the result
        System.out.println("The website type is: " + websiteType);

        scanner.close();
    }
    }

