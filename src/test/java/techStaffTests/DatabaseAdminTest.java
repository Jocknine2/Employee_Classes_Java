package staffTests;

import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Michael","TH123749T", 65000.00);
    }

    @Test
    public void getDeveloperName(){
        assertEquals("Michael", databaseAdmin.getName());
    }

    @Test
    public void getDeveloperNiNumber(){
        assertEquals("TH123749T", databaseAdmin.getNiNumber());
    }
    @Test
    public void getDeveloperSalary(){
        assertEquals(65000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void getPayRise(){
        assertEquals(67000.00, databaseAdmin.raiseSalary(2000.00), 0.0);
    }

    @Test
    public void getBonus(){
        assertEquals(65650.00, databaseAdmin.payBonus(), 0.0);
    }

}
