package factory_p;

public abstract class PizzaStore {
//    SimplePizzaFactory factory;
//
//    public PizzaStore(SimplePizzaFactory factory){
//        this.factory = factory;
//    }
//
//    public Pizza orderPizza(String type){
//        Pizza pizza;
//        pizza = factory.create(type);
//
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//
//        return pizza;
//    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
