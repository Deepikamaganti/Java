package abstraction;

public class Abstration {
	public static void main(String[] args) {
	cat c=new cat();
	c.start1();
	c.start();

}
}
abstract class Dog{
	abstract void start();
	void start1() {
		System.out.println("Deepika");
	}
}
class cat extends Dog{
	void  start(){
		System.out.println("Meow");
	}
	
}