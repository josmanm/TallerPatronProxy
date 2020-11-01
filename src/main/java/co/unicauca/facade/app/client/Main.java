/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facade.app.client;

import co.unicauca.facade.acess.Factory;
import co.unicauca.facade.acess.IOrderRepository;
import co.unicauca.facade.domain.order.Customer;
import co.unicauca.facade.domain.order.Dish;
import co.unicauca.facade.domain.order.IOrderService;
import co.unicauca.facade.domain.order.OrderServiceLogger;
import co.unicauca.facade.domain.order.Orderfacade;
import co.unicauca.facade.domain.order.ProxyClient;
import co.unicauca.facade.domain.order.State;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class Main {
    public static void main(String[] args) {
        Orderfacade orderFacade = new Orderfacade();
        
        //El objeto proxy. Se le pasa el objeto real por el constructor
         IOrderService orderProxy = new OrderServiceLogger(orderFacade);

        orderFacade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 BarrioCaldas", "3115677899", "Popayán"));
        orderFacade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
        orderFacade.addDish(new Dish(2, "Hamburguesa sencilla", 4000), 3);
        orderFacade.addDish(new Dish(3, "Jugo hit", 1000), 2);
        System.out.println("Pedido creado");
        orderFacade.changeState(State.CONFIRMED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        orderFacade.changeState(State.DISPACHED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        orderFacade.changeState(State.FINALIZED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        System.out.println("El valor total del pedido es: " + orderFacade.calcularTotal());
        System.out.println("Total de platos pedidos: " + orderFacade.totalDishes());

        //Ahora ejecutamos el cliente proxy, y le pasamos el sujeto que debe utilizar.
        ProxyClient client = new ProxyClient(orderProxy);
        client.CreateOrder();




    }
}
