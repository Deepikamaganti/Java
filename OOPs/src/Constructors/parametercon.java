package Constructors;

public class parametercon {

	public static void main(String[] args) {
		Student2 s=new Student2("Deepika",20);
		System.out.println(s.name+" "+s.no);

	}

}
class Student2{
	String name;
	int no;
	Student2(String name,int no){
		this.name=name;
		this.no=no;
		
		
	}
}
