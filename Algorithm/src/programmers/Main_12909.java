package programmers;

import java.util.Stack;

public class Main_12909 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(()(";
		boolean answer = true;
		char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0 ; i < arr.length ; i ++) {
			if ('(' == arr[i]) {
				stack.push(arr[i]);
			} else {
				if (stack.empty() || ')' == stack.peek()) {
					answer = false;
					break;
				} else {
					stack.pop();
				}		
			}
		}
		if (stack.empty()) {
			answer = false;
		}
		System.out.println(answer);
	}

}
