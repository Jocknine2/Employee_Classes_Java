package managementTests;

import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jen","UI734920T", 150000.00, "Glasgow", 1000000.00);
    }


    @Test
    public void getDirectorName(){
        assertEquals("Jen", director.getName());
    }

    @Test
    public void getDirectorNiNumber(){
        assertEquals("UI734920T", director.getNiNumber());
    }
    @Test
    public void getDirectorSalary(){
        assertEquals(150000.00, director.getSalary(), 0.0);
    }
    @Test
    public void getDirectorDeptName(){
        assertEquals("Glasgow", director.getDeptName());
    }

    @Test
    public void getPayRise(){
        assertEquals(155000.00, director.raiseSalary(5000.00), 0.0);
    }

    @Test
    public void getBonus(){
        assertEquals(151500.00, director.payBonus(), 0.0);
    }

    @Test
    public void getBudget(){
        assertEquals(1000000.00, director.getBudget(), 0.0);
    }

}
