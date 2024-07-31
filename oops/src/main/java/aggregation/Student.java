package aggregation;

public class Student {
	
	String name;
	int rollno;
	String dept;
	Address add;
	
	public Student(String name,int rollno,String dept,Address add)
	{
		this.name=name;
		this.rollno=rollno;
		this.dept=dept;
		this.add=add;
	}
	
	public void display()
	{
		System.out.println("name: " +name);
		System.out.println("roll no : " +rollno);
		System.out.println("department :" +dept);
		System.out.println("house number: " +add.houseno);
		System.out.println("house number: " +add.houseName);
		System.out.println("pin code: " +add.pin);
		System.out.println("city: " +add.city);
		
	}

	
	public static void main(String[] args) {
		Address obj = new Address (10,"ElzVilla",786654,"Ernakulam");
		Student obj2 = new Student("Elz",123,"Computer Science",obj);
		obj2.display();

	}

}
