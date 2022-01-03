import strategy.DefaultIStrategyImpl;
import strategy.IStrategy;

public class Context {
    private IStrategy strategy;

    public Context() {
        this.strategy = new DefaultIStrategyImpl();
    }

    public void process(){
        System.out.println("Etape 1 de l'algoritme");
        strategy.applyStrategy();
        System.out.println("Etape 2 de l'algoritme");
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
