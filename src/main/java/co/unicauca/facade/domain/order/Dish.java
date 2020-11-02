package co.unicauca.facade.domain.order;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class Dish {

    /**
     * Variable de tipo entero.
     */
    private int id;
    /**
     * Variable de tipo String.
     */
    private String name;
    /**
     * Variable de tipo entero.
     */
    private int price;

    /**
     * Constructor por defecto.
     */
    public Dish() {
    }

    /**
     * Constructor parametrizado.
     *
     * @param id
     * @param name
     * @param price
     */
    public Dish(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //SETTERS AND GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
