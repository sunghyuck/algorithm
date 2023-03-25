package programmers;

public class Main_12914 {

	public static void main(String[] args) {
		int n = 1; // 5
		//int n = 3; // 3
		long answer = 0;
		long[] arr = new long[n+1];
		arr[1] = 1L;
		arr[2] = 2L;
		for (int i = 3 ; i <= n ; i++) {
			arr[i] = (arr[i-1] + arr[i-2]) %1234567;
		}
		answer = arr[n];
		System.out.println(answer);

	}

}
