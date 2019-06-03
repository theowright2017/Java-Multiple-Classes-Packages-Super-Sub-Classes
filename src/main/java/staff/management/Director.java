package staff.management;

public class Director extends Manager {


    private double budget;

    public Director(String name,
                    String NINumber,
                    int salary,
                    String deptName,
                    double budget) {
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public int payBonus(int salary) {
        return (salary / 100) * 2 + salary;
    }
}
