package ControlFlow;

import java.util.*;

import com.sun.org.apache.bcel.internal.classfile.ConstantInteger; 

public class Main {

	public static void main(String[] args) {
		System.out.print("Accepted Characters: ");
		AsciiChar.printNumbers();
		AsciiChar.printLowerCase();
		AsciiChar.printUpperCase();
		
		Scanner input = new Scanner(System.in);
		input.useDelimiter("\\n");
		
		System.out.println("\nHello, what is your name? ");
		String name = input.next();
		
		System.out.println("Hello " + name + "\nDo you wish to continue to the next part? (y/n) ");
		String yesNo = input.next();
		
		if (yesNo.contains("n")) {
			System.out.print("So long and thanks for all the fish.");
			System.exit(0);
		}
		
		do {			
			System.out.println("ok! \nDo you have a red car? (y/n) ");
			String redCarQ = input.next();
			Boolean hasRedCar = false;
			if (redCarQ.contains("y")) {
				hasRedCar = true;
			}
			
			System.out.println("What is the name of your favourite pet? ");
			String petName = input.next();
			
			System.out.println("How old is " + petName + "? ");
			Integer petAge = input.nextInt();
			
			System.out.println("what is your lucky number? ");
			Integer luckyNumber = input.nextInt();
			
			System.out.println("Who is your favourite football player? ");
			String favePlayer = input.next();
			
			System.out.println("What is their jersey number? ");
			Integer jerseyNumber = input.nextInt();
			
			System.out.println("What year is your car? ");
			int carYear = input.nextInt();
			
			System.out.println("What is the first name of your favourite actor? ");
			String faveActor = input.next();
			
			//some important constants
			
			final int RANDOM_1 = (int) (Math.random() * 100);
			final int RANDOM_2 = (int) (Math.random() * 100);
			final int RANDOM_3 = (int) (Math.random() * 10);
			
			final int MAX_NUMBER = 75;
			
			//get off your ass and do some math
			
			int magicNumber = (luckyNumber + RANDOM_1);
//			if (magicNumber > MAX_NUMBER) {
//				magicNumber -= 75;
//			}
			
			int number1 = (petName.length() + petAge);
			
			int number2 = ((carYear - 1900) + RANDOM_2);
			if (number2 > MAX_NUMBER) {
				number2 -= 75;	
			}
			if (hasRedCar == false) {
				number2 = 42;
			}
			
			int number3 = (faveActor.length()*RANDOM_3);
//			if (number3 > MAX_NUMBER) {
//				number3 -= 75;
//			}
			
			int number4 = (favePlayer.length());
//			if (number4 > MAX_NUMBER) {
//				number4 -= 75;
//			}
			
			int number5 = ((number1 + number2 + number3 + number4) / 4);
			
			System.out.println("Lottery numbers: " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + " Magic Ball: " + magicNumber);
			
			System.out.println("Would you like to try again? (y/n) ");
			yesNo = input.next();
			
		} while (yesNo.contains("y"));
		
		System.out.println("Thanks for playing!");
		System.exit(0);
		
//		Generate the "magic ball" first.  It should be the user's favorite quarterback jersey number *or* their lucky number, multiplied by one of the random numbers.  Make sure that the answer is less the max "magic" number of 75; if it is greater than 75 then subtract 75 from the value and that value is now the "magic ball" number.  
//
		
		
//		For the 5 non-magic numbers use your choice of any of the following methods to generate values: (Note that you may have to adjust each value to correct range by adding/subtracting.)
//		* Find the 3rd letter of their favorite pet.  Convert that character value to an integer value.
//		* Use the two digit model year of their car and add their lucky number to it.
//		* Use the random number between 1 and 50, subtracting one of the generated random numbers.
//		* Convert the first letter of their favorite actor/actress to an integer and use that value.
//		* Convert the last letter of their favorate actor/actress to an integer and use that value.
//		* Use the value 42.
//		* Use the age of their favorite pet + their car model year.
//		* Favorite quarterback number + age of pet + lucky number.
//
//		Once all the numbers have been calculated, print them out in this form:
//		```
//		Lottery numbers: 4, 17, 15, 52, 26  Magic ball: 22
		
		
	}
	
	
	
	
}
