//You are required to design and implement a small application for a company that
//manages the following user structure:
//● Director: Has a list of Managers and Staff.
//● Manager: Has a list of Staff.
//● Staff
//All users in the system share common attributes, which include ID, name, age, hourly
//rate, and the total number of completed hours for each month.
//The application's primary tasks are to generate a set of reports, including:
//● A list of staff for each Director or Manager.
//● The required budget for each Manager or Director.
//The system should be flexible to allow for the addition of new reports. To enhance report
//generation, template stores for the reports should be created, and these template stores
//should be used to create new reports.
//Data should be stored in a database (fake DB) and retrieved from it. Your code should
//ensure that only one connection is open for each user.

public class Main {
    public static void main(String[] args) {
        FakeDB fakeDB = new FakeDB();

        Report reportGenerator = new Report();

        Director director = new Director("1", "Director hanan", 40, 50, 160);
        Director director1 = new Director("2", "Director siwar", 40, 50, 160);

        Manager manager1 = new Manager("1", "Manager 1", 35, 40, 160);
        Manager manager2 = new Manager("2", "Manager 2", 38, 42, 160);
        Manager manager3 = new Manager("3", "Manager 3", 38, 42, 160);


        Staff staff1 = new Staff("1", "Staff 1", 25, 20, 160);
        Staff staff2 = new Staff("2", "Staff 2", 28, 22, 160);
        Staff staff3 = new Staff("3", "Staff 3", 28, 22, 160);
        Staff staff4 = new Staff("4", "Staff 4", 28, 22, 160);

        fakeDB.addDirector(director);
        fakeDB.addDirector(director1);
        fakeDB.addManager(manager1);
        fakeDB.addManager(manager2);
        fakeDB.addManager(manager3);
        fakeDB.addStaff(staff1);
        fakeDB.addStaff(staff2);
        fakeDB.addStaff(staff3);
        fakeDB.addStaff(staff4);

        director.addManager(manager1);
        director.addManager(manager2);
        director1.addManager(manager3);


        manager1.addStaff(staff1);
        manager2.addStaff(staff2);
        manager2.addStaff(staff3);
        manager3.addStaff(staff4);



        System.out.println("Manager List Report for Director:");
        reportGenerator.generateReport(director);
        reportGenerator.generateReport(director1);


        System.out.println("Staff List Report for Manager:");
        reportGenerator.generateReport(manager1);
        reportGenerator.generateReport(manager2);
        reportGenerator.generateReport(manager3);

        System.out.println("\nBudget Director: " +BudgetCalculator.calculateBudget(director)+"(≧◡≦)");
        System.out.println("\nBudget Director: " +BudgetCalculator.calculateBudget(director1)+"(≧◡≦)");

        System.out.println("\nBudget Manager1: " + BudgetCalculator.calculateBudget(manager1)+"(≖‿≖)");
        System.out.println("\nBudget Manager2: " + BudgetCalculator.calculateBudget(manager2)+"(◠‿◠)");
        System.out.println("\nBudget Manager2: " + BudgetCalculator.calculateBudget(manager3)+"(◠‿◠)");




    }
}