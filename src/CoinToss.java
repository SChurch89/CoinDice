import java.util.Random;

public class CoinToss {
	
	public static void main(String[] args) {
		
		if(coinToss() >= 0.5) {
			System.out.println("Heads!");
		} else {
			System.out.println("Tails!");
		}
	}
	
	static double coinToss() {
		Random toss = new Random(); 
		double result = toss.nextDouble();
		return result;
	}
}
