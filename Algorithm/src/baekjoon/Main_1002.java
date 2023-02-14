package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 백준 1002
public class Main_1002 {

	public static void main(String[] args) throws Exception {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
        	String[] inputArr = br.readLine().split(" ");
        	int x1 = Integer.parseInt(inputArr[0]);
        	int y1 = Integer.parseInt(inputArr[1]);
        	int r1 = Integer.parseInt(inputArr[2]);
        	int x2 = Integer.parseInt(inputArr[3]);
        	int y2 = Integer.parseInt(inputArr[4]);
        	int r2 = Integer.parseInt(inputArr[5]);
    
        	double d = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
        	
        	if (d == 0 && (r1 == r2)) {
        		System.out.println(-1);
        	} else if ((d == (r1 + r2)) || d == Math.abs(r1 - r2)) {
        		System.out.println(1);
        	} else if ((d > r1 + r2) || d < Math.abs(r1 - r2)) {
        		System.out.println(0);
        	} else {
        		System.out.println(2);
        	}
        	/*
        	3
        	0 0 13 40 0 37
        	0 0 3 0 7 4
        	1 1 1 1 1 5
        	*/
        }
	
	}

}
