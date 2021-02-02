import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main111 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        
        double a = Double.parseDouble(arr[0]);
        double b = Double.parseDouble(arr[1]);
		
        while(a<=b) {
        	System.out.printf("%.2f ", a);
        	a = a+0.01;
        }
		
		br.close();

	}

}
