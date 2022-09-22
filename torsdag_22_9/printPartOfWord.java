class printPartOfWord
{
	public static void main(String[] args)
	{
		System.out.println(printPartOfWord("København", 1, 4));
	}
	


	public static String printPartOfWord(String str, int startI, int lengthI)
	{

		String sub = str.substring(startI, startI + lengthI);
		return sub;

	}

}
