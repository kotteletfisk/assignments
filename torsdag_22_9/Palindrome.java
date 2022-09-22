import java.util.Arrays;
import java.lang.StringBuilder;
import java.lang.String;



public class Palindrome
{
	public static void main(String[] args)
	{
		printlfPalindrome("Den Laks skal ned");

	}


	private static void printlfPalindrome(String str)
	{
		str = str.toLowerCase();
		char[] cArray = str.toCharArray();
		StringBuilder reverse = new StringBuilder();

		for (int i = cArray.length - 1; i >= 0; i--)
			{
				reverse.append(cArray[i]);
			}
		
		String reversed = reverse.toString();

		if (reversed.equals(str))
			System.out.println(reversed);

		else System.out.println("0");

	}

}