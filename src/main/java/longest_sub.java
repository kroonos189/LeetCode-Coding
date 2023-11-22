
public class longest_sub {

	public static void main(String[] args) {
		
		String s="abcabcbb";
        int big=0,k=0;
        int l=s.length();
        char c[]=new char[l];
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(c.length==0) {
            	c[k]=ch;
            	k+=1;
            }
            else 
            {
            	for(int j=0;j<k;j++)
            	{
                if(c[j]==ch)
                {
                    int len=c.length;
                    if(big<=len)
                    {
                        big=len;
                    }
                    c=null;
                    break;
                }
                else
                {
                    c[k]=ch;
                    k+=1;
                }
            	}
            }
        }
        System.out.print(big +" hello");
	}

}
