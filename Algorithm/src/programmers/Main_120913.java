package programmers;

public class Main_120913 {

	public static void main(String[] args) {
		
		String my_str = "abcdef123";
		int n = 3;
		boolean isNeedExtraWork = my_str.length() % n != 0;
		int strLength = my_str.length() / n;
		
		String[] answer = null;
		if (isNeedExtraWork) {
			answer = new String[strLength+1];
		} else {
			answer = new String[strLength];
		}
				
		
		for(int i = 0 ; i < strLength ; i++) {
			String temp = my_str.substring(i*n, (i+1)*n);
			answer[i] = temp;
		}
		if (isNeedExtraWork) {
			answer[strLength] = my_str.substring(strLength*n);
		}
		
		System.out.println(answer);
	}

}
