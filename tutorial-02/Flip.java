/** basic biased coin flip */

import java.util.Random;

public class Flip{
	
	public static void main(String[] args){
		double bias = 0.5;  // 50% heads, 50% tails
		boolean ok = true;
		if(args.length == 1){
			try{
				bias = Double.parseDouble(args[0]);
			}catch(Exception e){
				System.out.println("command line argument must be a number");
				ok = false;
			}
		}
		if(ok){
			System.out.print("bias is " + bias);
		}
	}
}

