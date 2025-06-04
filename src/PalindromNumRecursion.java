import java.util.Scanner;

public class PalindromNumRecursion {
	public static void main(String[] args) {
	System.out.print("enter a number : ");
	long n=new Scanner(System.in).nextLong();
	System.out.print(n+" is a palindrome number :" +palindrome(n,n,0));
}
	static boolean palindrome(long n,long n2,long rev) {
		if(n==0) return rev==n2;
		rev= (rev*10+n%10);
		return palindrome(n/10,n2,rev);
	}
}
