import java.util.ArrayList;

public class Student
{
    private String name;
    ArrayList<Course> course = new ArrayList<>();


    Student(String name)
    {
        this.name = name;
    }

    public void addCourse(Course c)
    {
        course.add(c);
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name ='" + name + '\'' +
                ", courses =" + course +
                '}';
    }

    //    public String toString()
//    {
//        String courseList = "";
//        for (int i = 0; i < course.size(); i++)
//        {
//            courseList.concat(course.toString());
//        }
//        return courseList;
//    }
}
