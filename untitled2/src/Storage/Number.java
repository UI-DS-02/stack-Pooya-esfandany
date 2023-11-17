package Storage;

public class Number extends Member{
    int value;
    Number(int x)
    {
        this.value=x;
    }
    @Override
    public String toString()
    {
        return Integer.toString(value);
    }
}
