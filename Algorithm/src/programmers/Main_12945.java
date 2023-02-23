package programmers;

import java.math.BigInteger;

public class Main_12945 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		
		int n = 100000;
		BigInteger[] arr = new BigInteger[n+1];
		arr[0] = new BigInteger("0");
		arr[1] = new BigInteger("1");
		for (int i = 2 ; i <= n ; i ++) {
			arr[i] = arr[i-1].add(arr[i-2]);
		}
		
		answer = arr[n].remainder(new BigInteger("1234567")).intValue();
		System.out.println(answer);
	}

}
