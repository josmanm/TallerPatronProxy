package co.unicauca.facade.domain.order;

import static co.unicauca.facade.domain.order.State.NEW;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class Order {

    /**
     * Variable de tipo entero.
     */
    public int despatch;
    /**
     * Variable de tipo Customer.
     */
    private Customer custmer;
    /**
     * Variable de tipo LocalDate.
     */
    private LocalDate date;
    /**
     * Variable de tipo State.
     */
    private State state;
    /**
     * Variable Lista de tipo Item.
     */
    private List<Item> detalis;

    /**
     * Constructor parametrizado.
     */
    public Order() {
    }

    /**
     * Constructor parametrizado.
     *
     * @param despatch
     * @param custmer
     * @param date
     */
    public Order(int despatch, Customer custmer, LocalDate date) {
        this.despatch = despatch;
        this.custmer = custmer;
        this.date = date;
        this.state = NEW;
        this.detalis = new ArrayList<Item>();
    }

    /**
     * Constructor parametrizado.
     *
     * @param custmer
     */
    public Order(Customer custmer) {
        this.custmer = custmer;
        this.state = NEW;
        this.detalis = new ArrayList<Item>();
    }

    // SETTERS AND GETTERS
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

    public void addDish(Dish dish, int amount) {
        Item item = new Item(dish, amount);
        detalis.add(item);
    }

    /**
     * Metodo encargado de calcular el valor total del pedido.
     *
     * @return valor total a pagar.
     */
    public int calculateTotal() {
        int total = 0;
        for (Item item : detalis) {
            total += item.getDish().getPrice() * item.getAmount();
        }
        return total;
    }
}
