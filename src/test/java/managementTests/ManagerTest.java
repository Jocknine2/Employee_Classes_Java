package managementTests;

import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Steve","TY872038X", 100000.00, "Glasgow");
    }


    @Test
    public void getManagerName(){
        assertEquals("Steve", manager.getName());
    }

    @Test
    public void getManagerNiNumber(){
        assertEquals("TY872038X", manager.getNiNumber());
    }
    @Test
    public void getManagerSalary(){
        assertEquals(100000.00, manager.getSalary(), 0.0);
    }
    @Test
    public void getManagerDeptName(){
        assertEquals("Glasgow", manager.getDeptName());
    }

    @Test
    public void getPayRise(){
        assertEquals(102000.00, manager.raiseSalary(2000.00), 0.0);
    }

    @Test
    public void getBonus(){
        assertEquals(101000.00, manager.payBonus(), 0.0);
    }


}
