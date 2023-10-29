package FPPpreTest;

/*
 * Find the largest adjacent between digit of the argument by abstracting each(-), if equal return 0.
 * 		n		return
 * 		23187		7
 * 		908			8
 * 		55			0
 */
public class numLargestAdjacent {

	static int firstAnswer(int n) {
		int num = n, result = 0, mod = 0, largest = 0;

		while (num != 0) {
			mod = num % 10;
			if (result != 0) {
				result = Math.abs(result - mod);
				if (result == 0)
					return 0;
			}
			if (largest < result)
				largest = result;
			num = num / 10;
			result = mod;
		}
		return largest;
	}

	public static void main(String[] args) {
		System.out.println(firstAnswer(23187));
		System.out.println(firstAnswer(908));
		System.out.println(firstAnswer(55));

	}

}
