package Demo.clone;
class Human implements Cloneable{
	int age;
	String name;
	public Human(int age,String name){
		this.age=age;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
}

public class Simple {

	public static void main(String[] args) throws CloneNotSupportedException {
		Human divya= new Human(8, "divyani");
		 Human twin = (Human)divya.clone();
		 System.out.println("age is " + twin.age + "name is" + twin.name);
	}

}
