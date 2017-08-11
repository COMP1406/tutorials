import java.util.Scanner;

public class Read{
 
  public static void main(String[] args){
    
    // name of the file we want to read from
    // declare it outside of try so that we have access to it in the catch blocks
    String dataFile = "example.txt";
    
    try{
      //
      // add all your code in this try block
      //
      
      
      // in will be used to read data from datafile
      BufferedReader in = new BufferedReader( new FileReader(dataFile) );
      
      // read a line from the file
      String input = in.readLine();

      // close the input file (this is important to always do)
      in.close();
      
      
      System.out.println("what was the first line in the file? (using BufferedReader)");
      if( input == null ){
        System.out.println("there was no line in the file!");
      }else{
        System.out.println("is was \"" + input + "\"");
      }
      
    }catch(FileNotFoundException e){
      // FileReader constructor might throw this exception
      System.err.println("Error: file \"" + dataFile + "\" does not exist"); 
      
    }catch(IOException e){
      // readLine() method might throw this exception
      System.err.println("Error: something bad happened reading" + dataFile); 
    }
    
    
    //
    // try it again with Scanner
    //
    
    try{ 
      
      Scanner in = new Scanner( new FileReader(dataFile) );
      
      String input = null;
      // read a line from the file
      if( in.hasNext() ){
        input = in.next();
      } 
      // close the input file (this is important to always do)
      in.close();
      
      
      System.out.println("what was the first line in the file? (using Scanner)");
      if( input == null ){
        System.out.println("there was no line in the file!");
      }else{
        System.out.println("is was \"" + input + "\"");
      }
      
    }catch(FileNotFoundException e){
      // FileReader constructor might throw this exception
      System.err.println("Error: file \"" + dataFile + "\" does not exist"); 
      
    }catch(IOException e){
      // readLine() method might throw this exception
      System.err.println("Error: something bad happened reading" + dataFile); 
    }
    
    
  }  
}