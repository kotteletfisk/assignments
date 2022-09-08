
// 6.a
/*
int a = 5;
int b = 5;

void setup()
{
  if (a == 10 || b == 10 || a + b == 10)
  {
    println("Succes!");
  }
  
  else print("Failure");

}
*/

int x = 26;
int y = 2;
int z = 2;
  
void setup()
{
  if ( x == 10 || x == 20 || x == 30)
  {
    println("Failure");
  }
  
  else if (y == 10 || y == 20 || y == 30)
  {
    println("Failure");
  }
  
  else if (z == 10 || z == 20 || z == 30)
  {
    println("Failure");
  }
  
  
  else if (x + y + z == 30)
  {
    println("Succes!");
  }
  
  else println("Failure");
  
}
