/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author George
 */
public class PrimeNumbersTest {
    
    public PrimeNumbersTest() {
    }
    
     private List<Integer> primeNumbers(int n)
    {
        ArrayList<Integer> primes = new ArrayList();

        while (n>1)
        {
            primes.add(n);
            --n;
        }
            
        
        return primes;
    }
    
    
    
    
    @Test
    public void PrimeNumberTest() {
         assertThat(primeNumbers(1), empty());
         assertThat(primeNumbers(2),contains(2));
         assertThat(primeNumbers(3),contains(3,2));
         assertThat(primeNumbers(4),contains(3,2));


    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
