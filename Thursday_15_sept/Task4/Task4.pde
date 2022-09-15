
// 4.a
int[] intArray = {4, 7, 3, 1, 5, 6, 2};

String[] stringArray = {"ost", "laks", "sovs"};

boolean[] boolArray = {true, true, false};



void setup()
{
  stringPrint(stringArray);
 // println(arraySum(intArray));
 // println(arrayAverage(intArray));
 // println(sortArray(intArray));
}

//4.b
void stringPrint(String[] strings)
{
  for (int i = 0; i < strings.length;i++)
  {
    println(strings[i]);
  }
}
  
//4.c
int arraySum(int[] integers)
{
  int sum = 0;
  for (int i = 0; i < integers.length; i++)
  {
    sum += integers[i];
  }
  return sum;
}

//4.d
float arrayAverage(int[] integers)
{
  int sum = 0;
  for (int i = 0; i < integers.length; i++)
  {
    sum += integers[i];
  }
  
  return sum/integers.length;
}

//4.e ;) ;) ;) ;) 
int[] sortArray(int[] integers)
{
 int[] a = sort(integers, integers.length);
  
 return a;
}
  
  
  
  
