
public class arrayMethods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Question 1=================================================================================================================================
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		System.out.println("Last minus first number in array: " + ((ages[ages.length-1])-(ages[ages.length-ages.length])));

		int[] newAges = new int[ages.length+1];
		
		for(int i=0;i<ages.length;i++){
			newAges[i] = ages[i];
		}
		
		newAges[newAges.length-1] = 100;
		
		ages = newAges;
		
		System.out.println("New last minus first number in array: " + ((ages[ages.length-1])-(ages[ages.length-ages.length])));

		double averageSum = 0;
		
		for(int i=0;i<ages.length;i++){
			averageSum += ages[i];
		}
		System.out.println("Average age: " + (averageSum/ages.length));
		
//Question 2==================================================================================================================================
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
	    double averageName = 0;
		
		for(int i=0;i<names.length;i++){
			averageName += names[i].length();
		}
		System.out.println("Average letters in name length: " + (averageName/names.length));
		
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
		System.out.println(lengthSum);
		
	
//Question 7====================================================================================================================================
		
		String word = "Hello";
		int n = 3;
		System.out.println(wordRepeat(word,n));
		
		String firstName = "Chris";
		String lastName = "B";
		System.out.println(fullName(firstName, lastName));
	
		int[] arrays = {49, 51};
		System.out.println(greaterThanHundred(arrays));
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
		else {
		newBoo = false;
		return newBoo;
		}
		
}




}

