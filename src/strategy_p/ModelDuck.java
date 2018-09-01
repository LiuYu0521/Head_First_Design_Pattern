package strategy_p;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBahavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}