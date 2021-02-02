import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        
		char a = arr[0].charAt(0);
		char b = arr[1].charAt(0);
		
		int start = 0;
		int end = 0;
		
		if(a >= b) {
			start = b;
			end = a;
		}else {
			start = a;
			end = b;			
		}
		
		for(int i = start; i <= end; i++) {
			System.out.printf("%c ", i);
		}
		
		br.close();

	}

}
