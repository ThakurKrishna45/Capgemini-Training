
 class inheritance {
	public static void main(String args[]) {
		childClass obj= new childClass();
		obj.testNst();
		obj.testSt();
		System.out.println(obj.a);
		System.out.println(obj.b);
//		System.out.println(obj.c);
	}
}
class parentClass{
	int a=5;
	static int b=3;
	int c=4;

	public parentClass() {
		// TODO Auto-generated constructor stub
//		this.c=c;
//		System.out.println(c);
		System.out.println("Parent class constructor");
	}
	public static void testSt() {
		System.out.println("Parent class static method");
	}
	public void testNst() {
		System.out.println("Parent class Non static method");
	}
}
class childClass extends parentClass{
	public childClass() {
		// TODO Auto-generated constructor stub
		System.out.println("child class constructor");
	}
}
