public class Staff implements User ,calculat{
    private  final String id;
    private final  String name;
    private  final int age;
    private final  int hourlyrate;
    private final  int totalhours;

    public Staff(String id, String name, int age, int hourlyrate, int totalhours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourlyrate = hourlyrate;
        this.totalhours = totalhours;

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
        return hourlyrate;
    }

    @Override
    public int gettotalHours() {
        return totalhours;
    }

    @Override
    public int calculatemethd() {
        return hourlyrate * totalhours;
    }
}
