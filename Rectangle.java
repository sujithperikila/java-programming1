import java.util.*;
class Rectangel {
	int height,width;
	void display() {
		System.out.println("Height is :"+height+" and Width is : "+width);
	}
	
}
class RectangleArea extends Rectangel{
	void take_input() {
		Scanner in=new Scanner(System.in);
		height=in.nextInt();
		width=in.nextInt();
	}

	
	void display() {
	System.out.println("Area is :"+(height*width));
		
	}
}
public class Rectangle{
	public static void main(String[] args) {
		
		RectangleArea r = new RectangleArea();
		r.take_input();
		r.display();
	}
}