
Teacher jesper;
Student lasse;
Student oskar;




void setup()
{
  jesper = new Teacher(32, "Jesper", false);
  lasse = new Student(24, "Lasse", false, 'a');
  oskar = new Student(20, "Oskar", false, 'a');
  
 // println(jesper.name);
 // println(lasse.name + " " + lasse.datamatikerTeam);
 // println(oskar.name + " " + oskar.datamatikerTeam);
  
  //5.a
  for (int i = 0; i < students.length; i++)
  {
    students[i] = new Student(0, "student", false, 'a');
  }
  
  //Student name defaults to "student"
  //printStudentName(students, 3);
  println(stringArrayIndex(strings, "ged"));
  
}


// 5.a
Student[] students = new Student[10];


//5.b
void printStudentName(Student[] studentArray, int index)
{
  println(studentArray[index].name);
}


//5.c
String[] strings = {"Hej", "dav", "Sovs"};

int stringArrayIndex(String[] array, String string)
{
  for (int i = 0; i < array.length; i++)
  {
    if (array[i] == string)
    {
      return i;
    }
  }
  return -1;
}
