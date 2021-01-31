import java.util.Scanner;
 
public class Main7 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int temp;
        int num = sc.nextInt();
        int i = 10000;
        
        while(num > 0) {
    		temp = (num % 10) * i;
    		System.out.println("["+temp+"]");
    		num /= 10;
    		i /= 10;
        }
    }
}
