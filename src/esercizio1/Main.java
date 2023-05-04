package esercizio1;

public class Main {

	public static void main(String[] args) {
		String testString = "Hello World!?";
		int testYear = 1700;
		System.out.println(evenAndOddString(testString));
		System.out.println(leapYear(testYear));

	}

	static boolean evenAndOddString(String string) {
		int charCount = 0;
		for (int i = 0; i < string.length(); i++) {
			charCount++;
		}
		return (charCount % 2 == 0) ? true : false;
	}

	static boolean leapYear(int year) {
		return (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))) ? true : false;

	}

}
