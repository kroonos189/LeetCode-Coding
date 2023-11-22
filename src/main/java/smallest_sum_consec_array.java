import java.util.Scanner;


public class smallest_sum_consec_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int s=ar[0]+ar[1];
		for(int i=1;i<n;i++) {
			
			int v=ar[i-1]+ar[i];
			if(s>v) {
				s=v;
			}
		}

		System.out.println(s);
	}

}
