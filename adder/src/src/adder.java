package src;

public class adder {

	public static void main(String[] args) {
		int x = 6;
		int y = 4;
		int answer = Add(x, y);
		String answerStr = String.valueOf(answer);
		System.out.println("The sum of " + x + " + " + y + "is equal to:" + answerStr);

	
	}
	
	public static int Add(int A, int B ) {
		return A + B;
		
	}
}
