package strategy_p;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBahavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}