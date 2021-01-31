import java.util.Scanner;
 
public class Main34 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if((a==1 && b==1) || (a==0 && b==0)) {        	
        	System.out.print(1);
        }else {        	
        	System.out.print(0);
        }
    }
}
