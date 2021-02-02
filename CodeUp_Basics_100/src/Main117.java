import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main117 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[10];
        arr = br.readLine().split(" ");
        
		int result = 0;
		
		int i = 0;
		
		while(i<10) {
			if(Integer.parseInt(arr[i])%5==0) {
				result = Integer.parseInt(arr[i]);
				break;
			}
			i++;
		}
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}

