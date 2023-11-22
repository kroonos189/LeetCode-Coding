class big{
	
	void print() {
		System.out.println("This is super class");
	}
}




public class super_this extends big{
	
	public static void main(String[] args){

		big obj=new big();
		
		obj.print();
	}

}
