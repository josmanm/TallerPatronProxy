/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facade.domain.order;

import static co.unicauca.facade.domain.order.State.CANCELLED;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class Orderfacade {
    private Order order;
    
    public Orderfacade(){
    }
    
    public  void createOrder( Customer customer){
        order = new Order(customer);
    }
    
    public void addDish(Dish dish, int amount){
        order.addDish(dish, amount);
    }
    public void changeState( State state){
        order.setState(state);
    } 
    public void cancelOrder(){
        order.setState(CANCELLED);
    }
    public int calcularTotal(){
         return order.calculateTotal();
    }
    public Order getOrder(){
        return order;
    }
    
    public int totalDishes(){
         return order.getDetalis().size();
    }
    public void save(){
    }
}
