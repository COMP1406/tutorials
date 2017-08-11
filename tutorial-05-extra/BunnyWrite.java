import java.io.*; 

public class BunnyWrite {  
  public static void main(String args[]) {  
    try {  
      Bunny bunny = new Bunny("Sam", 12);  
      ObjectOutputStream out;  
      out = new ObjectOutputStream(new FileOutputStream("Bunny.dat"));  
      out.writeObject(bunny);  
      out.close();  
    
    } catch (FileNotFoundException e) {  
      System.out.println("Error: Cannot open file for writing");  
    
    } catch (IOException e) {  
      System.out.println("Error: Cannot write to file");  
    }  
  }
  
}