import java.util.List;
public class University
{
    private final List<Student> students;
    private  final List<Course> courses;
    public University(List<Student> students, List<Course> courses)
    {
        this.students = students;
        this.courses = courses;
    }
    public void Register_the_student_in_the_course(int studentid, int courseid)
    {
        Student studentToregistration = findStudent(studentid);
        Course courseToregistration = findCourse(courseid);

        if (studentToregistration != null && courseToregistration != null)
        {
            if (courseToregistration.registrstudent().size() < courseToregistration.Capacity())
            {
                studentToregistration.eregisturationcourse(courseToregistration);
                courseToregistration.registrstudent().add(studentToregistration);
            }
            else
            {
                System.out.println(studentToregistration.studentname()+"  The Course " + courseToregistration.Title() + " is already full.");
            }
        }
    }
    public void delet_Student_From_Course(int studentid, int courseid)
    {
        Student deletstudent = findStudent(studentid);
        Course deletcourse = findCourse(courseid);

        if (deletstudent != null && deletcourse != null)
        {
            if (deletcourse.registrstudent().contains(deletstudent))
            {
                deletstudent.deletcourse(deletcourse);
                deletcourse.registrstudent().remove(deletstudent);
                System.out.println("Student " + deletstudent.studentname()+ " has been dropped from the course " + deletcourse.Title());
            }
            else
            {
                System.out.println("Student " + deletstudent.studentname() + " is not enrolled in course " + deletcourse.Title());
            }
        }
    }

    public Student findStudent(int studentid)
    {
        for (Student student : students)
        {
            if (student.studentid() == studentid)
            {
                return student;
            }
        }
        return null;
    }

    public Course findCourse(int courseid)
    {
        for (Course course : courses)
        {
            if (course.courseid() == courseid)
            {
                return course;
            }
        }
        return null;
    }

    public void Reports()
    {
        System.out.println("\nAll available courses in the university:-");
        for (Course course : courses)
        {
            System.out.println(course .courseid()+ " - " + course.Title()+" - " +course.Capacity());
        }

        System.out.println("\nstudents enrolled in a specific course:-");
        for (Student student : students)
        {
            for (Course course : student.registurcourses())
            {
                System.out.println(student.studentname() + ":-"+course .courseid()+ " - " + course.Title());
            }
        }

        System.out.println("\nreport of courses in which a specific student is enrolled:-");
        for (Course course : courses)
        {
            for (Student student : course.registrstudent())
            {
                System.out.println(course.Title() + ":-"+student.studentname());
            }
        }


        System.out.println("\nAll the reports mentioned above:-");
        for (Course course : courses)
        {
            System.out.println(course .courseid()+ " - " + course.Title()+" - " +course.Capacity());
            for (Student student : course.registrstudent())
            {
                System.out.println(course.Title() + ":-"+student.studentname());
            }
        }
        for (Student student : students)
        {
            System.out.println(student.studentid()+ " - " + student.studentname()+" - " +student.Email());
            for (Course course : student.registurcourses())
            {
                System.out.println(student.studentname() + ":-"+course .courseid()+ " - " + course.Title());
            }
        }

    }


}
