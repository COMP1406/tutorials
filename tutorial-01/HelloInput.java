/**
 * COMP1006/1406 - Summer 2017
 * Tutorial #1 
 * Example of simple user input using Scanner
 * 
 * M. Jason Hinek, July 2017
 */


/* import the Scanner class */
import java.util.Scanner;


public class HelloInput{
  
  public static void main(String[] args){
 
    /* declare variable */
    Scanner keyboardScanner;   
    
    /* create the Scanner object to read from the
     * keyboard. System.in is the standard input
     * which is the keyboard                        */
    keyboardScanner = new Scanner(System.in);
    
    /* variables to remember input */
    String input; 
    int    number;
    
    /* keep reading user input until "end" is entered */
    do{
      System.out.print("Enter a single word and then return : ");
      input = keyboardScanner.next();
      
      System.out.print("Enter a number and then return :");
      number = keyboardScanner.nextInt();
      
      System.out.println("You entered : " + input + "," + number);
    }while( !input.equals("end") );
    
      
  } // end main method
  
} // end class HelloInput