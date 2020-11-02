package co.unicauca.facade.domain.order;

import co.unicauca.facade.acess.IOrderRepository;
import static co.unicauca.facade.domain.order.State.CANCELLED;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class Orderfacade implements IOrderService {

    /**
     * Variable de tipo Order.
     */
    private Order order;

    /**
     * Constructor por defecto.
     */
    public Orderfacade() {
    }

    /**
     * Metodo encargado de crear una orden.
     *
     * @param customer
     */
    public void createOrder(Customer customer) {
        order = new Order(customer);
    }

    /**
     * Metodo encargado de agregar un plato a la orden.
     *
     * @param dish
     * @param amount
     */
    public void addDish(Dish dish, int amount) {
        order.addDish(dish, amount);
    }

    /**
     * Metodo encargado de actualizar el estado de la orden.
     *
     * @param state
     */
    public void changeState(State state) {
        order.setState(state);
    }

    /**
     * Metodo encargado de actualizar el estado de la orden a "Cancelado".
     */
    public void cancelOrder() {
        order.setState(CANCELLED);
    }

    /**
     * Metodo encargado de calcular el valor del pedido.
     *
     * @return
     */
    public int calcularTotal() {
        return order.calculateTotal();
    }

    /**
     * Metodo encargado de retornar la informacion de la orden.
     *
     * @return
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Metodo encargado de retonar el numero de ordenes.
     *
     * @return
     */
    public int totalDishes() {
        return order.getDetalis().size();
    }

    /**
     * Metodo encargado de guardar la orden en la base de datos.
     *
     * @param repo
     */
    @Override
    public void save(IOrderRepository repo) {
        repo.createOrder(order);
    }

}
