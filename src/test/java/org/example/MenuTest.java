package org.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MenuTest {
    private Menu menu;

    @Before
    public void setUp() {
        menu = new Menu("Test Menu", 9.99, "Test Main", "Test Side", "Test Beverage");
    }

    @Test
    public void testGetPrice() {
        assertEquals(9.99, menu.getPrice(), 0.01);
    }

    @Test
    public void testToString() {
        String expected = "Test Menu - Test Main, Test Side, Test Beverage - 9.99Euro";
        assertEquals(expected, menu.toString());
    }
}