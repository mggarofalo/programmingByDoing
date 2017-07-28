package sumSquareDifference;
import java.util.*;

public class SumSquareDifference {
	public static void main(String[] args) {
		List<Integer> alNums = new ArrayList<>();
		
		for (int i=1;i<=100;i++) {
			alNums.add(i);
		}
		
		int sum = 0;
		int sumSquare = 0;
		
		for (int num : alNums) {
			sum += num;
		}
		
		for (int num : alNums) {
			sumSquare += (num * num);
		}
		
		System.out.println("The sum of the numbers 1 through 100 is " + sum);
		System.out.println("The sum of the squares of the numbers 1 through 100 is " + sumSquare);
		System.out.println("The difference between them is " + (sumSquare - sum));
	}
}