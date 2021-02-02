import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main135 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
		double a = Double.parseDouble(br.readLine());
		int b = Integer.parseInt(br.readLine());

		double c = a;
		
        String[] arr = new String[b];
        arr = br.readLine().split(" ");
        
        for(int i=0; i<b; i++) {
    		c = c + (c*Double.parseDouble(arr[i]))/100;
        }
        
        int result = (int) (Math.round(c)-a);
        
        if(result>0) {
			bw.write(result+"\n"+"good");
		}else if(Math.round(c)-a==0) {
			bw.write(result+"\n"+"same");
		}else {
			bw.write(result+"\n"+"bad");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
