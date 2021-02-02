import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main136 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		for(int i = a; i<=b; i++) {
			for(int j = 1; j<10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
		br.close();
		
	}

}
