import java.util.ArrayList;
import java.util.List;

public class Manager implements User ,calculat{
    private  final String name;
    private final  int age;
    private final  String id;
    private  final  int houlyRate;
    private  final int totalHours;
    private final  List<Staff> staff = new ArrayList<>();
    public Manager(String id,String name, int age , int houlyRate, int totalHours) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.houlyRate = houlyRate;
        this.totalHours = totalHours;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public double getRate() {
        return houlyRate;
    }

    @Override
    public int gettotalHours() {
        return totalHours;
    }
    public void addStaff(Staff staffMember){
        staff.add(staffMember);
    }

    public List<Staff> getStaff() {
        return staff;
    }
    @Override
    public int calculatemethd() {
        return houlyRate * totalHours;
    }
}
