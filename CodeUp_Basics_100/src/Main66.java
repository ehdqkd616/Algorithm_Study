import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main66 {

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
			
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=1; sum<num; i++) {
			sum += i;
		}
		
		bw.write(String.valueOf(sum));
		
		bw.flush();
		bw.close();
		br.close();
	}
}