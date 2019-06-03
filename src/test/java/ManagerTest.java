import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;


    @Before
    public void setUp(){
        manager = new Manager("John",
                            "JH6082A",
                                25000,
                            "Sales");
    }

    @Test
    public void canCheckDeptName(){
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canCheckName() {
        assertEquals("John", manager.getName());
    }

    @Test
    public void canCheckNiNumber() {
        assertEquals("JH6082A", manager.getNINumber());
    }

    @Test
    public void canCheckSalary() {
        assertEquals(25000, manager.getSalary());
    }

    @Test
    public void canIncreaseSalary() {
        manager.raiseSalary(500);
        assertEquals(25500, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {

        assertEquals(25250, manager.payBonus(25000));
    }
}
