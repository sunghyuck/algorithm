package programmers;

import java.util.StringTokenizer;

public class Main_12951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aeek  ";
		String answer = "";
		
		StringTokenizer tokenizer = new StringTokenizer(s, " ");
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (" ".equals(token)) {
				answer += " ";
			} else {
				token = token.toLowerCase();
				if(token.charAt(0) < 48 || token.charAt(0) > 58) {
					String tmp = String.valueOf(token.charAt(0));
					tmp = tmp.toUpperCase();
					token = tmp + token.substring(1, token.length());
				}
				answer += token;
			}
		}
		System.out.println(answer);
	}

}
/*
String[] arr = s.split(" ");
for (int i = 0 ; i < arr.length ; i ++) {
	if ("".equals(arr[i])) {
		answer += " ";
	} else {
		arr[i] = arr[i].toLowerCase();
		if(arr[i].charAt(0) < 48 || arr[i].charAt(0) > 58) {
			String tmp = String.valueOf(arr[i].charAt(0));
			tmp = tmp.toUpperCase();
			arr[i] = tmp + arr[i].substring(1, arr[i].length());
		}
		answer += arr[i] + " ";
	}
}
answer = answer.substring(0,  answer.length() - 1);
*/