package operadoressintexeparte3;

public class Quest�o2 
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			for (int j = i; j <= i * i; j = j + i)
			{
				if (j == i*i)
				{
					System.out.println(j+" ");
				}
				else
				{
					System.out.print(j+" ");
				}
			}
		}
	}
}