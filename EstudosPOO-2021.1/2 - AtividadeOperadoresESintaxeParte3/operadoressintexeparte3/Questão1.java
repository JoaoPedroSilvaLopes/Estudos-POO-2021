package operadoressintexeparte3;

public class Questão1 
{
	public static void main(String[] args)
	{
		int x = 80;
		int y;
		do
		{
			y = x % 2 == 0 ? x / 2: (3 * x) + 1;
			x = y;
			System.out.print(" -> "+y);
		}
		while (y > 1);
	}
}