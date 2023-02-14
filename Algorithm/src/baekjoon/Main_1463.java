package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1463 {

	/*
	 * 1 부터 N 까지 1로 만들 수 있는 최소 연산 수를 저장하는 배열을 만들어간다.
	 * 인터넷 검색
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int dp[] = new int[N+1];
		
		dp[1] = 0;
		for (int i = 2 ; i <= N ; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
			}
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3] + 1);
			}
		}
		System.out.println(dp[N]);
	}

}
