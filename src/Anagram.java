/*
 * Task 1 - Anagrams
 * Finished by Baur on 03/06/2018
 */
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);   // Method for entering input data;
		System.out.print("Enter a word:\t");    // Printing short message which call to enter word with horizontal tabulation
		String word = scanner.nextLine();   //  input data to variable word.
		System.out.println("Your word is:\t" + word); // Show a word in console
//		System.out.print("The anagram of your word is  - \t");
		System.out.println("The anagram of your word is  - \t" + reverseString(word));

	}
	
	public static String reverseString(String word) {		// Method will change position (reverse) of letters in the word

		        char[] array = word.toCharArray();
		        //make array of symbols
		        int beginning = 0;
		        // first number of characters array
		        int end = array.length - 1;
		        //last number of characters array
		        while (beginning < end) {
		        	// задача у двух переменых изменить поряд до тех пор Когда 
		            if (!Character.isAlphabetic(array[beginning])) {
		            	// check only alphabetic, create beginning array
		                beginning++;
		                // make bigger numbers of beginning letters
		            } else if (!Character.isAlphabetic(array[end])) {
		            	// check only alphabetic, create end array
		                end--;
		             // make less numbers of end letters
		            } else {
		                char tempChar = array[beginning];
		                // when char tempChar will same like beginning array
		                array[beginning] = array[end];
		                // when beginning array will same like end array
		                array[end] = tempChar;
		                // when char tempChar will same like end array
		                beginning++;
		                // when beginning number will maximum
		                end--;
		                // when end number will minimum 
		            }
		        }
		        return new String(array);
		        // return a value to string
	}
		

		
}