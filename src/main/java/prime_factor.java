import java.util.Scanner;

public class prime_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,prime = 0;
		for(int i=1;i<=n;i++) 
		{
			if(n%i==0) 
			{
				prime=i;
				for(int j=1;j<=prime;j++)
				{
					if(prime%j==0)
					{
						count++;
					}
				}
				if(count==2 || count==1)
				{
					System.out.println("prime= "+prime);
				}
			}
			count=0;
		}
	}

}
