import java.util.Scanner;
 
public class Main20 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        char ascii = sc.next().charAt(0);
        char ascii2 = (char)((int)ascii + 1);
        
        System.out.printf("%c", ascii2);
    }
}
