import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Cell {

	public enum CellType {StringType, DateType, DoubleType}
	public CellType Type;
	public String strings;
	public LocalDate dates;
	public double doubles;
	public Cell(String s) {
		Setcells(s);	
	}
	public void Setcells(String i) {
		try{
			this.dates = LocalDate.parse(i , format);
			this.Type = CellType.DateType;
		} catch (DateTimeParseException Z) {
			
		try {
			this.doubles = Double.parseDouble(i);
			this.Type = CellType.DoubleType;
		}	catch (NumberFormatException A) {
			this.strings = i;
			this.Type = CellType.StringType;
		}
		}
	}
	private static DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/uuuu");
	
	public String toString(int l) {
		String i = "";
		switch (Type) {
		case DoubleType:
			i = String.format("%" + l + "f", doubles);
			break;
		case DateType:
			i = String.format("%" + l + "S", dates.format(format));
			break;
			default:
				i = strings;
				break;
		}
		if (i.length() > l) {
			return i.substring(0 , l -1) + ">";
		} else {
			return i;
		}
	}
}
