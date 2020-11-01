/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facade.domain.order;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class Customer {
    private int id;
    private String name;
    private String andrress;
    private String moblie;
    private String city;

    public Customer() {
    }

    public Customer(int id, String name, String andrress, String moblie, String city) {
        this.id = id;
        this.name = name;
        this.andrress = andrress;
        this.moblie = moblie;
        this.city = city;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAndrress() {
        return andrress;
    }

    public String getMoblie() {
        return moblie;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAndrress(String andrress) {
        this.andrress = andrress;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
