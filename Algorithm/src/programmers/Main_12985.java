package programmers;

public class Main_12985 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int a = 4;
		int b = 5;
		int answer = 1;
		
		for (int i = 1 ; i < n ; i++) {
			
			a = a/2 + a%2;
			b = b/2 + b%2;
			if (Math.abs(a-b) == 1 && Math.max(a,b)%2==0) {
				answer = i+1;
				break;
			}
		}
		
		System.out.println(answer);
	}

}