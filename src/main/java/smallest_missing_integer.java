import java.util.TreeSet;
public class smallest_missing_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Treeset<Integer> ts=new Treeset<Integer>();
        for(int i=ts.first();i<ts.last();i++){
            if(!ts.contains(i)){
                System.out.print(i);
                break;
            }
            else{
                continue;
            }
        }

	}

}
