/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.hamcrest.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author George
 */
public class PrimeFactorsTest {

    private List<Integer> primeFactors(int n)
    {
        ArrayList<Integer> factors = new ArrayList();

        for (int divisor = 2;n>1;++divisor)
        {
            for (;n%divisor == 0;n/=divisor){
            factors.add(divisor);
            }   
        }      
        return factors;
    }
    
    
    
    
    @Test
    public void PrimeFactorTest() {
         assertThat(primeFactors(1), empty());
         assertThat(primeFactors(2),contains(2));
         assertThat(primeFactors(3),contains(3));
         assertThat(primeFactors(4),contains(2,2));
         assertThat(primeFactors(5),contains(5));
         assertThat(primeFactors(6),contains(2,3));
         assertThat(primeFactors(7),contains(7));
         assertThat(primeFactors(8),contains(2,2,2));
         assertThat(primeFactors(9),contains(3,3));
         assertThat(primeFactors(10),contains(2,5));
         assertThat(primeFactors(25684520),contains(2,5,7,11,13,17));

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
