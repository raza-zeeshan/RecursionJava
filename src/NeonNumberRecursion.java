import java.util.Scanner;

public class NeonNumberRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number : ");
		
		int num=new Scanner(System.in).nextInt();
		int n=num*num;
		
		System.out.println(neon(n,num,0));
		
			
		
	}
	
	public static boolean neon(int n,int m,int sum) {
		if(n==0) return sum==m;
		sum+=n%10;
		return neon(n/10,m,sum);
	}

}
