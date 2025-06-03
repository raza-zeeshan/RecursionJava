import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :");
		int n=new Scanner(System.in).nextInt();
		
		
		System.out.println(fact(n));
		

	}
	public static int fact(int n) {
		if(n==1||n==0)return 1;
		
		return n*fact(n-1);
	}

}
