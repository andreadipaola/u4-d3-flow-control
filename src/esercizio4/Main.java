package esercizio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int x = (int) 5.3;
//		System.out.println(x);
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero intero!");
		while (!in.hasNextInt())
			in.next();
		int number = in.nextInt();
		countDown(number);
		in.close();

	}

	static void countDown(int num) {
		for (int i = num; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
