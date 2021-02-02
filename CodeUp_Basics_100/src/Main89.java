import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main89 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[3];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		int result = 0;
		
		if(a <= b && a <= c) {
			if(b <= c) {
				result = b;
			}else {
				result = c;
			}
		}else if(b <= a && b <= c) {
			if(a <= c) {
				result = a;
			}else {
				result = c;
			}
		}else if(c <= a && c <= b) {
			if(b <= a) {
				result = b;
			}else {
				result = a;
			}
		}
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
