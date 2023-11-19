import Calculation.Calculation;
import Calculation.Check;
public class  Main {
    public static void main(String[] args) {
       Calculation.makePostfix("3*2");
       Calculation.solve();
       Check.CheckBracket("(233)*(2)(-4)+1");
    }
}
