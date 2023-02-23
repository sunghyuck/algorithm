package programmers;

public class Main_12924 {

	public static void main(String[] args) {
		int n = 15;
		
		int answer = 0;
		
		for (int i = 1 ; i <= n ; i++) {
			int temp = 0;
			for (int j = i ; j <= n ; j++) {
				temp += j;
				if (temp == n) {
					answer++;
					break;
				} else if(temp > n) {
					break;
				}
			}
			
		}
		
		System.out.println(answer);

	}

}
