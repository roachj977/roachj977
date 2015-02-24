
public class Overload {

	public static void main(String[] args) {
		int[] integerValues = {100, 34, 290, 4, 6, 6, 34, 100, 34};
		double[] doubleValues = {0.1, 3.4, 29.0, 0.4, 0.1, 6.6, 3.4, 0.1, 0.1};

		System.out.println("Integer mean: " + Mean(integerValues));
		System.out.println("Double mean: " + Mean(doubleValues));
		System.out.println("Integer median: " + Median(integerValues));
		System.out.println("Double median: " + Median(doubleValues));
		// System.out.println("Integer mode: " + Mode(integerValues));
		// System.out.println("Double mode: " + Mode(doubleValues));
	}
	
	public static int[] Copy(int[] values){
		if(values == null){
			return null;
		}
		
		int[] newArray = new int[values.length];
		
		for(int position = 0; position < values.length; position++) {
			newArray[position] = values[position];
		}
		
		return newArray;
	}
	
	public static double[] Copy(double[] values){
		if(values == null){
			return null;
		}
		
		double[] newArray = new double[values.length];
		
		for(int position = 0; position < values.length; position++) {
			newArray[position] = values[position];
		}
		
		return newArray;
	}

	public static void Sort(int[] values){
		if(values != null) {
			for(int position = 0; position < values.length; position++){
				int positionOfLargest = position;
				int currentPositionValue = values[position];
				
				for(int positionToRight = position + 1; positionToRight < values.length; positionToRight++){
					if(values[positionToRight] < currentPositionValue) {
						positionOfLargest = positionToRight;
					}
				}
				
				values[position] = values[positionOfLargest];
				values[positionOfLargest] = currentPositionValue;
			}
		}
	}
	
	public static void Sort(double[] values){
		if(values != null) {
			for(int position = 0; position < values.length; position++){
				int positionOfLargest = position;
				double currentPositionValue = values[position];
				
				for(int positionToRight = position + 1; positionToRight < values.length; positionToRight++){
					if(values[positionToRight] < currentPositionValue) {
						positionOfLargest = positionToRight;
					}
				}
				
				values[position] = values[positionOfLargest];
				values[positionOfLargest] = currentPositionValue;
			}
		}
	}
	
	public static double Mean(int[] values){
		// don't want to change original array, so make a copy before sorting
		int[] copy = Copy(values);
		Sort(copy);
		
		int sum = 0;
		for(int position = 0; position < copy.length; position++) {
			sum += copy[position];
		}
		
		double mean = (double) sum / (double) copy.length;
		
		return mean;
	}
	
	public static double Mean(double[] values) {
		double[] copy = Copy(values);
		Sort(copy);
		
		double sum = 0;
		for(int position = 0; position < copy.length; position++) {
			sum += copy[position];
		}
		
		double mean =  sum / copy.length;
		
		return mean;
	} 
	public static int Median(int[] values) {
		int pointer = values.length / 2;
		
		int median = values[pointer];
		return median;
	}
	public static double Median(double[] values) {
		double[] copy = Copy(values);
		Sort(copy);
		double median = 0;
		if (copy.length % 2 == 0){
			median = (copy[(copy.length / 2) -1] + copy[(copy.length / 2) + 1]) / 2; 
		} else {
			median = copy[(copy.length / 2) + 1];
		}
		
		
		return median ;
	}
	
}

