package polymorphism;

public class overridding {

	public static void main(String[] args) {
		cat c=new cat();
		c.sound();
		
		
		

	}

}
class Animal{
	void sound() {
		System.out.println("Animal makes sound");
	}
	
}
class Dog extends Animal{
	void sound() {
		System.out.println("boww");
	}
}
class cat extends Animal{
	void sound() {
		System.out.println("meow");
	}
}
