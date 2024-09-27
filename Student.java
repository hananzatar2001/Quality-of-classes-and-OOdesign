import java.util.List;
import java.util.ArrayList;
public interface Student
{
    int studentid();
    String studentname();
    String Email();
    List<Course> registurcourses();
    void eregisturationcourse(Course course);
    void deletcourse(Course course);

}
class Students implements Student
{
    private final int studentid;
    private final String studentname;
    private final String Email;
    private  final List<Course> registurcourses;

    public Students(int studentid, String studentname, String Email)
    {
        this.studentid = studentid;
        this.studentname = studentname;
        this.Email = Email;
        this.registurcourses = new ArrayList();
    }
    @Override
    public int studentid()
    {
        return studentid;
    }
    @Override
    public String Email()
    {
        return Email;
    }
    @Override
    public String studentname()
    {
        return studentname;
    }
    @Override
    public List<Course> registurcourses()
    {
        return registurcourses;
    }
    @Override
    public void eregisturationcourse(Course course)
    {
        registurcourses.add(course);
    }
    public void deletcourse(Course course)
    {
        registurcourses.remove(course);
    }

}

