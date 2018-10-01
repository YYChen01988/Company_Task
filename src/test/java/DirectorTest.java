import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DirectorTest {

    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Bob", "DF000000", 2000.0, "Glasgow", 999999.0);
    }

    @Test
    public void getName() {
        assertEquals("Bob", director.getName());
    }

    @Test
    public void getNINumber() {
        assertEquals("DF000000", director.getNI_number());
    }

    @Test
    public void getSalary() {
        assertEquals(2000.0,director.getSalary(), 0);
    }

    @Test
    public void getDeptName() {
        assertEquals("Glasgow", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(100.0);
        assertEquals(2100.0, director.getSalary(), 0);
    }

    @Test
    public void canGetBonus() {
        director.payBonus();
        assertEquals(40.0, director.payBonus(), 0);
    }

    @Test
    public void canGetBudget() {
        assertEquals(999999.0, director.getBudget(),0);
    }

    @Test
    public void canChangeName() {
        director.changeName("Angie");
        assertEquals("Angie", director.getName());
    }
}
