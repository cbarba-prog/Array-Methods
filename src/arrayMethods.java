import java.util.Scanner; 

public class arrayMethods {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		// TODO Auto-generated method stub
		
//Question 1=================================================================================================================================
		//A
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		System.out.println("Last minus first number in array: " + ((ages[ages.length-1])-(ages[ages.length-ages.length])));

		//B
		int[] newAges = new int[ages.length+1];
		
		for(int i=0;i<ages.length;i++){
			newAges[i] = ages[i];
		}
		
		newAges[newAges.length-1] = 100;
		
		ages = newAges;
		
		System.out.println("New last minus first number in array: " + ((ages[ages.length-1])-(ages[ages.length-ages.length])));
		
		//C
		double averageSum = 0;
		
		for(int i=0;i<ages.length;i++){
			averageSum += ages[i];
		}
		System.out.println("Average age: " + (averageSum/ages.length));
		
//Question 2==================================================================================================================================
		//A
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
	    double averageName = 0;
		
		for(int i=0;i<names.length;i++){
			averageName += names[i].length();
		}
		System.out.println("Average letters in name length: " + (averageName/names.length));
		
		//B
		String fullString = "";
		
		for(int i=0;i<names.length;i++){
			fullString += names[i] + " ";
		}
		System.out.println("Concatenated names: " + fullString);
		
//Question 5=====================================================================================================================================
		
		int[] nameLengths = new int[names.length];
		
		for(int i=0;i<names.length;i++){
			nameLengths[i] = names[i].length();
		}
		
//Question 6=====================================================================================================================================		
		
		int lengthSum = 0;
		
		for(int i=0;i<nameLengths.length;i++){
			lengthSum += nameLengths[i];
		}
		System.out.println("Sum of all elements in array: " + lengthSum);
		
	
//Question 7====================================================================================================================================
		
		String word = "Hello";
		int n = 5;
		System.out.println("Repeat word: " +wordRepeat(word,n));
		
		//Q8
		String firstName = "Chris";
		String lastName = "Barba";
		System.out.println("Full Name is: " + fullName(firstName, lastName));
	
		//Q9
		int[] arrays = {24, 25, 50, 2};
		System.out.println("The sum of all values is greater than 100: " + greaterThanHundred(arrays));
		
		//Q10
		double[] arrayElements = {5, 20, 12, 50, 4};
		System.out.println("The average of all elements in the array: " +arrayAvg(arrayElements));
		
		//Q11
		double[] firstElements = {6, 7 , 8, 9, 10};
		double[] secondElements = {1, 2, 3, 4, 5};
		System.out.println("The average in first array is greater than second: " + doubleAvg(firstElements, secondElements));
		
		//Q12
		boolean isHotOutside = true;
		double moneyInPocket = 11;
		System.out.println("Will you buy a drink: " + willBuyDrink(isHotOutside, moneyInPocket));
		
		//Q13
		int num1 = 2;
		int num2 = 10;
		System.out.println("The multiple of " + num1 + " and "+ num2 + " equals: " +multiplyNum(num1, num2));
		
	}
	
static String wordRepeat(String word, int n){
		
		String stringSum = "";
		
		for(int i = 0; i < n; i++){
			stringSum += word;
		}		
		return stringSum;
	}

//Question 8======================================================================================================================================

static String fullName(String firstName, String lastName) {
	
		String firstLast = "";
	
		firstLast = firstName + " " + lastName;	
	
		return firstLast;
}

//Question 9======================================================================================================================================

static boolean greaterThanHundred(int[] arrays) {
		
		int arraySum = 0;
		boolean newBoo;
		
		for(int i = 0; i < arrays.length; i++){
			arraySum += arrays[i];
		}		
		if (arraySum > 100) {
			newBoo = true;
		return newBoo;
		}

		newBoo = false;
		return newBoo;
}

//Question 10=====================================================================================================================================

static double arrayAvg(double[] arrayElements) {
	
		double elementSum = 0;
		
		for(int i = 0; i< arrayElements.length; i++) {
			elementSum += arrayElements[i];
		}
			return elementSum / arrayElements.length;
	
}

//Question 11======================================================================================================================================

static boolean doubleAvg(double[] firstElements, double[] secondElements) {
	
	double firstSum = 0, secondSum = 0;
	boolean firstBoo;
	
	for(int i = 0; i < firstElements.length; i++) {
		firstSum = firstElements[i];
	}
	for(int j = 0; j < secondElements.length; j++) {
		secondSum = secondElements[j];
	}
		firstSum = firstSum / firstElements.length;
		secondSum = secondSum / secondElements.length;
		
		if(firstSum > secondSum) {
			
			return firstBoo = true;
		}
			return firstBoo = false;
}

//Question 12====================================================================================================================================

static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if (isHotOutside == true && moneyInPocket > 10.50) 
			return true;
		else
			return false;
	}

//Question 13====================================================================================================================================

//Returns a multiple of 2 numbers 

static int multiplyNum(int num1, int num2) {
	
		return num1*num2;
}


}

