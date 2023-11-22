import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class string_permutation {
	
	
	public static Set<String> perm(String s) {
		
		Set<String> st=new HashSet<String>();
		if(s==null)
		{
			return null;
		}
		else if(s.length()==0) {
			st.add("");
			return st;
		}
		
		char ch=s.charAt(0);
		String sub=s.substring(1);
		Set<String> word=perm(sub);
		for (String strNew : word) {
		      for (int i = 0;i<=strNew.length();i++){

		        st.add(strNew.substring(0, i) + ch + strNew.substring(i));
		      }
		    }
		    return st;
		
	}


	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String s="";
		s=sc.nextLine();
		System.out.println("Permutations of " + s + ": \n" + perm(s));
		
	}
}
