package org.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class OrderSystemTest {
    private OrderSystem orderSystem;
    private Menu testMenu;


    @Before
    public void setUp() {
        orderSystem = new OrderSystem();
        testMenu = new Menu("Test Menu", 9.99, "Test Main", "Test Side", "Test Beverage");
        orderSystem.addMenu(1, testMenu);
    }

    @Test
    public void testAddAndGetMenu() {
        assertEquals(testMenu, orderSystem.getOrderById(1));
    }

}