public class TestStudents
{
    public static void main(String[] args)
    {
        Course cp = new Course("Computer Science");
        Course bio = new Course("Biology");
        Course ast = new Course("Astronomy");
        Student joe = new Student("Joe");
        joe.addCourse(cp);
        joe.addCourse(bio);
        joe.addCourse(ast);


        System.out.println(joe);
    }
}
