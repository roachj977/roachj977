
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
				int parse = input.indexOf(' ');
				c = input.charAt(parse + 1);
				r = Integer.parseInt(input.substring(parse + 2, parse + 3));
				info = input.substring(parse + 3);
				x.Clearcell(c,r,info);
				break;
			/*case "sorta":
				if (array[1].length() == 1) {
				x.sortarow();
				} else {
					x.sortarectangle();
				}
				break;
			*/case "save":
				Saveload.save(array);
				break;
			case "load":
				Saveload.load(array);
				break;
			/*case "sortd":
				if (array[1].length() == 1) {
				x.sortdrow();
				} else {
					x.sortdrectangle();
				}
				break;
			// case "rows":
				// a = Integer.parseInt(input.substring(input.indexOf('=') + 1));
				//break;
			//case "columns":
				//b = Integer.parseInt(input.substring(input.indexOf('=') + 1));
				//break;
			*/default :
				c = parsec(input);
				r = parser(input);
				info =parseinfo(input);
				x.Setcells(c, r, info);
				break;
		}
		}
	scan.close();
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






			

	
	


