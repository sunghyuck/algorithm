package programmers;

import java.util.Arrays;
public class Main_42885 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		[70, 50, 80, 50]	100	3
		[70, 80, 50]	100	3
		*/
		int[] people = {70, 80, 50, 50};
		int limit = 100;
		int answer = 0;
		//int[] people = {70, 50, 80};
		//int limit = 100;
		Arrays.sort(people);
		int lowIdx = 0;
		for (int i = people.length-1 ; i >= lowIdx  ; i --) {
			if (people[lowIdx] + people[i] <= limit) {
				lowIdx++;
			} 
			answer ++;
		}
		System.out.println(answer);
	}

}
