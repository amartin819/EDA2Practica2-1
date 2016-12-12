/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package material.utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jvelez
 */
public class IndexTest {
    
    public IndexTest() {
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

    /**
     * Test of allOccurrencesIndex method, of class Index.
     */
    @Test
    public void testAllOccurrencesIndex() {
        System.out.println("allOccurrencesIndex");
        Index instance = new Index();
        instance.load("ejemplo.txt","stopwords.txt");
        String expResult = "Nautilus 7,8\nNemo 7,12\nPeter 8\nVon Newman 7";
        String result = instance.allOccurrencesIndex();
        assertEquals(expResult, result);
    }

    /**
     * Test of firstOccurrencesIndex method, of class Index.
     */
    @Test
    public void testFirstOccurrencesIndex() {
        System.out.println("allOccurrencesIndex");
        Index instance = new Index();
        instance.load("ejemplo.txt","stopwords.txt");
        String expResult = "Nautilus 7\nNemo 7\nPeter 8\nVon Newman 7";
        String result = instance.allOccurrencesIndex();
        assertEquals(expResult, result);

    }
    
}
