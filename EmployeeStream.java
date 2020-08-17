import java.util.*;
import java.util.stream.Collectors; 
class Employe{
	int empId, empSalary ;
	String empName,empDesignation,empLocation;
	public Employe(int empId,int empSalary,String empName,String empDes,String empLoc) {
		this.empId=empId;
		this.empSalary=empSalary;
		this.empName=empName;
		this.empDesignation=empDes;
		this.empLocation=empLoc;
	}
	
}
public class EmployeeStream{
	public static void main(String[] args) {
		List<Employe> l=new ArrayList<Employe>();
		l.add(new Employe(1, 40000,"arjun","Project manager","Agra"));
		l.add(new Employe(2, 70000,"mahesh","salesman","Mumbai"));
		l.add(new Employe(3, 50000,"prasad","analyst","Punjab"));
		l.add(new Employe(4, 90000,"hari","Program manager","Andhra"));
		l.add(new Employe(5, 100000,"ram","Vice president","Telangana"));
		l.add(new Employe(6, 30000,"amitab","Trainee","Madhya Pradesh"));
		l.add(new Employe(7, 10000,"surya","Senior Trainee","Kerala"));
		l.add(new Employe(8, 200000,"stella","CEO","Mysore"));
		l.add(new Employe(9, 80000,"rebekah","Director","Delhi"));
		l.add(new Employe(10, 55000,"stefan","Project Lead","Haryana"));
		
		List<String> s=l.stream().map(n->n.empName).collect(Collectors.toList());
		System.out.println(s);
		System.out.println(" ");
		l.stream().filter(n->n.empSalary > 50000).forEach(c->System.out.println(c.empSalary));;
		System.out.println(" ");
		l.stream().filter(n->n.empLocation.charAt(0)=='M').forEach(c->System.out.println(c.empLocation));;
		System.out.println(" ");
		l.stream().filter(n->n.empDesignation.endsWith("e")).forEach(c->System.out.println(c.empDesignation));;
	}
}