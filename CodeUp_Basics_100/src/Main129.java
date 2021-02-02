import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main129 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
		int n = Integer.parseInt(br.readLine());
		
        String[] arr = new String[n];
        arr = br.readLine().split(" ");

		bw.write(String.valueOf(arr[0])+" "+String.valueOf(arr[n/2])+" "+String.valueOf(arr[n-1]));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
