package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_12941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A = {1, 2};
		int []B = {3, 4};
		int answer = 0;
		
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		for (int i = 0 ; i < A.length ; i ++) {
			a.add(A[i]);
			b.add(B[i]);
		}
		Collections.sort(a);
		Collections.sort(b, Collections.reverseOrder());
		for (int i = 0 ; i < a.size() ; i ++) {
			answer += a.get(i) * b.get(i);
		}
		
		System.out.println(answer);
	}

}
