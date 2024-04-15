/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package exemple1junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jimen
 */
public class MetodesIT {
    /**
     * Test of contarVocals method, of class Metodes.
     */
    @Test
    public void testContarVocals() {
        System.out.println("contarVocals");
        String cadena = "";
        int expResult = 0;
        int result = Metodes.contarVocals(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarParaules method, of class Metodes.
     */
    @Test
    public void testContarParaules() {
        System.out.println("contarParaules");
        String cadena = "";
        int expResult = 0;
        int result = Metodes.contarParaules(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
