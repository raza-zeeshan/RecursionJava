import java.util.Scanner;

public class SumOfDigitRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number : ");
		int n=new Scanner(System.in).nextInt();
		
		System.out.println(sumOfDigit(n));
	}
	static int sumOfDigit(int n) {
		if(n==0) return 0;
		
		return n%10+sumOfDigit(n/10);
	}

}
