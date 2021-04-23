package Tester;

public class test1 {
	private String firstname ="nguyen";
	private String lastname = "luan";
	private int age = 20;
	public void hello() {
		System.out.println("Hello:" + firstname + "" + lastname);
	}
	public void age() {
		System.out.println("age:" + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 oject = new test1();
		oject.hello();
		oject.age();
		System.out.println("hello");}
	
}
