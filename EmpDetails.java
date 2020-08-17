
public class EmpDetails {
	String name;
	int year;
	int salary;
	String address;
	EmpDetails(String a,int b,String c){
		this.name=a;
		this.year=b;
		this.address=c;
	}
	void display() {
		System.out.println(this.name+"\t\t"+this.year+"\t\t"+this.address);
		
	}
	public static void main(String[] args) {
		EmpDetails e1 = new EmpDetails("Robert",1994,"64C- WallStreet");
		EmpDetails e2 = new EmpDetails("Sam",2000,"68D- WallStreet");
		EmpDetails e3 = new EmpDetails("John",1999,"26B- WallStreet");
		System.out.println("Name \t Year of Joining \t Address ");
		e1.display();
		e2.display();
		e3.display();
		
		
		
	}
	

}
