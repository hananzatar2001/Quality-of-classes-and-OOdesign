import java.util.List;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Student Pupil1=new Students(1,"hanan","hananzatar@gmail.com");
        Student Pupil2=new Students(2,"yusof","yusofzatar@gmail.com");
        Student Pupil3=new Students(3,"raeq","raeqzatar@gmail.com");

        Course material1 = new Courses(101, "c1", 20);
        Course material2 = new Courses(102, "advance", 20);

        List<Student> students = new ArrayList();
        List<Course> courses = new ArrayList();

        students.add(Pupil1);
        students.add(Pupil2);
        students.add(Pupil3);

        courses.add(material1);
        courses.add(material2);

        University An_Najah_university = new University(students, courses);

        An_Najah_university.Register_the_student_in_the_course(1, 101);
        An_Najah_university.Register_the_student_in_the_course(1, 102);
        An_Najah_university.Register_the_student_in_the_course(2, 101);
        An_Najah_university.Register_the_student_in_the_course(2, 102);
        An_Najah_university.Register_the_student_in_the_course(3, 102);
        An_Najah_university.Register_the_student_in_the_course(3, 101);
        An_Najah_university.Register_the_student_in_the_course(1, 101);
        An_Najah_university.delet_Student_From_Course(1,2);
        An_Najah_university. Reports();
    }

}