package Storage.Errors;

public class UnmatchedBracket extends RuntimeException{
    @Override
    public String toString()
    {
        return "Bracket are not matched please check them";
    }

}
