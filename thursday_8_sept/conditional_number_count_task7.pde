
int input = -200;
int i;
void setup()
{
  while (i <= abs(input))
  {
    
    if (i == 6)
    {
      println("six");
    }
    
    else if (i == input/2 || i == input/-2)
    {
      println("HALF!");
    }
     
    else if (input < 0)
    {
      println("-"+i);
    }
   
    else println(i);
    i++;
  }
}
