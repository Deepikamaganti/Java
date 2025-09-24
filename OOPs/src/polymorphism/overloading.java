package polymorphism;

public class overloading {

	public static void main(String[] args) {
		mathop ob=new mathop();
		ob.add(20);
		ob.add(10,20);
		ob.add(10,20,30);
		System.out.println(ob.add(10));
		
	

	}

}
class mathop{
	int add(int a) {
		return a;
	}
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}