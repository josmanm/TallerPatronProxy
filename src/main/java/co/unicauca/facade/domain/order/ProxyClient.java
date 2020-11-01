/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facade.domain.order;

import co.unicauca.facade.acess.Factory;
import co.unicauca.facade.acess.IOrderRepository;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class ProxyClient {
    private IOrderService orderServicie;
    
    public  ProxyClient( IOrderService orderService){
        this.orderServicie=orderService;
    }
    
    public void CreateOrder(){
        IOrderRepository repo=Factory.getInstance().getRepository("default");
        orderServicie.save(repo);
    }
}
