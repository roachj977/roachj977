import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class Spreadsheet {
	public int columns;
	public int rows;
	public  Cell[][] spreadsheet;
	private int cellwidth = 10;
	
	public Spreadsheet(int column, int row) {
		this.columns = column;
		this.rows = row;
		this.spreadsheet = new Cell[row][column];
		
	}
	public void Setcells(char c, int r, String info) {
		if (r > rows) {
			System.out.println("Not Valid input");
			
		} else if (this.spreadsheet[r - 1][GetCharacterNumeric(c)] == null) {
			this.spreadsheet[r - 1][GetCharacterNumeric(c)] = new Cell(info);
		} else {
			this.spreadsheet[r - 1][GetCharacterNumeric(c)].Setcells(info);
		}
	}
	public int GetCharacterNumeric(char column) {
		return (Character.getNumericValue(Character.toUpperCase(column))) - Character.getNumericValue('A');
		
	}
	/*public static void Save( String[] array) {
		
		File f = new File(array[1]);
		PrintStream output = null;
		try {
			output = new PrintStream(f);
			output.
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length(); j++) {
				
		} catch (FileNotFoundException e) {
			System.out.println("Could not save.");
			return;
		}
}
	 
	 */
	public void Clear() {
		for (int i=0; i < rows; i++) {
			for (int j=0; j < columns; j++) {
				this.spreadsheet[i][j] = null;
				
			}
		}
	}
	public void Clearcell(char c, int r, String info) {
		for (int i=0; i < rows; i++) {
			for (int j=0; j < columns; j++) {
				this.spreadsheet[r - 1][GetCharacterNumeric(c)] = null;
			}
		}
	}
	
	

	public void constructspreadsheet(int columns , int rows) {
	
		// Outer loop for rows
		for (int i = 0; i <= this.rows; i++){
			
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
				for (int j = 0; j <= this.columns - 1; j++) {
					// Print column headings
					if (i == 0) {
						if (j < this.columns - 1) {
							System.out.printf("%" + cellwidth + "s" , (char)(j+65));
							System.out.print("|");
						} else if (j == this.columns -1) {
							System.out.printf("%" + cellwidth + "s", (char)(j + 65));
							System.out.println("|");
							dashes();
						}
					} else if (i > 0) { // Print the cell values
						if (j < this.columns - 1) {
							// System.out.println(">>> j = " + j + ", i = " + i);
							if (this.spreadsheet[i -1][j] !=null) {
								System.out.printf("%" + cellwidth + "s" , this.spreadsheet[i - 1][j].toString(cellwidth));
								System.out.print("|");
							} else  {
								System.out.printf("%" + cellwidth + "s" , " ");
								System.out.print("|");
						
							}
						} else if (j == this.columns -1) {
							if (this.spreadsheet[i - 1][j] != null) {
								System.out.printf("%" + cellwidth + "s", this.spreadsheet[i - 1  ][j].toString(cellwidth));
								System.out.println("|");
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
		for (int i = 1; i <= ((this.cellwidth+1)*(this.columns+1) + 1); i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	public static void save(int rows, int columns, Cell[][] spreadsheet, String[] array) {
			// set up output file
			File f = new File(array[1]);
			PrintStream output;
			try {
				output = new PrintStream(f);
			} catch (FileNotFoundException e) {
				System.out.println("Could not save.");
				return;
			}

			// write values for all variables
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++)
					if (spreadsheet[i][j] != null) {
						//char c = 
					}
			}

			// close file
			output.close();
		
	}	
	
	
	

}
			