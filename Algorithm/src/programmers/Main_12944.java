package programmers;

public class Main_12944 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		int length = arr.length;
        int temp = 0;
        for (int i = 0 ; i < length ; i ++) {
            temp += arr[i];
        }
        
        double answer = (double) temp / (double) length;
		System.out.println(answer);
	}

}
