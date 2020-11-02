package co.unicauca.facade.domain.order;

/**
 *
 * @author SANTIAGO MUÑOZ, JUAN LOPEZ.
 */
public class Item {

    /**
     * Variable de tipo Dish.
     */
    private Dish dish;
    /**
     * Variable de tipo entero.
     */
    private int amount;

    /**
     * Constructor por defecto.
     */
    public Item() {
    }

    /**
     * Constructor parametrizado.
     *
     * @param dish
     * @param amount
     */
    public Item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }

    //SETTERS AND GETTERS
    public Dish getDish() {
        return dish;
    }

    public int getAmount() {
        return amount;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
