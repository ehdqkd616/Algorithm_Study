import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main93 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[3];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		int temp = 0;
		
		if(a >= b) {
			temp = b;
			b = a;
			a = temp;
		}
		if(b >= c) {
			temp = c;
			c = b;
			b = temp;
		}
		if(a >= b) {
			temp = b;
			b = a;
			a = temp;
		}
		
		bw.write(String.valueOf(a)+" "+String.valueOf(b)+" "+String.valueOf(c));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
