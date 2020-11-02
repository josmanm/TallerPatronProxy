package co.unicauca.facade.domain.order;

import co.unicauca.facade.acess.IOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class OrderServiceLogger implements IOrderService {

    /**
     * Variable de tipo Orderfacade.
     */
    private Orderfacade orderFacade;
    /**
     * Variable de tipo Logger.
     */
    private Logger logger;

    /**
     * Constructor por defecto.
     */
    public OrderServiceLogger() {
    }

    /**
     * Constructor parametrizado.
     *
     * @param orderFacade
     */
    public OrderServiceLogger(Orderfacade orderFacade) {
        this.orderFacade = orderFacade;
        logger = LoggerFactory.getLogger(OrderServiceLogger.class);
    }

    /**
     * Metodo encargado de guardar el pedido en la base de datos.
     *
     * @param repo
     */
    @Override
    public void save(IOrderRepository repo) {
        repo.createOrder(orderFacade.getOrder());
        String message = "Pedido guardado en la base de datos";
        logger.info(message);
    }

}
