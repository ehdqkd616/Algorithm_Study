import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main104 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[3];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		int result = b - c;
		String status = null;
		
		if(result>a) {
			status = "advertise";
		}else if(result==a) {
			status = "does not matter";
		}else{
			status = "do not advertise";
		}
		
		bw.write(status);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
