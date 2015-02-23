
public class Spreadsheet {
	public static int columns;
	public static int rows;
	public static Cell[][] spreadsheet;
	public static int cellwidth = 10;
	
	public Spreadsheet(int column, int row) {
		columns = column;
		rows = row;
		spreadsheet = new Cell[row][column];
		
	}
	public void Setcells(char c, int r, String info) {
		if (r > rows) {
			System.out.println("Not Valid input");
			
		} else if (spreadsheet[r - 1][GetCharacterNumeric(c)] == null) {
			spreadsheet[r - 1][GetCharacterNumeric(c)] = new Cell(info);
		} else {
			spreadsheet[r - 1][GetCharacterNumeric(c)].Setcells(info);
 		}
	}
	public static void Setcells (int c, int r, String info) {
		if (spreadsheet[r][c] == null) {
			spreadsheet[r][c] = new Cell(info);
		} else {
			spreadsheet[r][c].Setcells(info);
 		}
	}
	public int GetCharacterNumeric(char column) {
		return (Character.getNumericValue(Character.toUpperCase(column))) - Character.getNumericValue('A');
		
	}

	public void Clear() {
		for (int i=0; i < rows; i++) {
			for (int j=0; j < columns; j++) {
				spreadsheet[i][j] = null;
				
			}
		}
	}
	public void Clearcell(char c, int r, String info) {
		for (int i=0; i < rows; i++) {
			for (int j=0; j < columns; j++) {
				spreadsheet[r - 1][GetCharacterNumeric(c)] = null;
			}
		}
	}
	
	

	public void constructspreadsheet(int columns , int rows) {
	
		// Outer loop for rows
		for (int i = 0; i <= rows; i++){
			
				// Print row headings
				if (i == 0) {
					System.out.print("|");
					System.out.printf("%"+ cellwidth + "s", " ");
					System.out.print("|");
					
					
				} else if (i > 0) {
					if (i < 10) {
						System.out.print("|");
						System.out.printf("%" + cellwidth + "s", i);
						System.out.print("|");
					} else if (i >= 10) {
						System.out.print("|");
						System.out.printf("%" + cellwidth + "s", i);
						System.out.print("|");
					}
				}
				// Inner loop for columns
				for (int j = 0; j <= columns - 1; j++) {
					// Print column headings
					if (i == 0) {
						if (j < columns - 1) {
							System.out.printf("%" + cellwidth + "s" , (char)(j+65));
							System.out.print("|");
						} else if (j == columns -1) {
							System.out.printf("%" + cellwidth + "s", (char)(j + 65));
							System.out.println("|");
							dashes();
						}
					} else if (i > 0) { // Print the cell values
						if (j < columns - 1) {
							
							if (spreadsheet[i -1][j] !=null) {
								System.out.printf("%" + cellwidth + "s" , spreadsheet[i - 1][j].toString(cellwidth));
								System.out.print("|");
								
							} else  {
								System.out.printf("%" + cellwidth + "s" , " ");
								System.out.print("|");
								
							}
						} else if (j == columns -1) {
							if (spreadsheet[i - 1][j] != null) {
								System.out.printf("%" + cellwidth + "s", spreadsheet[i - 1  ][j].toString(cellwidth));
								System.out.println("|");
								dashes();
							} else {
								System.out.printf("%" + cellwidth + "s" , " ");
								System.out.println("|");
								dashes();
							}
						}
					}
				}
			}
	}
	//separates rows with dashes
	public void dashes() {
		for (int i = 1; i <= ((cellwidth+1)*(columns+1) + 1); i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
			