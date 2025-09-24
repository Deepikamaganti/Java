package encapsulation;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sudent1 s=new sudent1();
		s.setname("Deepika");
		s.getname();
		System.out.println(s.getname());
		

	}

}
class sudent1{
	private  String name;
	private int age;
	public void setname(String name) {
		this.name=name;
		
	}
	public String getname() {
		return name;
	}
}
