import java.util.Scanner;

public class strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int copy=n,f=1,sum=0;
		while(copy!=0) 
		{
			int a=copy%10;
			for(int j=1;j<=a;j++) {
				f=f*j;
			}
			sum=sum+f;
			copy=copy/10;
			f=1;
		}
		if(sum==n) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not");
		}

	}

}
