import java.util.List;
import java.util.ArrayList;
public interface Course
{
    int courseid();
    String Title();
    String Instructor();
    int Capacity();
    List<Student> registrstudent();
}
class Courses implements Course
{
    private final  int courseid;
    private final String title;
    private final int Capacity;
    private final List<Student> registrstudent;

    public Courses(int courseid, String title, int maxCapacity)
    {
        this.courseid = courseid;
        this.title = title;
        this.Capacity = maxCapacity;
        this.registrstudent = new ArrayList<>();
    }
    @Override
    public int courseid()
    {
        return courseid;
    }

    @Override
    public String Instructor()
    {
        return null;
    }

    @Override
    public int Capacity()
    {
        return Capacity;
    }

    @Override
    public String Title()
    {
        return title;
    }

    @Override
    public List<Student> registrstudent()
    {
        return registrstudent;
    }
}


