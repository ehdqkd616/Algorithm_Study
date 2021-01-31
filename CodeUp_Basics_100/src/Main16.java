import java.util.Scanner;
 
public class Main16 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        char alpabet = sc.next().charAt(0);
        int ascii = (int) alpabet;
        
        System.out.printf("%d", ascii);
    }
}
