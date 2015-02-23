
public class sorttest {

	public static void main(String[] args) {
		
		int array[][] = new int[][] {{5, 90, 35, 45, 150, 3 , 2 , 1, 9, 10 , 11 , 12},{66, 90, 35, 45, 150, 3 , 2 , 1, 9, 10 , 11 , 12}};
		bubblesort(array);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; i++) {
			System.out.println(array[i][j] + " ");
		}
		}
	}
		
	 public static void bubblesort(int[][] array) {
		int temp = 0;
		for (int i = 0; i< array.length; i++) {
			for (int j = 1; j < 24; j++) {
				if (array[(j - 1) / 24][(j - 1) % 24] > array[(j - 1) / 24][(j -1) % 24]) {
				temp = array[j / 24][(j % 24) - 1];
				array[(j - 1) / 24][(j- 1) % 24] = array[(j - 1) / 24][(j -1) % 24];
				array[(j - 1) / 24][(j - 1) % 24] = temp;
				
				
				}
				
			}
		}
	}

}
