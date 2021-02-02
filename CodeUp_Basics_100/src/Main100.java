import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main100 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[4];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		int d = Integer.parseInt(arr[3]);
		
		int result = a+b+c+d;
		
		String resultStr = null;
		if(result==0) {
			resultStr = "¸ð";
		}
		else if(result==1) {
			resultStr = "µµ";
		}else if(result==2) {
			resultStr = "°³";
		}else if(result==3) {
			resultStr = "°É";
		}else if(result==4)
			resultStr = "À·";
		
		bw.write(resultStr);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
