/*Assignment 25 : 16th May 2022
WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};
Hint : 0 to 9 --> 48 to 57
          A to Z --> 65 to 90
          a to z --> 97 to 122
*/
package balkrishna;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment25 {

	char getcharForAscii(int asciiVal) {
		char outputChar = (char) asciiVal;
		return outputChar;
	}

	int getAsciiForChar(char inputChar) {
		int asciiVal = inputChar;
		return asciiVal;
	}

	String convertCase(String inputStr) {
		String convertedString = "";
		char[] inputChar = inputStr.toCharArray();
		for (char inputchar : inputChar) {
			if (getAsciiForChar(inputchar) >= 65 && getAsciiForChar(inputchar) <= 90) {
				convertedString += getcharForAscii(getAsciiForChar(inputchar) + 32);
			} else if (getAsciiForChar(inputchar) >= 97 && getAsciiForChar(inputchar) <= 122) {
				convertedString += getcharForAscii(getAsciiForChar(inputchar) - 32);
			}
		}
		return convertedString;
	}

	String[] processArray(String[] inputArray) {
		String[] outputArray = new String[inputArray.length];
		for (int index = 0; index < inputArray.length; index++) {
			outputArray[index] = convertCase(inputArray[index]);
		}
		return outputArray;
	}

	public static void main(String[] args) {
		String[] inputArray = {"bAlKrIsHnA", "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		Assignment25 assignment25 = new Assignment25();
		System.out.println("For given  string input:  " + Arrays.toString(inputArray) + "\nConverted array string is: " + Arrays.toString(assignment25.processArray(inputArray)));

		Scanner scanner = new Scanner(System.in);
		System.out.print("\nPlease enter the String Array Size : ");
		int arrSize = scanner.nextInt();
		String[] nameArr = new String[arrSize];
		System.out.print("Enter name: ");
		for (int index = 0; index < arrSize; index++) {			
			nameArr[index] = scanner.next();
		}		
		System.out.print("Converted array is: " + Arrays.toString(assignment25.processArray(nameArr)));
	}
}