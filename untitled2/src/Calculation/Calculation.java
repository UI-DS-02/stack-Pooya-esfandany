package Calculation;
import Storage.Errors.DivisionByZero;
import Storage.Sign;

import java.util.Stack;
public class Calculation {
    static Stack<String> stack=new Stack<>();
    private static double answer;
    static StringBuilder postfix=new StringBuilder();
    static StringBuilder history=new StringBuilder();
    static Stack<Sign> postfixStack =new Stack<Sign>();
    public static void makePostfix(String number)
    {
        if(number.charAt(0)=='-')
        {
            StringBuilder stringBuilder=new StringBuilder(number);
            stringBuilder.replace(0,1,"_1*");
            number=stringBuilder.toString();
        }
        String[] lines=number.split("-");
        for(int i=0;i<lines.length-1;i++) {
            char function=lines[i].charAt(lines[i].length()-1);
            if (lines[i].length() == 0 || function == '(') {
                lines[i] += "_1*";
            } else {
                lines[i] += "-";
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i< lines.length;i++)
        {
            stringBuilder.append(lines[i]);
        }
        StringBuilder numbersFunction=new StringBuilder(stringBuilder.toString());
        String changedNumber=stringBuilder.toString();
        String[] numbers=changedNumber.split("(\\)|\\(|\\*|\\+|-|\\^|!|\\/|√)");
        for(int i=0;i<numbers.length;i++)
        {
            int index=numbersFunction.indexOf(numbers[i]);
            numbersFunction.delete(index,index+numbers[i].length());
        }
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i].equals("_1"))
            {
                numbers[i]="-1";
            }
        }
        String[] line=new String[numbers.length+numbersFunction.length()];
        int count=0;
        try {
            for (int i = 0; i < line.length; i++) {
                if (i % 2 == 0) {
                    line[i] = numbers[i / 2];
                }
                if (i % 2 != 0) {
                    Character c = numbersFunction.charAt((i - 1) / 2);
                    line[i] = c.toString();
                }
                if(line[i].equals(""))
                {
                    count++;
                }
            }
        }
        catch (Exception e)
        {
            line[line.length-1]=")";
        }
        String[] answer=new String[line.length-count];

        int j=0;
        for(int i=0;i<line.length;i++)
        {
            if(!line[i].equals(""))
            {
                answer[j]=line[i];
                j++;
            }
        }
        makeList(answer);
    }
    public static double calculate(String number)
    {

        makePostfix(number);
        solve();
        stack=new Stack<>();
        postfix=new StringBuilder();
        history=new StringBuilder();
        return answer;
    }

    private static void makeList(String[] ans) {

        for (int i = 0; i < ans.length; i++) {
            Character character=ans[i].charAt(0);
            if (isNumber(ans[i])) {
                postfix.append(ans[i]);
                postfix.append(",");
            } else {
                if (postfixStack.empty()) {
                    Sign sign = new Sign(character);
                    postfixStack.push(sign);
                } else {
                    if (character.equals(')')) {
                        while (!postfixStack.isEmpty()) {
                            Character top = postfixStack.peek().character;
                            if (top.equals('(')) {
                                postfixStack.pop();
                                break;
                            }
                            char added=postfixStack.pop().character;
                            postfix.append(added);
                            postfix.append(",");

                        }
                    } else {
                        while (!postfixStack.empty()) {
                            Sign peek = postfixStack.peek();
                            if (peek.ShouldRemove(character)) {
                                postfix.append(postfixStack.pop().toString());
                                postfix.append(",");
                            } else {
                                break;
                            }
                        }
                        postfixStack.push(new Sign(character));
                    }
                }
            }

        }
        while(!postfixStack.empty())
        {
            postfix.append(postfixStack.pop().character);
            postfix.append(",");
        }

    }
    public static void solve()
    {
        String[] members=postfix.toString().split(",");
        for(int i=0;i<members.length;i++)
        {
            if(isFunction(members[i])==-1)
            {
                stack.push(members[i]);
            }
            else {
                double B=0;
                double A=Double.parseDouble(stack.pop());
                if(!(members[i].toCharArray()[0]=='!'||members[i].toCharArray()[0]=='√'||
                members[i].toCharArray()[0]=='C'||members[i].toCharArray()[0]=='c'||
                members[i].toCharArray()[0]=='s'||members[i].toCharArray()[0]=='T'))
                {
                    B=Double.parseDouble(stack.pop());
                }

                char C=members[i].toCharArray()[0];
                stack.push(Double.toString(calculate(B,A,C)));
                if(B%2==1||B%2==0)
                {
                    String line=Double.toString(B).replace(".0","");
                    history.append(line);
                }
                else {
                    history.append(B);
                }
                history.append(C);
                if(A%2==1||A%2==0)
                {
                    String line=Double.toString(A).replace(".0","");
                    history.append(line);
                }
                else
                {
                    history.append(A);
                }
                history.append(",");
            }
        }
        answer=Double.parseDouble(stack.pop());
    }
    private static boolean isNumber(String string)
    {

        try {
            Double.parseDouble(string);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    private static int isFunction(String string)
    {
        if(isNumber(string))
        {
            return -1;
        }
        char function=string.toCharArray()[0];
        switch (function)
        {
            case '+':return 1;
            case '-':return 2;
            case '*':return 3;
            case '/':return 4;
            case '^':return 5;
            case '!':return 6;
            case '√':return 7;
            case 'C':return 8;
            case 'c':return 9;
            case 's':return 10;
            case 'T':return 11;
        }
        return -1;
    }
    public static double calculate(double a,double b,char function)
    {
        switch (function)
        {
            case '-':return a-b;
            case '+':return a+b;
            case '*':return (a*b);
            case '/':
            {
                if(b==0)
                {
                    throw new DivisionByZero();
                }
                return (a/b);
            }
            case '^':return Math.pow(a,b);
            case '!':
            {
                return factorial(b);
            }
            case '√':
            {
                return Math.sqrt(b);
            }
            case 'c':
            {

                return Math.cos(b);
            }
            case 'C':
            {
                double cos=Math.cos(b);
                double sin=Math.sin(b);
                return cos/sin;
            }
            case 'T':
            {
                double cos=Math.cos(b);
                double sin=Math.sin(b);
                return sin/cos;
            }
            case 's':
            {
                return Math.sin(b);
            }
        }
        return -1;
    }
  private   static int factorial(double x)
    {
        int z= (int) Math.floor(x);
        int number=1;
        for(int i=z;i>1;i--)
        {
            number=number*i;
        }
        return number;
    }

}
