package Constructors;

public class ConstructorOverloaing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		Student3 s3=new Student3();
		Student3 s4=new Student3("Deepika",20);
		System.out.println(s3.name+" "+s3.age);
		System.out.println(s4.name+" "+s4.age);
		
		

	}

}

class Student3{
	String name;
	int age;
	Student3(){
		name="nknow";
		age=0;
	}
    
	Student3(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	
	
}