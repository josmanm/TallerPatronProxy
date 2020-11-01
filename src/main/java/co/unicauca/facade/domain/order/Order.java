/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facade.domain.order;

import static co.unicauca.facade.domain.order.State.NEW;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class Order {
    public int despatch;
    private Customer custmer;
    private LocalDate date;
    private State state;
    private List<Item> detalis;

    public Order() {
    }

    public Order(int despatch, Customer custmer, LocalDate date) {
        this.despatch = despatch;
        this.custmer = custmer;
        this.date = date;
        this.state = NEW;
        this.detalis = new ArrayList<Item>();
    }

    public Order(Customer custmer) {
        this.custmer = custmer;
        this.state = NEW;
        this.detalis = new ArrayList<Item>();
    }
    

    public int getDespatch() {
        return despatch;
    }

    public Customer getCustmer() {
        return custmer;
    }

    public LocalDate getDate() {
        return date;
    }

    public State getState() {
        return state;
    }

    public List<Item> getDetalis() {
        return detalis;
    }

    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    public void setCustmer(Customer custmer) {
        this.custmer = custmer;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setDetalis(List<Item> detalis) {
        this.detalis = detalis;
    }
    
    public void addDish(Dish dish, int amount){
        Item item = new Item(dish, amount);
        detalis.add(item);
    }
    
    public int calculateTotal(){
            int total = 0;
        for (Item item : detalis) {
            total += item.getDish().getPrice() * item.getAmount();
        }
        return total;
    }
}
