import java.util.Scanner;

public class armstrong {

	public static int digit_count(int n) {
		int c=0;
		while(n!=0) {
			c++;
			n=n/10;
		}
		return c;
	}
	public static boolean check_armstrong(int n) {
		int sum=0;int copy=n;
		int len=digit_count(n);
		while(n!=0) {
			int a=n%10;
			sum+=Math.pow(a,len);
			n=n/10;
		}
		if(copy==sum) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		for(int i=n1;i<=n2;i++) 
		{
			if(check_armstrong(i)) 
			{
				System.out.println("Armstrngyooo number-"+i);
			}
		}
	}

}
