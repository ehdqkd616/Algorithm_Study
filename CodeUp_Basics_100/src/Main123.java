import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main123 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
        String[] arr = new String[n];
        arr = br.readLine().split(" ");
        
		int max = Integer.MIN_VALUE;

		for(int i = 0; i<n; i++) {
			max = max >= Integer.parseInt(arr[i]) ? max : Integer.parseInt(arr[i]);
		}
		
		bw.write(String.valueOf(max));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
