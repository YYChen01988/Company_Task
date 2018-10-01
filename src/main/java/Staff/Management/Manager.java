package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, String NI_number, Double salary, String deptName) {
        super(name, NI_number, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
