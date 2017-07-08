/* COMP 1006/1406 - Summer 2016 - Tutorial 1
 * 
 * Compile and run the program to see what goes wrong.
 * 
 */
public class Bugs2{
   
  /** main method that is the program */
  public static void main(String[] args){
    
    /* declare and allocate memory for an array of Strings */
    String[] words = new String[4];
    
    /* print out the length of the array */
    System.out.println("words has length = " + words.length);
    
    /* iterate over the array and print out some information        */
    /* Note: we combine strings with + (the concatenation operator) */
    for(int i=0; i<words.length; i += 1){
      System.out.println(words[i] + " has length = " + words[i].length());
    }
  }
  
}