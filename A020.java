package sytaxPractice;

import java.util.Scanner;

public class A020 {
	private static int pre(char prefix) {
		int tmp = 0;
		switch (prefix) {
		case 'A':
			tmp =10;
			break;
		}
		return tmp;
	}

	public static void main(String[] args) {
		char[] array = new char[10];

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			array = scanner.nextLine().toCharArray();
			int validate = 0;
			int checksum = 0;
			for (int i = 1; i < 9; i++) {
				checksum = array[i] * (9 - i);

			}
			validate = pre(array[0]) + checksum + array[9];
			
			if(validate % 10 == 0){
				System.out.println("real");
			}
			else{
				System.out.println("face");
			}
		}
	}
}
