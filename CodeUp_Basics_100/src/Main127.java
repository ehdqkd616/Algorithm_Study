import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main127 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        
		double a = Double.parseDouble(arr[0]);
		double b = Double.parseDouble(arr[1]);
		
		int result = (int)Math.pow(a, b);
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
