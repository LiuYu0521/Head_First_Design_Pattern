package factory_p;

public class NYPizzaStore extends PizzaStore {
//    @Override
////    Pizza createPizza(String item) {
////        if(item.equals("cheese")){
////            return new NYStyleCheesePizza();
////        }
//////        else if(item.equals("veggie")){
//////            return new NYStyleVeggiePizza();
//////        }
//////        else if(item.equals("clam")){
//////            return new NYStyleClamPizza();
//////        }
//////        else if(item.equals("pepperoni")){
//////            return new NYStylePepperoniPizza();
//////        }
////        else
////            return null;
////    }

    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        else if(item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
