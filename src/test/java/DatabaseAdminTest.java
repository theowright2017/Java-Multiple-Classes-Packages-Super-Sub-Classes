import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {


    DatabaseAdmin databaseadmin;

    @Before
    public void setUp() {
        databaseadmin = new DatabaseAdmin("Tom",
                                    "JF560C",
                                        36000);
    }

    @Test
    public void checkName() {
        assertEquals("Tom", databaseadmin.getName());
    }

    @Test
    public void checkNI() {
        assertEquals("JF560C", databaseadmin.getNINumber());
    }

    @Test
    public void checkSalary() {
        assertEquals(36000, databaseadmin.getSalary());
    }

    @Test
    public void canIncreaseSalary() {
        databaseadmin.raiseSalary(500);
        assertEquals(36500, databaseadmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(36360, databaseadmin.payBonus(36000));
    }
}
