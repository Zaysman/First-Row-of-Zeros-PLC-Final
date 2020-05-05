
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = {
				{1, 2 , 3, 4, 5},
				{19, 91, 28, 82, 37},
				{12, 23, 34, 45, 56},
				{0, 0, 0, 0, 0},
				{67, 78, 89, 91, 12}
		};
		
		int zeroCount = 0;

		for(int i = 0; i < 5; i++) {		
			for(int j = 0; j < 5; j++) {
				if (x[i][j] != 0) {
					zeroCount = 0;
					break;
				}
				zeroCount++;
				
				if(zeroCount == 5) {
					System.out.println("First all-zero is: " + i);
				}
			}
		}
	}

}
