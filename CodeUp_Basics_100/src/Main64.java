import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main64 {

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String hbcs[] = br.readLine().split(" ");
		int h = Integer.parseInt(hbcs[0]);
		int b = Integer.parseInt(hbcs[1]);
		int c = Integer.parseInt(hbcs[2]);
		int s = Integer.parseInt(hbcs[3]);
		double sum = (double)h*b*c*s;
		double sumMB = sum/8/1024/1024;
		
		System.out.printf("%.1f MB", sumMB);
		
		br.close();
	}
}