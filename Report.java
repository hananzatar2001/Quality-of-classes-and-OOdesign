public class Report {
    public void generateReport(User user  ){

        if (user instanceof Director director) {
            System.out.println("Director: " + director.name());
            for (Manager manager : director.getManagers()) {
                System.out.println("  Manager Details:"+"\n"+"Manager: " + manager.name() +
                                    " ID: " + manager.id()+
                                    " Name: " + manager.name()+
                                    " Age: " + manager.age()+
                                    " Hourly Rate: " + manager.getRate()+
                                    " Completed Hours: " + manager.gettotalHours());
                System.out.println("----------------------(＾◡＾)-------------------------------");
        }}else if (user instanceof Manager) {
            Manager manager = (Manager) user;
            System.out.println("Manager: " + manager.name());
            for (Staff staff : manager.getStaff()) {
                System.out.println("  Staff Details:" + "\n" + "  Staff: " + staff.name() +
                        "  ID: " + staff.id() +
                        "  Name: " + staff.name() +
                        "  Age: " + staff.age() +
                        "  Hourly Rate: " + staff.getRate() +
                        "  Completed Hours: " + staff.gettotalHours());
                System.out.println("------------------------(◕‿◕)-----------------------------");
            }
        }
        }
    }

