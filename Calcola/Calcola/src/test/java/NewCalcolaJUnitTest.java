/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.angeloprete.calcola.Calcolatrice;
import java.util.*;

/**
 *
 * @author prete
 */
public class NewCalcolaJUnitTest {
    
    public static Calcolatrice c;
    public NewCalcolaJUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        c = new Calcolatrice();
        c.somma(5, 3);
        c.somma(7, 2);
        try{
            c.divisione(2, 1);
        }catch(Exception e){
            System.out.println("Errore nella divisione");
        }

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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void divisioneTest(){
        assertThrows(Exception.class, () -> {c.divisione(5, 0);});
    }
    
    @Test
    public void Test_prova(){
        int[] marks = new int[]{8, 9, 2};
        assertArrayEquals(marks, c.getArray(),"Funzionaa");
        }
    
    @Test
    public void getListTest(){
        List<Integer> vettore = new ArrayList<>();
        vettore = c.getList();
        for(Integer number : vettore){
            assertTrue(0 < number);
        } 
        //assertEquals(vettore,new ArrayList());
    }
}
