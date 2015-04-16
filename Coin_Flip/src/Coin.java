import acm.program.*;
import acm.util.*;

public class Coin extends ConsoleProgram {
	
	public void run(){
		int k = 2;
		String x = rgen.nextBoolean() ? "Heads" : "Tails";
		println(x);
		String y = rgen.nextBoolean() ? "Heads" : "Tails";
		println(y);
		
		while(true){
			String coinflipnext = rgen.nextBoolean() ? "Heads" : "Tails";
			println(coinflipnext);
			k += 1;
			
			if(coinflipnext.equals("Heads") && coinflipnext.equals(y) && coinflipnext.equals(x)) break;
			x = y;
			y = coinflipnext; 
			
		}
		println("It took " + k + " flips to get 3 consecutive heads!");
	}
	RandomGenerator rgen = RandomGenerator.getInstance();
}
