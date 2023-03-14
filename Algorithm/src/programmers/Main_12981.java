package programmers;

import java.util.HashSet;

public class Main_12981 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지
		
		//String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		//int n = 3;
		// 3,3
		
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		int n = 2;
		//1,3
	
		//String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		//int n = 5;
		// 0,0
		
		int[] answer = {0,0};
		
		HashSet<String> set = new HashSet<String>(); // 자료형 지정 
		set.add(words[0]);
		String lastWord = words[0];
		
		for (int i = 1 ; i < words.length ; i ++) {
			if (words[i].startsWith(lastWord.substring(lastWord.length()-1, lastWord.length()))) {
				if (set.contains(words[i])) {
					// 중복된 단어를 말한 경우
					answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
					answer[1] = (i / n) + 1;
					break;
				} else {
					lastWord = words[i];
					set.add(words[i]);
				}
			} else {
				// 끝말있기가 안된 경우
				answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
				answer[1] = (i / n) + 1;
				break;
			}
			if (i+1 == words.length) {
				answer[0] = 0;
				answer[1] = 0;
			}
		}
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}

}
