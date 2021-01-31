import java.util.Scanner;
 
public class Main28 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        
        if(firstNum > secondNum) {        	
        	System.out.print(1);
        }else {        	
        	System.out.print(0);
        }
    }
}
