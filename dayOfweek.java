//Write a Java program to input the day of the week number (1-7)
//and print the name of the day using a switch statement. 
//The program should keep asking the user for input until they enter a sentinal value that is less than 1.

import java.util.Scanner;

public class dayOfweek{
    public static void main(String s[]){
        int day;
        Scanner id = new Scanner(System.in);
        System.out.print("Please enter a day of the week (1-7) or 0 to stop: ");
        while ((day = id.nextInt()) != 0){
            switch(day){
                case 1:
                System.out.println("Sunday");
                System.out.println("Please enter a day of the week (1-7) or 0 to stop:");
                break;
                case 2:
                System.out.println("Monday");
                System.out.println("Please enter a day of the week (1-7) or 0 to stop:");
                break;
                case 3:
                System.out.println("Tuesday");
                System.out.println("Please enter a day of the week (1-7) or 0 to stop:");
                break;
                case 4:
                System.out.println("Wednesday");
                System.out.println("Please enter a day of the week (1-7) or 0 to stop:");
                break;
                case 5:
                System.out.println("Thursday");
                System.out.println("Please enter a day of the week (1-7) or 0 to stop:");
                break;
			    case 6:
                System.out.println("Friday");
                System.out.println("Please enter a day of the week (1-7) or 0 to stop:");
                break;
			    case 7:
                System.out.println("Saturday");
                System.out.println("Please enter a day of the week (1-7) or 0 to stop:");
                break;
            }
            
        }
        id.close();
    }             
}
           
    
