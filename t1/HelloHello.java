/**
 * COMP1006/1406 - Summer 2017
 * Tutorial #1 
 * Example program that uses command line arguments
 * 
 * M. Jason Hinek, July 2017
 * 
 * A simple program that uses a single command line argument 
 * (which should represent an integer) to print "Hello, World!" 
 * multiple times (including zero). If there is no command line 
 * argument given it defaults to print the message once.
 * 
 * Using DrJava: Hit the compile button to compile, then in the 
 * Interactions window, type
 * 
 *  java HelloHello [num]
 * 
 * Using cmd.exe (windows) or terminal (mac)
 * Compilation: javac HelloHello.java
 * Usage      : java HelloHello [num]
 * 
 * Note: Square brackets, as used above, denote optional input.
 *       This is standard notation when using the command line
 *       (in Linux/Unix for example).
 *
 * Examples: (run in the interaction window of DrJava, or a shell)
 * 
 * > java HelloHello
 * Hello, World!
 * 
 * > java HelloHello 3
 * Hello, World!
 * Hello, World!
 * Hello, World!
 * 
 * > java HelloHello 0
 * 
 */


public class HelloHello{
  
  public static void main(String[] args){
 
    /* defult number of time to print the message */
    int num = 1;
    
    /* update number of times to print message if a command 
     * line argument is present */
    if( args.length > 0 ){
      num = Integer.parseInt(args[0]);
    }
    
    /* print out the message num times */
    for(int i=0; i<num; i+=1){
      System.out.println("Hello, World!");
    } 
    
  } // end main method
  
} // end class HelloWorld