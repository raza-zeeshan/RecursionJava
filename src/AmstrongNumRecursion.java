import java.util.Scanner;

public class AmstrongNumRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
		int n=new Scanner(System.in).nextInt();
		
		int l=(n+"").length();
		System.out.println(n+" is a Palindrome : "+amstrong(n,n,0,l));
		

	}
	public static boolean amstrong(int n,int num,int sum,int len) {
		
		if(n==0) return num==sum;
		sum=sum+(int)Math.pow(n%10, len);
		return amstrong(n/10,num,sum,len);
	}

}
