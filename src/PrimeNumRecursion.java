import java.util.Scanner;

public class PrimeNumRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("enter the number : ");
		int n = new Scanner(System.in).nextInt();
	
		System.out.println(n+" is prime number : "+primeNum(n,n/2));
		

	}
	
	public static boolean primeNum(int n,int i) {
		if(n==i) return true;
		
		if(n==1||n%i==0) return false;
		
		return primeNum(n,i+1);
	}
	
	public static void range(int st,int end) {
		if(st>end) return ;
		if(primeNum(st,st/2)) System.out.print(st+" ");
		
		range((st+1),end);
	}

}
