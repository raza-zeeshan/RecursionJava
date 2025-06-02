
public class SumRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(sum(6));
	}
	
	public static int sum(int n)
	{
		if(n==1) return 1;
		return sum(n-1)+n;
	}

}
