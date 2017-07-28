package prime10001;

import java.util.*;

public class Prime10001 {
	public static void main(String[] args) {
		int primeToFind = 10001;
		ArrayList<Integer> alPrimes = new ArrayList<>();
		alPrimes.add(1);

		// For each number starting with the last found prime + 1
		for (int i = alPrimes.get(alPrimes.size() - 1) + 1; i > 0; i++) {
			if (isItPrime(i)) {
				alPrimes.add(i);

				if (alPrimes.size() == primeToFind) {
					System.out.println("Prime #" + primeToFind + " is " + alPrimes.get(primeToFind - 1));
					break;
				}
			}
		}
	}

	private static boolean isItPrime(int i) {
		// Initialize the return boolean assuming we have a prime
		boolean ret = true;

		// For each number from 2 up to half of the number being considered
		for (int j = 2; j <= (i / 2); j++) {

			// Check to see if i divides evenly by j
			if (i % j == 0) {
				// If it does, we don't have a prime and can leave the loop
				ret = false;
				break;
			}
		}

		// Return the answer
		return ret;
	}
}
