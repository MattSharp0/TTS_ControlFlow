package ControlFlow;

public class AsciiChar {
	
	public static void printNumbers() {
		int[] numbers = {0,1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}
	}
	
	public static void printLowerCase() {
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < lowerCase.length(); i++) {
			System.out.print(lowerCase.charAt(i));
		}
		
	}

	public static void printUpperCase() {
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < upperCase.length(); i++) {
			System.out.print(upperCase.charAt(i));
		}
		
	}

}
