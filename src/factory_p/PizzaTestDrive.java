package factory_p;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStroe = new NYPizzaStore();

        Pizza pizza = nyStroe.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    }
}
