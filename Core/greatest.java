
public class greatest {
	public static void main(String args[]) {
		int a=4;
		int b=11;
		int c=9;
		int ans= (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("Greatest number is "+ans);
	}
}
