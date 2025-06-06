import java.util.Scanner;

public class SpyNumRecusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number : ");
		int n = new Scanner(System.in).nextInt();
		
		System.out.println(spyNum(n,0,1));
	}
	
	public static boolean spyNum(int n,int sum,int prod) {
		if(n==0) return sum==prod;
		return spyNum(n/10,sum+n%10,prod*(n%10));
	}

}
