import strategy.IStrategy;
import strategy.StrategyImpl1;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        Context context = new Context();
        boolean fin = false;
        Scanner scanner = new Scanner(System.in);
        while(!fin){
            System.out.println("Donner la strategie :");
            String strategyClassNAme = "strategy."+scanner.nextLine();
            IStrategy strategy = (IStrategy) Class.forName(strategyClassNAme).newInstance();
            System.out.println("---------------------");
            context.setStrategy(strategy);
            context.process();
        }
    }
}
