package Week5;

import java.util.Arrays;
import java.util.List;

public class Stream04 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(new Integer[] { 13, 35, 46, 25, 62, 89 });

		Double average = list.stream().mapToInt(i -> i).average().getAsDouble();

		System.out.printf("The average is %.2f%n", average);

	}

}