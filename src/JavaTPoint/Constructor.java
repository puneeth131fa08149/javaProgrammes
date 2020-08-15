package JavaTPoint;

public class Constructor {
	int id;
	String name;
	public Constructor(int i,String n) {
		id=i;
		name=n;
	}
	
	public static void main(String[] args) {
		Constructor c1=new Constructor(22, "puneeth");
		Constructor c2 = new Constructor(11, "Malepati");

		c1.display();
		c2.display();
	}
	void display() {
		System.out.println(id +" "+name);
	}

}
