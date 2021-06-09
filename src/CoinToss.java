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
		System.out.println("Testing 5 coin tosses.");
		for (int i = 0; i < 5; i++) {
			if(coinToss() >= 0.5) {
				System.out.println("Heads!");
			} else {
				System.out.println("Tails!");
			}
		}
	}
}
