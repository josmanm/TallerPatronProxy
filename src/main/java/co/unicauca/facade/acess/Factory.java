/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facade.acess;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class Factory {
        private static Factory instance;

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
     * Método que crea una instancia concreta de la jerarquia IRestaurantService
     *
     * @return una clase hija de la abstracción IRepositorioRestaurantes
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
