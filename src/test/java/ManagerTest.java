import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Bob", "DF000000", 2000.0, "Glasgow");
    }

    @Test
    public void getName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void getNINumber() {
        assertEquals("DF000000", manager.getNI_number());
    }

    @Test
    public void getSalary() {
        assertEquals(2000.0,manager.getSalary());
    }

    @Test
    public void getDeptName() {
        assertEquals("Glasgow", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(50.0);
        assertEquals(2050.0, manager.getSalary());
    }

    @Test
    public void canGetBonus() {
        manager.payBonus();
        assertEquals(20.0, manager.payBonus());
    }
}
