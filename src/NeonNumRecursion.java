import java.util.Scanner;

public class NeonNumRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number : ");
		int n = new Scanner(System.in).nextInt();
		int num=n*n;
		System.out.println(n+" is neon number : "+neonNum(num,n,0));
	}
	
	public static boolean neonNum(int num,int n,int sum) {
		if(num==0) return sum==n;
		return neonNum(num/10,n,sum+num%10);
	}

}
