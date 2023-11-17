package Storage;

public class Sign extends Member {
    public Character character;
    int power;

    public Sign(char character) {
        this.character = character;
        switch (character) {
            case '!': {
                power = 4;
                break;
            }
            case '^': {
                power = 3;
                break;
            }
            case '*': {
                power = 2;
                break;
            }
            case '/': {
                power = 2;
                break;
            }
            case '-': {
                power = 1;
                break;
            }
            case '+': {
                power = 1;
                break;
            }
            case '(': {
                power = -1;
                break;
            }
            case ')': {
                power = -2;
                break;
            }
        }
    }

    @Override
    public String toString() {

        return character.toString();
    }

    public boolean ShouldRemove(Character o) {
        Sign sign = new Sign(o);
        if(sign.power<0)
        {
            return false;
        }
        if (this.power < sign.power) {
            return false;
        }
        return true;
    }

}
