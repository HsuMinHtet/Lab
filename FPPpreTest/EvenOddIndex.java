package FPPpreTest;

/*
 * Even Index, all of even index can be divided by both 2 and 3
 * Odd Index, all of odd index can be divided by 2 or 3.
 * */
public class EvenOddIndex {

	static int thirdAnswer(int[] a) {

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {// even
				if (a[i] % 2 != 0 || a[i] % 3 != 0)
					return 0;
			}
			if (i % 2 != 0) {// odd
				if (a[i] % 2 == 0 && a[i] % 3 == 0)
					return 0;
				if (a[i] % 2 != 0 && a[i] % 3 != 0)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(thirdAnswer(new int[] {36,2,24,9,36,12}));
		System.out.println(thirdAnswer(new int[] {36,2,24,9,36,2}));
	}

}
