package Staff;

public abstract class Employee {

    private String name;
    private String NI_number;
    private Double salary;

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
        if (salaryIncreasement >0){
            salary += salaryIncreasement;
        }
    }

    public double payBonus(){
        Double bonus = salary*0.01;
        return bonus;
    }

    public void changeName(String name) {
        if (name != null){
            this.name = name;
        }
    }

}
