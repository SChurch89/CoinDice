import java.util.Random;

public class CoinToss {
	
	static double coinToss() {
		Random toss = new Random(); 
		double result = toss.nextDouble();
		return result;
	}
	
	static String multipleCoins(int flips) {
		int numFlips = flips;
		System.out.println("Testing " + numFlips + " coin tosses.");
		double heads = 0;
		double tails = 0;
		String finalResult;
		for (int i = 0; i < numFlips; i++) {
			if(coinToss() >= 0.5) {
				System.out.println("Heads!");
				heads += 1;
			} else {
				System.out.println("Tails!");
				tails += 1;
			}
		}
		finalResult = stats(numFlips, heads, tails);
		return finalResult;
	}
	
	static String stats(int flips, double heads, double tails) {
		double numHeads = heads / flips;
		double numTails = tails / flips;
		
		int percentHeads = percentConvert(numHeads);
		int percentTails = percentConvert(numTails);
		
		String results = "Out of " + flips + " tosses, " + percentHeads + "% were heads and " + percentTails + "% were tails.";
		return results;
		
	}
	
	static int percentConvert(double base) {
		int percent = (int) (base * 100);
		return percent;
	}
}
