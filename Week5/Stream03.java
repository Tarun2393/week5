package Week5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream03 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(new Integer[] { 13, 35, 46, 25, 62, 89 });

		String str = list.stream().map(i -> (i % 2) == 0 ? "e" + i : "o" + i).collect(Collectors.joining(","));

		System.out.println(str);
	}

}