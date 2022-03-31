import java.util.ArrayList;

public class CoreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars= new ArrayList<>();
		cars.add("VOLVO");
		cars.add("FORD");
		cars.add("BMW");
		cars.add("Maruti");
		cars.remove(2);
	    
		System.out.println("*****************************");
		System.out.println("ArrayList");
		System.out.println("Size of ArrayList cars is: "+cars.size());
		System.out.println(cars.get(0));
		System.out.println(cars.get(1));
		System.out.println(cars.get(2));
		System.out.println("*****************************");
	}

}
