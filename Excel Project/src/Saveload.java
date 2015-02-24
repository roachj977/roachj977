import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class Saveload {
	public static void save(String[] array) {
		// set up output file
		File f = new File(array[1]);
		PrintStream output = null;
		try {
			output = new PrintStream(f);
			// prints amount of rows and columns
			output.println(Integer.toString(ExcelMain.alpha) + " " + Integer.toString(ExcelMain.numeric));
			// prints the indexes of the array values as well as the values themselves
			for (int i = 0; i < Spreadsheet.rows; i++) {
				for (int j = 0; j < Spreadsheet.columns; j++) {
					if (Spreadsheet.spreadsheet[i][j] == null) {
						
				
					} else {
						output.println(i + " " + j + " " + Spreadsheet.spreadsheet[i][j].toString(Spreadsheet.cellwidth));
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Could not save.");
			
		}


		// close file
	
	}
	
	public static void load(String[] array) {
		System.out.println("Which file do you want to access?");
		File f = new File(array[1]);
		Scanner input = null;
		try { 
			input = new Scanner(f);
		} catch (FileNotFoundException F) {
			System.out.println("Could not load file.");
			return;
		}
		
		String sizes = input.nextLine();
		ExcelMain.numeric = Integer.parseInt(sizes.substring(0 , 1));
		ExcelMain.alpha = Integer.parseInt(sizes.substring(2));
		System.out.println(ExcelMain.numeric);
		System.out.println(ExcelMain.alpha);
		while (input.hasNext()) {
			String line = input.nextLine();
			Spreadsheet.rows = Integer.parseInt(line.substring(0 , 1));
			Spreadsheet.columns = Integer.parseInt(line.substring(2, 3));
			Spreadsheet.spreadsheet[Spreadsheet.rows][Spreadsheet.columns].Setcells(line.substring(4));
		}
		input.close();
		}
	}
