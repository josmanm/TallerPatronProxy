/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facade.app.client;

import co.unicauca.facade.domain.order.Customer;
import co.unicauca.facade.domain.order.Dish;
import co.unicauca.facade.domain.order.Orderfacade;
import co.unicauca.facade.domain.order.State;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class OrderFacedeTest {

    @Test
    public void testCreateOrder() {
        Orderfacade facade = new Orderfacade();
        facade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 BarrioCaldas", "3115677899", "Popayán"));
        facade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
        facade.addDish(new Dish(2, "Hamburguesa sencilla ", 4000), 3);
        facade.addDish(new Dish(3, "Jugo hit ", 1000), 2);
        assertEquals("Hamburguesa vegetariana",
        facade.getOrder().getDetalis().get(0).getDish().getName());
        assertEquals(State.NEW, facade.getOrder().getState());
        facade.changeState(State.FINALIZED);
        assertEquals(State.FINALIZED, facade.getOrder().getState());
        assertEquals(3, facade.totalDishes());
        assertEquals(24000, facade.calcularTotal());
        facade.cancelOrder();
        facade.changeState(State.CANCELLED);
    }

}
 
