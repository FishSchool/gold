package code.pattern.strategy.one;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-09 22:35
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}