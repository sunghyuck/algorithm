package programmers;

public class Main_12980 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 2
		//6 2
		//5000 5
		int n = 5000;
		int ans = 0;
		
		while(n > 0) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n--;
				ans++;
			}
		}
		System.out.println(ans);
	}

}
