import java.util.Scanner;
 
public class Main9 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[] = str.split("\\:");
        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int s = Integer.parseInt(arr[2]);
        
        System.out.println(h+":"+m+":"+s);
    }
}
