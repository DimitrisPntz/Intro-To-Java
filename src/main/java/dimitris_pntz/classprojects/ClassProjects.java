/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dimitris_pntz.classprojects;

/**
 *
 * @author dimit
 */

import java.util.Scanner;

public class ClassProjects {
    
    // Method to calculate the area of a right-angled triangle
    static double RATA(double Length, double Width){
        return 0.5 * (Length * Width);
    }
    
    // Method to calculate the area of a non-right-angled triangle
    static double NonRATA(double Length, double Width, double Angle){
        return 0.5 * (Length * Width) * Math.sin(Math.toRadians(Angle)); // Convert Angle to radians
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for Width and Length
        System.out.println("Enter the Width: ");
        double Width = scanner.nextDouble();
        
        System.out.println("Enter the Length: ");
        double Length = scanner.nextDouble();
        
        // Display area of right-angled triangle
        System.out.println("The Area of the right-angled triangle: " + RATA(Length, Width));
        
        // Ask for Angle for non-right-angled triangle
        System.out.println("Enter the Angle in degrees: ");
        double Angle = scanner.nextDouble();
        
        // Display area of non-right-angled triangle
        System.out.println("The Area of the non-right-angled triangle: " + NonRATA(Length, Width, Angle));
        
        // Consume the remaining newline after nextDouble()
        scanner.nextLine();
        
        // User Validation for Date input
        while(true){
            System.out.println("Enter a date in dd/mm/yyyy format: ");
            String Date = scanner.nextLine();
            
            int day;
            int month;
            int year;
            
            // Check if the input contains exactly 2 slashes and 3 parts
            String[] DateInfo = Date.split("/");
            if (DateInfo.length == 3) {
                try {
                    day = Integer.parseInt(DateInfo[0].trim());
                    month = Integer.parseInt(DateInfo[1].trim());
                    year = Integer.parseInt(DateInfo[2].trim());
                    
                    // Validate month
                    if (month < 1 || month > 12) {
                        System.out.println("Invalid Month!");
                        continue;
                    }
                    
                    // Validate day
                    if (day < 1 || day > 31) {
                        System.out.println("Invalid Day!");
                        continue;
                    }
                    
                    // Basic validation passed
                    System.out.println("This is a valid date!");
                    break;
                    
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format in date.");
                }
            } else {
                System.out.println("Date format is incorrect. Please use dd/mm/yyyy.");
            }
        }
        
        // Phone number validation
        System.out.println("Enter a Phone Number: ");
        String Number = scanner.nextLine();
        
        char[] Numbers = Number.toCharArray();
        boolean ValidNumber = true;
        
        // Validate each character in the phone number
        for (int i = 0; i < Number.length(); i++) {
            try {
                int var = Integer.parseInt(String.valueOf(Numbers[i]));
            } catch (Exception e) {
                // Allow only digits, +, - (and optionally, you can allow spaces, parentheses, etc.)
                if (!(String.valueOf(Numbers[i]).equals("+") || String.valueOf(Numbers[i]).equals("-"))) {
                    ValidNumber = false;
                    break;
                }
            }
        }
        
        if (ValidNumber) {
            System.out.println("Valid phone number: " + Number);
        } else {
            System.out.println("Invalid phone number!");
        }
    }   
}