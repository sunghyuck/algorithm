package programmers;

public class Main_12939 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "-1 -2 -3 -4";
		
		String[] strArr = s.split(" ");
		int[] arr = new int[strArr.length];
	
		for(int i = 0 ; i < strArr.length ; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 1 ; i < arr.length ; i ++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(min + " " + max);
	}

}
