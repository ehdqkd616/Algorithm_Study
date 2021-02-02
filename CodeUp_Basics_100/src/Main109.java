import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main109 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
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
			bw.write(String.valueOf(i)+" ");
		}
		
		bw.flush();
		bw.close();
		br.close();

	}

}
