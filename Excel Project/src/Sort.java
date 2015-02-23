
public class Sort {

	public static void sorta(Cell[][] array) {
		int columnnum = 1;
		int rownum = 1;
		int cellnum = columnnum * rownum;
		
		boolean swapped = false;
		
		Cell temp;
		
		for (int i = 0; i < cellnum - 1; i++) {
			swapped = false;
			for (int j = cellnum - 1; j < i; j --) {
				if (array[j / rownum][j % rownum].doubles < array[((j-1)/rownum)][((j-1)%rownum)].doubles) {
					temp = array[j / rownum][(j % rownum)];
					array[(j / rownum)][(j % rownum)] = array[(j - 1) / rownum][(j -1) % rownum];
					array[(j - 1) / rownum][(j - 1) % rownum] = temp;
					
					swapped = true;
					
				}
			}if (swapped == false) {
			break;
		}
		
		}
	} 
	
}
