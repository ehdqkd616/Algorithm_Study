import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main126 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int a = Integer.parseInt(br.readLine());
		int i = 2;
		
		boolean flag = false;
		
		
		while(i<a) {
			if(a%i==0) {
				flag = true;
				break;
			}
			i++;
		}
		
		if(flag) {
			bw.write("not prime");
		}else {
			bw.write("prime");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
