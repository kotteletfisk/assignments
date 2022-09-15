

void setup()
{
  printEmpty();
  printString("joe");
  printNameAge("Lasse", 24);
}

//1.a / 1.b

void printEmpty()
{
  println("");
}



void printString(String str)
{
  println(str);
}


void printNameAge(String name, int age)
{
  println("My name is " + name + ", I am " + age + " years old");
}
