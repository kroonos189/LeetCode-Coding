import java.util.Scanner;

public class prime_inbetweeen {
	
	public static boolean primecheck(int n) {
		int c=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==1) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		for(int i=a1;i<=a2;i++) {
			
			boolean b=primecheck(i);
			if(b==true) {
				System.out.println(i);
				break;
			}
		}

	}

}
