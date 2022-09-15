/*
 *
 * Hvis du kører programmet får du en række fejl.
 * Fix programmet så det kan køre og
 * outputtet bliver:
 * "7 is the smallest!"
 *
 * 
 */

  void setup() {
    int a = 7, b = 42;
    if (minimum(a,b) == a) {  // Fixed function call and condition syntax.
      println("a is the smallest!");
    }
  }
  
  
  int minimum(int a, int b) { //Fixed function return type
    int smaller; //Fixed variable declaration
    if (a < b) 
    {
      smaller = a;  
    } 
    
    else //Fixed else-statement syntax
    {
      smaller = b;
    }
    
    return smaller;  //Fixed variable syntax
  }
