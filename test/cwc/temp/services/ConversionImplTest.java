/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwc.temp.services;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chris Chrysostom
 */
public class ConversionImplTest {
    
    public ConversionImplTest() {
    }

    /*
     * For your information:
     * [°C] = ([°F] - 32) × 5/9
     * [°F] = [°C] × 9/5 + 32
     */

    @Test
    public void testFahrenheitToCelcius() {
        double fahrenheitTemp = 41.0;
        ConversionImpl instance = new ConversionImpl();
        double expResult = 5.0;
        double result = instance.fahrenheitToCelcius(fahrenheitTemp);
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testCelciusToFahrenheit() {
        double celciusTemp = 100.0;
        ConversionImpl instance = new ConversionImpl();
        double expResult = 212.0;
        double result = instance.celciusToFahrenheit(celciusTemp);
        assertEquals(expResult, result, 0.01);
    }
}
