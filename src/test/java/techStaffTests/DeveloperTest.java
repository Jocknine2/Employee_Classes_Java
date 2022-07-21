package staffTests;

import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Nick","YH734921W", 60000.00);
    }

    @Test
    public void getDeveloperName(){
        assertEquals("Nick", developer.getName());
    }

    @Test
    public void getDeveloperNiNumber(){
        assertEquals("YH734921W", developer.getNiNumber());
    }
    @Test
    public void getDeveloperSalary(){
        assertEquals(60000.00, developer.getSalary(), 0.0);
    }
    @Test
    public void getPayRise(){
        assertEquals(62000.00, developer.raiseSalary(2000.00), 0.0);
    }

    @Test
    public void getBonus(){
        assertEquals(60600.00, developer.payBonus(), 0.0);
    }

}
