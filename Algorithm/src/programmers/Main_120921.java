package programmers;

import java.io.IOException;

public class Main_120921 {

	public static void main(String[] args) throws IOException {
		String a = "abc";
		String b = "abc";
		int answer = 0;
		if (a.equals(b)) {
			System.out.println(answer);
			return;
		}
		for (int i = 1 ; i <= a.length() ; i ++) {
			a = a.substring(a.length()-1, a.length()) + a.substring(0, a.length()-1);
			if (a.equals(b)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

}
