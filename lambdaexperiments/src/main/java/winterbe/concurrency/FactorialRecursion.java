package winterbe.concurrency;

/**
 * Factorial using recursion
 * 
 * @author mulshankar13
 *
 */
public class FactorialRecursion {

	public static void main(String[] args) {
		System.out.println(calcFact(4));
	}

	public static double calcFact(int num) {

		if (num == 1)
			return 1;
		else
			return num * calcFact(num - 1);
	}
}
