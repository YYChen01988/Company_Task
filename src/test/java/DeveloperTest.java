import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("Bob", "DF000000", 2000.0);
    }

    @Test
    public void getName() {
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void getNINumber() {
        assertEquals("DF000000", developer.getNI_number());
    }

    @Test
    public void getSalary() {
        assertEquals(2000.0,developer.getSalary());
    }


    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(50.0);
        assertEquals(2050.0, developer.getSalary());
    }

    @Test
    public void canGetBonus() {
        developer.payBonus();
        assertEquals(20.0, developer.payBonus());
    }
}
