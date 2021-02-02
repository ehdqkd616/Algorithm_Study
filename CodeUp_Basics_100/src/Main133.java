import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main133 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		int result = 0;
		
		for(int i = a; i<=b; i++) {

			if(i%2==0) {
				result -= i;
				bw.write("-"+String.valueOf(i));
			}else{
				if(i==a) {
					result += i;
					bw.write(String.valueOf(i));
				}else {
					result += i;
					bw.write("+"+String.valueOf(i));
				}
			}
			if(i==b) {
				bw.write("="+String.valueOf(result));
				break;
			}	
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
