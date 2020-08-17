class Circle {
	private double radius;
	private String color;
	Circle(){
		radius=1.0;
		color="red";
		
	}
	Circle(double b){
		radius=b;
		color="red";
		
	}
	public double getRadius() {
		return radius;
	}
	public double getAtea() {
		return radius*radius*3.14;
		
	}

}
public class TestCircle{
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("Radius is : "+c.getRadius()+"\nArea is : "+c.getAtea());
		Circle c2 = new Circle(5.2);
		System.out.println("Radius is : "+c2.getRadius()+"\nArea is : "+c2.getAtea());
	}
}