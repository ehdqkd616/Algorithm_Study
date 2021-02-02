import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main69 { // ������

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		String[] arr = (br.readLine().split(" "));
		int a = Integer.parseInt(arr[0]);
		int r = Integer.parseInt(arr[1]);
		int n = Integer.parseInt(arr[2]);
		long num = a;
		
		for(int i=0; i<n-1; i++) {
			num *= r;
		}
		
		bw.write(String.valueOf(num));
		
		bw.flush();
		bw.close();
		br.close();
	}
}