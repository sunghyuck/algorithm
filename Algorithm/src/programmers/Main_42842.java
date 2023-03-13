package programmers;

public class Main_42842 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brown = 24;
		int yellow = 24;
		int[] answer = new int[2];
		int square = brown + yellow;
		
		for (int i = 3 ; i < square ; i++) {
			int j = square / i;
			if (square % i == 0 && j >=3) {
				int col = Math.max(i, j);
				int row = Math.min(i, j);
				
				int ySquare = (col-2) * (row-2);
				
				if (yellow == ySquare) {
					answer[0] = col;
					answer[1] = row;
					break;
				}
			}
		}
	}

}
