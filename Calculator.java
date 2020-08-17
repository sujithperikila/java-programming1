import java.util.*;

interface Calci{
	int operation(int a, int b);
}

public class Calculator{
	private int operate(int a, int b, Calci obj) 
    { 
        return obj.operation(a, b); 
    } 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calci add=(int x,int y)->(x+y);
		Calci sub=(int x,int y)->(x-y);
		Calci mul=(int x,int y)->(x*y);
		Calci div=(int x,int y)->(x/y);
		Calculator c = new Calculator();
		System.out.println("Enter two Numbers : \n"); 
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("1 for Addition: \n2 for Subtraction: \n3 for Multiplication: \n4 for Division: \n");
		int choice=in.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Addition is " + c.operate(a, b, add));
			break;
		case 2:
			System.out.println("Difference is " + c.operate(a, b, sub));
			break;
		case 3:
			System.out.println("Product is " + c.operate(a, b, mul));
			break;
		case 4:
			System.out.println("Result of Division is " + c.operate(a, b, div));
			break;
		default:
			System.out.println("Invalid Option");
			
		}
		
		
	}
	
}
