import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main124 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        
		int k = Integer.parseInt(arr[0]);
		int h = Integer.parseInt(arr[1]);
		
		int moneyK = (k%2==0 ? (k/2)*10 : k/2+1);
		int moneyH = (h%2==0 ? (h/2)*10 : h/2+1);
		
		int result = moneyK+moneyH;
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
