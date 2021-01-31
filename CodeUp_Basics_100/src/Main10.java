import java.util.Scanner;
 
public class Main10 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[] = str.split("\\.");
        int y = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int d = Integer.parseInt(arr[2]);
        
        System.out.printf("%02d-%02d-%04d", d, m, y);
    }
}
