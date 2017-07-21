import java.util.Random;
import java.util.Calendar;

/** COMP 1006/1406 Tutorial Material
    <p>
		Testing program for the Amimal, Cat and Dog classes.
        
	  @version 1.0
	 */

public class AnimalApp{
	/** number of animals in collection */
	public static final int SIZE = 5;

	/** a collection of names for generating random animals */
	public static String[] names = {"Fluffy", "Tiger", "Spot", 
	    "Bubbles", "Dodger", "Ace", "Flower", "Tiny", "Pip"};
	
	
	public static void main(String[] args){
		Random rnd = new Random();
		
		/* get the current year based on computer's clock */
	  Calendar now = Calendar.getInstance();   
		int year = now.get(Calendar.YEAR);  
		System.out.println("The year is " + year);
		
		/* some animals */
		Animal[] animals = new Animal[SIZE];

		/* randonly pick a cat or dog */
		for(int i=0; i<SIZE; i+=1){
			if(Math.random() < 0.5){
				animals[i] = new Cat( names[rnd.nextInt(names.length)],                      rnd.nextInt(12) + 2);
			}else{
				animals[i] = new Dog( names[rnd.nextInt(names.length)],                      rnd.nextInt(14) + 2);
			}
		}
	
		for(Animal animal: animals){
			System.out.print(animal + " ... ");
			System.out.println(animal.noise());
		}
	}


}