public class Course
{
    private String name;

    Course( String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;

    }

    @Override
    public String toString()
    {
        return name;
    }
}
