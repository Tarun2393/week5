package Week5;

@FunctionalInterface
interface Operation {
	boolean check(int a);
}

public class Lambda02 {

	public static void main(String[] args) {

		Operation odd = (int n) -> (n % 2) != 0;

		Operation prime = (int n) -> {
			for (int i = 2; i < n; i++) {
				if ((n % i) == 0) {
					return false;
				}
			}
			return true;
		};

		Operation palindrome = (int n) -> {

			String number = Integer.toString(n);

			String reverse = new StringBuilder(number).reverse().toString();

			return number.equals(reverse);
		};

		System.out.println(Lambda02.checker(odd, 2));
		System.out.println(Lambda02.checker(odd, 7));

		System.out.println(Lambda02.checker(prime, 7));
		System.out.println(Lambda02.checker(prime, 8));

		System.out.println(Lambda02.checker(palindrome, 1234));
		System.out.println(Lambda02.checker(palindrome, 1881));
	}

	public static boolean checker(Operation o, int num) {
		return o.check(num);
	}
}