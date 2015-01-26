
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExcelMain {
	static Scanner scan = new Scanner(System.in);
	public static int a;
	public static int b; 
	public static void main(String[] args) {	
	System.out.println("Welcome to John Roach's Excel Program!");
	System.out.println("How many Rows do you want?");
	a = scan.nextInt();
	System.out.println("How many Columns do you want?");
	b = scan.nextInt();
	
	String input = scan.nextLine();
	while (!input.equalsIgnoreCase("quit")) {
		Spreadsheet x = new Spreadsheet(a , b);
		x.constructspreadsheet(a , b);
		System.out.println("Input?");
		input = scan.nextLine();
		String[] array = input.split(" ");
		switch (array[0]) {
			case "Clear":
				//clear();
				break;
			case "sorta":
				//sorta();
				break;
			case "save":
				//save();
				break;
			case "load":
				load();
				break;
			case "sortd":
				//sortd();
				break;
			// case "rows":
				// a = Integer.parseInt(input.substring(input.indexOf('=') + 1));
				//break;
			//case "columns":
				//b = Integer.parseInt(input.substring(input.indexOf('=') + 1));
				//break;
			default :
				char c = parsec(input);
				int r = parser(input);
				String info =parseinfo(input);
				x.Setcells(c, r, info);
				break;
		}
		}
	//scan.close();
	}
	private static void load() {
		System.out.println("Which file do you want to access?");
		String s = scan.nextLine();
		File f = new File(s);
		Scanner input;
		try {
			input = new Scanner(f);
		}catch (FileNotFoundException e) {
			System.out.println("Could not load file.");
			return;
		} 
		while (input.hasNext()) {
			String cmd = input.nextLine();
			System.out.println(cmd);
		} 
		input.close();
		
	}
	public static char parsec (String s) {
		char c = s.charAt(0);
		return c;		
	}public static int parser (String s) {
		int r = Integer.parseInt(s.substring(1 , 2));
		return r;
	} public static String parseinfo (String s) {
		String info = s.substring(s.indexOf('=') + 2);
		return info;
	}
}
	


