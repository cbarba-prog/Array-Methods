
public class arrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Question 1=================================================================================================================================
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		System.out.println("Last minus first number in array: " + ((ages[ages.length-1])-(ages[ages.length-ages.length])));

		int[] newAges = new int[ages.length+1];
		
		for(int i=0;i<ages.length;i++)
		{
			newAges[i] = ages[i];
		}
		
		newAges[newAges.length-1] = 100;
		
		ages = newAges;
		
		System.out.println("New last minus first number in array: " + ((ages[ages.length-1])-(ages[ages.length-ages.length])));

		double averageSum = 0;
		
		for(int i=0;i<ages.length;i++)
		{
			averageSum += ages[i];
		}
		System.out.println("Average age: " + (averageSum/ages.length));
		
//Question 2==================================================================================================================================
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
	    double averageName = 0;
		
		for(int i=0;i<names.length;i++)
		{
			averageName += names[i].length();
		}
		System.out.println("Average letters in name length: " + (averageName/names.length));
		
		String fullString = "";
		
		for(int i=0;i<names.length;i++)
		{
			fullString += names[i];
		}
		System.out.println("Concatenated names: " + fullString);
		
		
		
		
		
	}
	

}
