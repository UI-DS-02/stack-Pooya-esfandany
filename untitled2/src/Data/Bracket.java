package Data;

import java.util.Stack;

public class Bracket {
    static Stack<Bracket> brackets=new Stack<>();
    char bracket;
    int index;
    boolean isMatched(Bracket o)
    {
        if(bracket=='('&&o.bracket==')')
        {
            return true;
        }
        return false;
    }

}
