import java.util.Scanner;
 
public class Main8 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String numStr = sc.next();
        String[] arr = new String[numStr.length()];
        arr = numStr.split("");
        int digit = 1;
        int num;
        
        for(int i = 1; i < numStr.length(); i++) {
        	digit *= 10;
        }
        
        for(int i = 0 ; i < numStr.length(); i++) {
        	num = (Integer.parseInt(arr[i])) * digit;
        	System.out.println("[" + num + "]");
        	digit /= 10;
        }
        
    }
}
