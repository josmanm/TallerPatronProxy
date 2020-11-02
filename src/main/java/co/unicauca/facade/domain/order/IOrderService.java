package co.unicauca.facade.domain.order;

import co.unicauca.facade.acess.IOrderRepository;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public interface IOrderService {

    /**
     * Metodo para guardar el pedido en la base de datos.
     * @param repo 
     */
    public void save(IOrderRepository repo);
}
