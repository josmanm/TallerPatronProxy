package co.unicauca.facade.domain.order;

import co.unicauca.facade.acess.Factory;
import co.unicauca.facade.acess.IOrderRepository;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class ProxyClient {

    /**
     * Variable de la interfaz IOrderService
     */
    private IOrderService orderServicie;

    /**
     * Constructor parametrizado.
     *
     * @param orderService
     */
    public ProxyClient(IOrderService orderService) {
        this.orderServicie = orderService;
    }

    /**
     * Metodo encargado de crear orden y guardarla.
     */
    public void CreateOrder() {
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        orderServicie.save(repo);
    }
}
