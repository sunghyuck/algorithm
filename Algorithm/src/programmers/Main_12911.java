package programmers;

public class Main_12911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 78;
		int answer = n;
		int nCnt = Integer.bitCount(n);
		while(true) {
			answer++;
			int ansCnt = Integer.bitCount(answer);
			if (ansCnt == nCnt) break;
		}
		
		System.out.println(answer);
	}

}
