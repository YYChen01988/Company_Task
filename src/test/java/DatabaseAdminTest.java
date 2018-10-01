import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() throws Exception {
        databaseAdmin = new DatabaseAdmin("Bob", "DF000000", 2000.0);
    }

    @Test
    public void getName() {
        assertEquals("Bob", databaseAdmin.getName());
    }

    @Test
    public void getNINumber() {
        assertEquals("DF000000", databaseAdmin.getNI_number());
    }

    @Test
    public void getSalary() {
        assertEquals(2000.0,databaseAdmin.getSalary());
    }


    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(50.0);
        assertEquals(2050.0, databaseAdmin.getSalary());
    }

    @Test
    public void canGetBonus() {
        databaseAdmin.payBonus();
        assertEquals(20.0, databaseAdmin.payBonus());
    }
}
