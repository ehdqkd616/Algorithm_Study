import java.util.Scanner;
 
public class Main5 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[] = str.split("");
        
        for(String s : arr){
        	System.out.println("\'"+s+"\'");
        }
        
    }
}
