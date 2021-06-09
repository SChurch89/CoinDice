import java.util.Random;

public class CoinToss {
	
	public static void main(String[] args) {
		multipleCoins();
	}
	
	static double coinToss() {
		Random toss = new Random(); 
		double result = toss.nextDouble();
		return result;
	}
	
	static void multipleCoins() {
		int numFlips = 5;
		System.out.println("Testing " + numFlips + " coin tosses.");
		double heads = 0;
		double tails = 0;
		for (int i = 0; i < 5; i++) {
			if(coinToss() >= 0.5) {
				System.out.println("Heads!");
				heads += 1;
			} else {
				System.out.println("Tails!");
				tails += 1;
			}
		}
		stats(numFlips, heads, tails);
	}
	
	static void stats(int flips, double heads, double tails) {
		double numHeads = heads / flips;
		double numTails = tails / flips;
		
		int percentHeads = percentConvert(numHeads);
		int percentTails = percentConvert(numTails);
		
		System.out.println("Out of " + flips + " tosses, " + percentHeads + "% were heads and " + percentTails + "% were tails.");
		
	}
	
	static int percentConvert(double base) {
		int percent = (int) (base * 100);
		return percent;
	}
}
