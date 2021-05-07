/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.ImageIcon;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LLOST
 */
public class DangNhapFRMTest {
    
    public DangNhapFRMTest() {
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
     * Test of initIcon method, of class DangNhapFRM.
     */
    @Test
    public void testInitIcon() {
        System.out.println("initIcon");
        DangNhapFRM instance = new DangNhapFRM();
        instance.initIcon();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class DangNhapFRM.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        String user = "";
        String pass = "";
        DangNhapFRM instance = new DangNhapFRM();
        instance.login(user, pass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scale method, of class DangNhapFRM.
     */
    @Test
    public void testScale() {
        System.out.println("scale");
        ImageIcon icon = null;
        int width = 0;
        int height = 0;
        DangNhapFRM instance = new DangNhapFRM();
        ImageIcon expResult = null;
        ImageIcon result = instance.scale(icon, width, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class DangNhapFRM.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DangNhapFRM.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
