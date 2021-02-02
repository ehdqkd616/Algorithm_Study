import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main90 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int result = 0;
		
		if(b==1 || b==2) {
			result = 112 - a/10000 + 1;
		}else if(b==3 || b==4) {
			result = 12 - a/10000 + 1;
		}
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
