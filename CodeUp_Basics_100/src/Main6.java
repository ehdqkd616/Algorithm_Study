import java.util.Scanner;
 
public class Main6 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[] = str.split("\\.");
        int i = Integer.parseInt(arr[0]);
        int f = Integer.parseInt(arr[1]);
        
        System.out.println(i);
        System.out.println(f);
    }
}
