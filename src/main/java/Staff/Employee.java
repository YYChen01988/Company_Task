package Staff;

public class Employee {

    private String name;
    private  String NI_number;
    private  Double salary;

    public Employee(String name, String NI_number, Double salary) {
        this.name = name;
        this.NI_number = NI_number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI_number() {
        return NI_number;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(double salaryIncreasement){
        salary += salaryIncreasement;
    }

    public double payBonus(){
        Double bonus = salary/100;
        return bonus;
    }
}
