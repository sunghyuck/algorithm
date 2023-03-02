package programmers;

public class Main_70129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "01110";
		int N = 0;
		int count = 0;
		
		while(true) {
			
			if ("1".equals(s)) {
				break;
			}
			
			long zeroCnt = s.chars().filter(c -> c == '0').count();
			if (zeroCnt > 0) {
				count += zeroCnt;
				s = s.replaceAll("0", "");
			}
			int length = s.length();
			s = Integer.toBinaryString(length);
			N++;
		}
		int[] answer = {N, count};
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}

}
