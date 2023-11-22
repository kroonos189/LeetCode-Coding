import java.util.HashSet;
import java.util.Scanner;

public class unique_strings {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s="";
		s=sc.nextLine();
		HashSet<Character> c=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			c.add(s.charAt(i));
		}
		
		c.forEach(System.out::print);

	}

}
