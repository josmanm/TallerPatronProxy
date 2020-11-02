package co.unicauca.facade.domain.order;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ
 */
public class Customer {

    /**
     * Variable de tipo entero.
     */
    private int id;
    /**
     * Variable de tipo String.
     */
    private String name;
    /**
     * Variable de tipo String.
     */
    private String andrress;
    /**
     * Variable de tipo String.
     */
    private String moblie;
    /**
     * Variable de tipo String.
     */
    private String city;

    /**
     * Constructor por defecto.
     */
    public Customer() {
    }

    /**
     * Constructor Parametrizado.
     *
     * @param id
     * @param name
     * @param andrress
     * @param moblie
     * @param city
     */
    public Customer(int id, String name, String andrress, String moblie, String city) {
        this.id = id;
        this.name = name;
        this.andrress = andrress;
        this.moblie = moblie;
        this.city = city;
    }

    // SETTERS AND GETTERS
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
