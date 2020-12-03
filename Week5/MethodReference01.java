package Week5;

import java.util.ArrayList;
import java.util.List;

public class MethodReference01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Rick");
		list.add("Negan");
		list.add("Daryl");
		list.add("Glenn");
		list.add("Carl");

		list.forEach(System.out::println);

	}

}