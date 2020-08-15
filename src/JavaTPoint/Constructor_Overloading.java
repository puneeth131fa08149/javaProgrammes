package JavaTPoint;

public class Constructor_Overloading {

	int id;
	String name;
	int Age;
	public Constructor_Overloading(int i1,String name1) {
		id=i1;
		name=name1;
	}
	public Constructor_Overloading(int id2,String name2,int age) {
		id=id2;
		name=name2;
		Age=age;
	}
	public void display() {
		System.out.println(id+" "+name+" "+Age);
	}
	
	public static void main(String[] args) {
		Constructor_Overloading c1=new Constructor_Overloading(11, "Puneeth");
		Constructor_Overloading c2= new Constructor_Overloading(22, "Malepati", 25);
		c1.display();
		c2.display();
	}

}
