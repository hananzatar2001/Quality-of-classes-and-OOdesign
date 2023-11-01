import java.util.HashMap;
import java.util.Map;

public class FakeDB {
    private static final Map<String,Director> directormap = new HashMap<>();
    private static final Map<String,Manager> managermap = new HashMap<>();
    private static final Map<String,Staff> Staffmap = new HashMap<>();
    public void addDirector(Director director) {
        directormap.put(director.id() , director );
    }
    public Director getDirector(String  directorID) {
        return directormap.get(directorID);
    }
    public void addManager(Manager manager) {
        managermap.put(manager.id(), manager);
    }
    public Manager getManager(String  managerID) {
        return managermap.get(managerID);
    }
    public void addStaff(Staff staffMember) {
        Staffmap.put(staffMember.id(), staffMember);
    }
    public Staff getStaff(String  staffID) {
        return Staffmap.get(staffID);
    }

}
