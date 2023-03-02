package programmers;

import java.util.Stack;

public class Main_12973 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "baabaa";
		int answer = -1;
		char arr[] = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		stack.push(arr[0]);
		for (int i = 1 ; i < arr.length ; i++) {
			if (stack.isEmpty()) {
				stack.push(arr[i]);
			} else {
				if (stack.peek() == arr[i]) {
					stack.pop();
				} else {
					stack.push(arr[i]);
				}
			}
		}
		answer = stack.isEmpty() ? 1 : 0;
		System.out.println(answer);
	}

}
