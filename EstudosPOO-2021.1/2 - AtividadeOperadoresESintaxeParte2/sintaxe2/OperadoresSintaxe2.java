package sintaxe2;

public class OperadoresSintaxe2 {
	
	public static void main(String[] args) {
		int x = 80;
		int y = x % 2 == 0 ? x / 2: (3 * x) + 1;
		System.out.println("y: "+y);
	}
}