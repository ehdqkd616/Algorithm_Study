import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main94 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		if(b>=30) {
			b = b-30;
		} else {
			b = b-30+60;
			if(a>0) {
				a = a - 1;				
			}else {
				a = 23;
			}
		}
		
		bw.write(String.valueOf(a)+" "+String.valueOf(b));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
