import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {



    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Tim",
                "JH465G",
                42000);
    }

    @Test
    public void checkName() {
        assertEquals("Tim", developer.getName());
    }

    @Test
    public void checkNI() {
        assertEquals("JH465G", developer.getNINumber());
    }

    @Test
    public void checkSalary() {
        assertEquals(42000, developer.getSalary());
    }

    @Test
    public void canIncreaseSalary() {
        developer.raiseSalary(500);
        assertEquals(42500, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(42420, developer.payBonus(42000));
    }

    @Test
    public void canChangeName(){
        developer.setName(null);
        assertEquals("Tim", developer.getName());
    }
}
