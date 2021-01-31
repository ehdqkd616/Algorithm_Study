import java.util.Scanner;
 
public class Main25 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int thirdNum = sc.nextInt();
        
        System.out.printf("%d\n", firstNum+secondNum+thirdNum);
        System.out.printf("%.1f\n", (float)(firstNum+secondNum+thirdNum)/3);
    }
}
