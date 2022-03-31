
public class CoreJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Strings: String is an object
		//String literal
		String s= "Welcome";
		String s1= "Welcome"; //new instance is not created it will point to string s
		String s2= "Literal Strings";
		
		//new operator string
		String s3= new String("New operator String"); // new instance is created
		String s4= new String("New operator String"); // new instance is created
		
		String s5 = "String is an object";
		String[] splittedstring= s5.split(" ");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[2]);
		System.out.println(splittedstring[3]);
		
		for(int i=0; i<s5.length(); i++) //length is method of string 
		{
			System.out.println(s5.charAt(i)); //charAt is method of string
		}
		
		System.out.println(s5.isEmpty());
        //print in reverse 
		for(int j=s5.length()-1; j>=0; j--)
		{
			System.out.println(s5.charAt(j));
			
		}
		
	}

}
