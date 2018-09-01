package strategy_p;

public class MuteQuack implements QuackBehavior{
    public void quack(){
        System.out.println("<< Silence >>");
    }
}