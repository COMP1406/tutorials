import java.io.*;  
public class BunnyRead {  
  public static void main(String[] args) {  
    try {  
      Bunny bunny;
      ObjectInputStream in;  
      in = new ObjectInputStream(new FileInputStream("Bunny.dat"));  
      bunny =  in.readObject();  
      
      System.out.println(bunny);  
      in.close();  

    } catch (ClassNotFoundException e) {  
      System.out.println("Error: Object'c class does not match");  
 
    } catch (FileNotFoundException e) {  
      System.out.println("Error: Cannot open file for writing");  
    
    } catch (IOException e) {  
      System.out.println("Error: Cannot read from file");  
    }  
  }  
  
  
}  
