import java.io.File;
import java.io.PrintStream;


public class Spreadsheet {
	// alphaidents are the columns (alphaidents = alphabetical identifiers)
	public int alphaidents;
	public int numericidents;
	public Cell[][] spreadsheet;
	private int cellwidth = 10;
	
	public Spreadsheet(int column, int row) {
		this.alphaidents = column;
		this.numericidents = row;
		this.spreadsheet = new Cell[row][column];
		
	}
	public void Setcells(char c, int r, String info) {
		if (this.spreadsheet[GetCharacterNumeric(c)][r - 1] == null) {
			this.spreadsheet[GetCharacterNumeric(c)][r - 1] = new Cell(info);
		} else {
			this.spreadsheet[GetCharacterNumeric(c)][r - 1].Setcells(info);
		}
	}
	public int GetCharacterNumeric(char column) {
		return (Character.getNumericValue(Character.toUpperCase(column))) - Character.getNumericValue('A');
		
	}
	public static void Save( String[] array) {
		
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

	
	
	
	
}
	public void constructspreadsheet(int numericidents , int alphaidents) {
			for (int i = 0; i <= this.numericidents; i++){
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
				for (int j = 0; j <= this.alphaidents - 1; j++) {
					if (i == 0) {
						if (j < this.alphaidents - 1) {
							System.out.printf("%" + cellwidth + "s" , (char)(j+65));
							System.out.print("|");
						}else if (j == this.alphaidents -1) {
							System.out.printf("%" + cellwidth + "s", (char)(j + 65));
							System.out.println("|");
							dashes();
							
						}
				} else if (i > 0) {
					if (j < this.alphaidents -1) {
						if (this.spreadsheet[j][i-1] !=null) {
							System.out.printf("%" + cellwidth + "s" , this.spreadsheet[j][i-1].toString(cellwidth));
							System.out.print("|");
							
							
						} else  {
							System.out.printf("%" + cellwidth + "s" , " ");
							System.out.print("|");
						
					}
				} else if (j == this.alphaidents -1) {
					if (this.spreadsheet[j][i-1] != null) {
						System.out.printf("%" + cellwidth + "s", this.spreadsheet[j][i-1].toString(cellwidth));
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
		for (int i = 1; i <= ((this.cellwidth+1)*(this.alphaidents+1) + 1); i++) {
			System.out.print("-");
		}
		System.out.println();
	}	
	

}
			