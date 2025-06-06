import java.util.Scanner;

public class StrongRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
		int n=new Scanner(System.in).nextInt();
		int factorial=fact(n);
		System.out.print(n+ " is an strong number : "+strong(n,n,fact(n%10)));
		

	}
	public static int fact(int n) {
		if(n==0||n==1) return 1;
		return n*fact(n-1);
		
	}
	public static boolean strong(int n,int num,int fa) {
		if(n==0) return fact(n)==num;
		
		return strong(n/10,num,fact(n));
		
	}

}
