/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facade.app.client;

import co.unicauca.facade.acess.IOrderRepository;
import co.unicauca.facade.domain.order.Customer;
import co.unicauca.facade.domain.order.Dish;
import co.unicauca.facade.domain.order.Orderfacade;
import co.unicauca.facade.domain.order.State;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class Main {
    public static void main(String[] args) {
        Orderfacade facade = new Orderfacade();
        facade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 BarrioCaldas", "3115677899", "Popayán"));
        facade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
        facade.addDish(new Dish(2, "Hamburguesa sencilla", 4000), 3);
        facade.addDish(new Dish(3, "Jugo hit", 1000), 2);
        System.out.println("Pedido creado");
        facade.changeState(State.CONFIRMED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        facade.changeState(State.DISPACHED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        facade.changeState(State.FINALIZED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        System.out.println("El valor total del pedido es: " + facade.calcularTotal());
        System.out.println("Total de platos pedidos: " + facade.totalDishes());

        System.out.println("Pedido grabado con éxito en la base de datos");

    }
}
