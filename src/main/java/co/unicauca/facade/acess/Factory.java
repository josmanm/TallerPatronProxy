package co.unicauca.facade.acess;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ.
 */
public class Factory {

    /**
     * Variable de tipo Factory.
     */
    private static Factory instance;

    /**
     * Constructor parametrizado
     */
    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia IOrdenRepository.
     *
     * @return una clase hija de la abstracción IOrdenRepository.
     */
    public OrderRepositoryImplArrays getRepository(String type) {
        OrderRepositoryImplArrays result = null;
        switch (type) {
            case "default":
                result = new OrderRepositoryImplArrays();
                break;
        }

        return result;
    }

}
