package FPPpreTest;

/*
 * The positive integer can be the sum of square value 50=25+25=5^2+5^2 
 * and 50=1+49=1^2+7^2. 
 * The the positive integer value will test to be the sum of square value 
 * in two different ways.
 */
public class SumSquareTwoWay {

	static int secondAnswer(int n) {
		int square1 = 0, square2 = 0, sum = 0, count = 0;
		if (n < 0)
			return -1;
		else {
			int end = (int) Math.floor(Math.sqrt(n));
			for (int i = 1; i <= end; i++) {
				square1 = i * i;
				for (int j = 1; j <= end; j++) {
					square2 = j * j;
					sum = square1 + square2;
					if (sum == n)
						count++;
				}
				if (count == 2)
					return 1;
			}
			return 0;
		}

	}

	public static void main(String[] args) {
		System.out.println(secondAnswer(50));

	}

}
