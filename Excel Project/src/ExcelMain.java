
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
public class ExcelMain {
	static Scanner scan = new Scanner(System.in);
	public static int alpha;
	public static int numeric; 
	public static char c;
	public static int r;
	public static String info;
	public static void main(String[] args) {	
	System.out.println("Welcome to John Roach's Excel Program!");
	System.out.println("How many Rows do you want?");
	numeric = scan.nextInt();
	System.out.println("How many Columns do you want?");
	alpha = scan.nextInt();
	Spreadsheet x = new Spreadsheet(alpha , numeric);
	String input = scan.nextLine();
	while (!input.equalsIgnoreCase("quit")) {
		x.constructspreadsheet(alpha , numeric);
		System.out.println("Input?");
		input = scan.nextLine();
		String[] array = input.split(" ");
		switch (array[0]) {
			case "Clear":
				x.Clear();
				break;
			case "Clearcell":
				String s = array[1].toString();
				
				c = input.charAt(s.indexOf(' ' + 1));
				r = Integer.parseInt(input.substring(c + 1, c + 2));
				info = input.substring(c+2);
				x.Clearcell(c,r,info);
				break;
			case "sorta":
				//sorta();
				break;
			case "save":
				//x.save(numeric , alpha , x , array);
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
				c = parsec(input);
				r = parser(input);
				info =parseinfo(input);
				x.Setcells(c, r, info);
				break;
		}
		}
	scan.close();
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






			

	
	


