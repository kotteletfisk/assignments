
public class Fibonacci
{
	public static void main(String[] args)
	{
		fibonacci(1, 1);
	}


	public static void fibonacci(int x, int y)
	{
		if (x < 1000 && y < 1000)
		{

			int sum = x + y;
			System.out.println(sum);
			fibonacci(y, sum);
		}

	}
}