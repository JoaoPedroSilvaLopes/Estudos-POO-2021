package operadoressintexeparte3;

public class Quest�o3 
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			int x = 1;
			for (int j = i; j > 0; j--)
			{
				x = j * x;
			}
			System.out.println(i+"! � igual a: "+x);
		}
	}
}