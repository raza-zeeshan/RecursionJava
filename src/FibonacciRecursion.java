import java.util.Scanner;

public class FibonacciRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=new Scanner(System.in).nextInt();
		int a[]=new int[n+1];
		for(int i=0;i<=n;i++) {
			a[i]=fib(i);
			System.out.print(a[i]+" ");
		}

	}
		public static int fib(int n) {
			if(n<=1) return n;
			return fib(n-1)+fib(n-2);
		}
}
