package Storage.Errors;

public class DivisionByZero extends RuntimeException {
    @Override
    public String toString()
    {
        return "Division By Zero";
    }

}
