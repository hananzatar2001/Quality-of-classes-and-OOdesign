public class BudgetCalculator {
    public static int calculateBudget(User user) {
        int budget = 0;
        if (user instanceof Director director) {
            for (Manager manager : director.getManagers()) {
                budget += manager.calculatemethd();
            }
        } else if (user instanceof Manager) {
            Manager manager = (Manager) user;
            for (Staff staff : manager.getStaff()) {
                budget += staff.calculatemethd();
            }
        }
        return budget;

    }
}
