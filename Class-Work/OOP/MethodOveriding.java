package training;

public class MethodOveriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj= new B(10);
//		obj.print();
//		obj.myname();
	}

}

 class A{
	 public A() {
		 System.out.println("i m parent constructor");
	 }
	 public static void myname() {
		System.out.println("i m parent");
	}
	public void print() {
		System.out.println("I am Parent class");
	}
}
 class B extends A{
	 public B() {
		 System.out.println("i m child constructor");
	 }
	 public B(int x) {
		 this();
		 System.out.println("i m child x constructor");
	 }
	@Override
	public void print() {
		System.out.println("I am child class");
	}
	public static void myname() {
		System.out.println("i m child");
	}
}