import java.util.*;
public class sort_string {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    String s="";
	    s=sc.nextLine();
	    ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
	    list.stream().sorted().forEach(System.out::print);

	    
	}

}
