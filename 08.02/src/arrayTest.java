
public class arrayTest {
	
	public static void main(String[] args) {
		final int SIZE= 10;
		double[] sales; // no memory allocated 
		sales = new double[SIZE];
		sales[0] = 10;
		for(int i= 0; i<sales.length; i++) {
			System.out.println(sales[i]);
		}
		//initialization list 
		int[] numbers = {3,5,6,7,8}; //cant do it after NEW
		//enhanced for loop
		for(int num:numbers) {
			System.out.println(num + "\s" + " this is test 1 ");
		}
		
		String[] string = {"Java", "JavaScript", "C#", "Python"};
		
		
	}
}



//