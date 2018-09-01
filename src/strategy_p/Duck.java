package strategy_p;

public abstract class Duck{
    FlyBehavior flyBahavior;
    QuackBehavior quackBehavior;
    public Duck(){

    }

    public void performFly(){
        this.flyBahavior.fly();
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBahavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }
}