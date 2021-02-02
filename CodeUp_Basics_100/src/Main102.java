import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main102 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[3];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		int max, plus = 0;
		
		max = ((a >= b ? a : b) >= c) ? (a >= b ? a : b) : c;
		
		if(max==a) {
			plus = b+c;
		}else if(max==b) {
			plus = a+c;
		}else if(max==c) {
			plus = a+b;
		}
		
		if(plus>max) {
			bw.write("yes");
		}else {
			bw.write("no");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
