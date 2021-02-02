import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main101 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int calA = 0, calB = 0;
		
		switch (a) {
		case 1:
			calA = 400;
			break;
		case 2:
			calA = 340;
			break;
		case 3:
			calA = 170;
			break;
		case 4:
			calA = 100;
			break;
		case 5:
			calA = 70;
			break;
		}
		
		switch (b) {
		case 1:
			calB = 400;
			break;
		case 2:
			calB = 340;
			break;
		case 3:
			calB = 170;
			break;
		case 4:
			calB = 100;
			break;
		case 5:
			calB = 70;
			break;
		}
		
		int result = calA+calB;
		String resultStr = null;
		if(result>500) {
			resultStr = "angry";
		}else {
			resultStr = "no angry";
		}
		
		bw.write(resultStr);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
