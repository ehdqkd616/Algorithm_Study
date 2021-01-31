import java.util.Scanner;
 
public class Main4 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length() >= 50) {
        	str = str.substring(0, 50);
        }
        System.out.println(str);
    }
}
