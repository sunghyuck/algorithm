package programmers;

public class Main_12951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "for         the           last   week";
		String answer = "";
		String[] arr = s.split(" ");
		for (int i = 0 ; i < arr.length ; i ++) {
			if ("".equals(arr[i])) continue;
			arr[i] = arr[i].toLowerCase();
			if(arr[i].charAt(0) < 48 || arr[i].charAt(0) > 58) {
				String tmp = String.valueOf(arr[i].charAt(0));
				tmp = tmp.toUpperCase();
				arr[i] = tmp + arr[i].substring(1, arr[i].length());
				
			}
			if (i == 0) {
				answer = arr[i];
			} else {
				answer += "+" + arr[i];
			}
			
		}
		
		System.out.println("'" + answer + "'");
	}

}
