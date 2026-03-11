
public class Loop {
	public static void main(String args[]) {
		sumOfAllDigits();
		checkPalindrome();
	}
	public static void sumOfAllDigits() {
		int n=324;
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);
	}
	public static void checkPalindrome() {
		String s="level";
		int n=s.length();
		int j=n-1,i=0;
		boolean isPalindrome= true;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				isPalindrome=false;
				break;
			}
			i++; j--;
		}
		if(isPalindrome)System.out.println(s+" is palindrome");
		else System.out.println(s+" is not palindrome");
	}
}
