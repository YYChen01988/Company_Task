package Staff.Management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String NI_number, Double salary, String deptName, Double budget) {
        super(name, NI_number, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    @Override
    public double payBonus() {
        Double bonus = getSalary()*0.02;
        return bonus;
    }
}
