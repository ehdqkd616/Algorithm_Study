import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main103 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[3];
        arr = br.readLine().split(" ");
        
		int y = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		boolean intercalation = false;
		int d = 0;
		
		if((y%4==0 && y%100!=0) || y%400==0) {
			intercalation = true;
		}
		
		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
			d = 31;
		} else if(m==4 || m==6 || m==9 || m==11) {
			d = 30;
		} else if(m==2) {
			if(intercalation) {
				d = 29;
			}else {
				d = 28;
			}
		}
		
		bw.write(String.valueOf(d));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
