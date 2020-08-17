import java.util.Scanner;

public class AreaOfTriangle {
     
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of first side of triangle:");
        double a = in.nextDouble();
         
        System.out.println("Enter length of second side of triangle:");
        double b = in.nextDouble();
         
        System.out.println("Enter length of third side of triangle:");
        double c = in.nextDouble();
         
        AreaOfTriangle at   = new AreaOfTriangle();
        if(at.isTriangleValid(a, b, c)) {
            double area = at.calculateArea(a,b,c);        
            System.out.println("Area = "+area);
        }else {
            System.out.println("Sides entered cannot form a triangle!");
        }
         
    }

    private double calculateArea(double a, double b, double c) {
        double p = (a+b+c)/2;       
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
     

    private boolean isTriangleValid(double a, double b, double c) {
        if((a+b)>c && (a+c)>b && (b+c)>a) {
            return true;
        }else {
            return false;
        }
    }
}