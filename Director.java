
import java.util.ArrayList;
import java.util.List;
public class Director implements User{
    private final String id;
    private final String name;
    private  final int age;
    private final  int hourlyRate;
    private final  int totalCompletedHours;
    private final List<Manager> managers = new ArrayList<>();
    public Director(String id, String name, int age, int hourlyRate, int totalCompletedHours) {

        this.id = id;
        this.name = name;
        this.hourlyRate=hourlyRate;
        this.age=age;
        this.totalCompletedHours=totalCompletedHours;

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
        return hourlyRate;
    }

    @Override
    public int gettotalHours() {
        return totalCompletedHours;
    }

    public void addManager(Manager manager){
        managers.add(manager);
    }
    public List<Manager> getManagers(){
        return managers;
    }

}
