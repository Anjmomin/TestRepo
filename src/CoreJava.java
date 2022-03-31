
public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mainly used datatypes
		int myNum= 5;
		String website= "Google";
		char letter='A';
		double dec= 5.9;
		boolean myCard= true;
		
		System.out.println(website.length()); // method of string 
		System.out.println("DATATYPES");
		System.out.println(myNum+" is the value stored in myNum variable.");
		System.out.println(website+" is the website.");
		System.out.println(letter+" is the letter.");
		System.out.println(dec+" is the value in decimal variable.");
		System.out.println("*****************************");
		//Arrays
		//declare an array
		//String[] cars;
		//int[] Newnum;
		
		//declare and insert values in array
		System.out.println("ARRAYS");
		String[] cars= {"VOLVO", "BMW","FORD","MAZDA"};
		int[] Newnum= {10,20,30,40,50};
		
		System.out.println(cars[0]+" is my car");
		System.out.println(Newnum[3]+" is the value in 2nd index of array.");
	
		//loop
		System.out.println("*****************************");
		System.out.println("LOOPS");
		System.out.println("INTERGER ARRAY with for loop");
		System.out.println(Newnum.length+" is length of Newnum array.");
		for(int i=0; i < Newnum.length; i++)
		{
			
			System.out.println("Value at index "+i+ " of Newnum array is: "+ Newnum[i]+".");
		}
		System.out.println("*****************************");
		System.out.println("STRING ARRAY with for loop");
		System.out.println(cars.length+" is length of cars array.");
		 for(int j=0; j < cars.length; j++)
		 {
			 System.out.println("Car at index "+j+ " of cars array is: " +cars[j]+".");
		 }
		 System.out.println("*****************************");
		 System.out.println("For-Each loop");
		 String[] name= {"John","Tony","Ben","Chris","Alex"};
		 for (String s: name) 
		 {
			 System.out.println("Name is: "+s);
		 }
		
		 System.out.println("*****************************");
		 System.out.println("If Statement");
		 int[] mul= {1,2,3,4,5,6,7,8,9,10,15,20,33,44,122};
		 for(int l=0; l<mul.length; l++)
		 {
			 if (mul[l] % 2== 0)
			 {
				 System.out.println(mul[l]+" is multiple of 2");
			 }
			 else
			 {
				 System.out.println(mul[l]+ " is not a multiple of 2");
			 }
		 }
	}
	

}
