import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Tony",
                            "JH453B",
                                62000,
                                "Marketing",
                                16500);
    }

    @Test
    public void checkName() {
        assertEquals("Tony", director.getName());
    }

    @Test
    public void checkNi() {
        assertEquals("JH453B", director.getNINumber());
    }

    @Test
    public void checkSalary() {
        assertEquals(62000, director.getSalary());
    }

    @Test
    public void checkDeptName() {
        assertEquals("Marketing", director.getDeptName());
    }

    @Test
    public void checkBudget() {
        assertEquals(16500, director.getBudget(), 0.1);
    }

    @Test
    public void canIncreaseSalary() {
        director.raiseSalary(500);
        assertEquals(62500, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(63240, director.payBonus(62000));
    }
}
