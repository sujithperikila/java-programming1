import java.util.Scanner; 
public class CN { public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Real Part and Imaginary Part of First Complex Number : ");
	int r1=in.nextInt();
	int i1=in.nextInt();
	System.out.println("Enter Real Part and Imaginary Part of Second Complex Number : ");
	int r2=in.nextInt();
	int i2=in.nextInt();
	
 ComplexNumber c1 = new ComplexNumber(r1,i1); 
ComplexNumber c2 = new ComplexNumber(r2,i2); 
ComplexNumber sum = c1.sum(c2); 
ComplexNumber difference = c1.difference(c2); 
ComplexNumber product = c1.product(c2);
System.out.println("first complex number: " + c1); 
System.out.println("second complex number: " + c2); 
System.out.println("sum of two complex numbers: " + sum); 
System.out.println("difference of two complex numbers: " + difference);
System.out.println("Product of two complex numbers: " + product);

}
 
} 
class ComplexNumber {
 private final double real; 
private final double imaginary; 
public ComplexNumber(double real, double imaginary) { 
this.real = real; this.imaginary = imaginary;
 } 
public ComplexNumber sum(ComplexNumber other) {
 double r = this.real + other.real; 
double i = this.imaginary + other.imaginary;
 return new ComplexNumber(r, i); 
} 
public ComplexNumber difference(ComplexNumber other) {
 double r = this.real - other.real; 
double i = this.imaginary - other.imaginary; 
return new ComplexNumber(r, i); 
} 

public ComplexNumber product(ComplexNumber other) {
	 double r = this.real * other.real; 
	double i = this.imaginary * other.imaginary; 
	return new ComplexNumber(r, i); 
	} 

public double getReal() { 
return real; 
} public double getImaginary() { 
return imaginary; 
} 
@Override public String toString() { 
return real + " + " + imaginary + "i"; 
}
 }