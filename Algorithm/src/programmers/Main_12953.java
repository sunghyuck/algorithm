package programmers;
import java.util.Arrays;
import java.util.OptionalInt;

public class Main_12953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {2,6,8,14};
		int[] arr = { 1,2,3};
		int answer = 0;
		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		int i = 1;
		boolean flag = false;
		while (true) {
			int abc = max * i;
			for (int j = 0 ; j < arr.length ; j++) {
				if (abc % arr[j] != 0) {
					break;
				}
				if (j == arr.length - 1) {
					flag = true;
				}
			}
			i++;
			if (flag) {
				max=abc; 
				break;
			}
		}
		
		System.out.println(max);
	}

}
