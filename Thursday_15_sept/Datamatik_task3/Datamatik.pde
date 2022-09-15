
Teacher jesper;
Student lasse;
Student oskar;

void setup()
{
  jesper = new Teacher(32, "Jesper", false);
  lasse = new Student(24, "Lasse", false, 'a');
  oskar = new Student(20, "Oskar", false, 'a');
  
  println(jesper.name);
  println(lasse.name + " " + lasse.datamatikerTeam);
  println(oskar.name + " " + oskar.datamatikerTeam);
}
