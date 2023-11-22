import java.util.Scanner;
public class first_2_char_check {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        int space = n ;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            if(i>0) {
            	for (int j = 0; j <= i-1; j++) {
            		System.out.print("*");
            	}
            }
            System.out.println();
            space--;
        }

        space = 0;
        

        for (int i = n - 1; i >= 0; i--) {
        	
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            
            if(i>0) {
            	for (int j = 0; j <= i-1; j++) {
            		System.out.print("*");
            	}
            }
            System.out.println();
            space++;
        }
    }
}


