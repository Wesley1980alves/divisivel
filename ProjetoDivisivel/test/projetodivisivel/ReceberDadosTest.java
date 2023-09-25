/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package projetodivisivel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Wesley
 */
public class ReceberDadosTest {
    
    public ReceberDadosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of receberdados method, of class ReceberDados.
     */
    @Test
    public void testReceberdados() {
        System.out.println("receberdados");
        int valor = 0;
        ReceberDados instance = new ReceberDados();
        int expResult = 6;
        int result = instance.receberdados(12);
        assertEquals(expResult, result);
        
    }
    
}
