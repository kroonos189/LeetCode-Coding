import java.util.Scanner;

public class string_reversal_recurssion {
	
	public static String rev(String s, int n, String s1) {
		
		if(n==0) {
			return s1;
		}
		else {
			char ch=s.charAt(n-1);
			s=s1+ch;
			 return rev(s,n-1,s1);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1="";
		String s="";
		s=sc.nextLine();
		System.out.println(rev(s,s.length(),s1));
		
	}
}
