
void setup()
{
  println(sum(10, 11));
  println(makeUpperCase("John Erik"));
  println(firstUpper("ja det er godt du"));
}



//2.b
int sum(int a, int b)
{
  return a + b;
}

//2.c
String makeUpperCase(String str)
{
  return str.toUpperCase();
}

//2.d
boolean firstUpper(String str)
{
 char c = str.charAt(0);
  
  if (Character.isUpperCase(c)) return true;
  
  return false;
}
  
  
