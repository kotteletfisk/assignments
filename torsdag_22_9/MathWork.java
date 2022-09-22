import java.util.Random;

public class MathWork
{


	static int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };



	
	public static void main(String[] args)
	{
		//divisible(4);

		//System.out.println(getRandom(arr));

		countDown(3);
	}



	public static void divisible(int x)
	{
		for (int i = 1; i <= 100; i++)
		{
			if (i % x == 0)
				System.out.println(i);
		}

	}

	public static int getRandom(int[] arr)
	{
		int randIndex = new Random().nextInt(arr.length);
		int value = arr[randIndex];
		return value;
	}


	public static void countDown(int x)
	{
		if (x > 0)
		{
			System.out.println(x);
			x = x - 1;
			countDown(x);
		}
		else System.out.println(0);
	}
}