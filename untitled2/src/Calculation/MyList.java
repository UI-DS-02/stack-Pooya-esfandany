package Calculation;
import Storage.Member;
import Storage.Sign;

import java.util.Stack;
public class MyList {
    Stack<Member> stack=new Stack<Member>();
    static StringBuilder postfix=new StringBuilder();
    static Stack<Sign> postfixStack =new Stack<Sign>();
    public static void make(String number)
    {
        StringBuilder numbersFunction=new StringBuilder(number);
        String[] numbers=number.split("(\\)|\\(|\\*|\\+|-|\\^|!|\\/)");
        for(int i=0;i<numbers.length;i++)
        {
            int index=numbersFunction.indexOf(numbers[i]);
            numbersFunction.delete(index,index+numbers[i].length());
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
        System.out.println(postfix);
    }
    public static void makeList(String[] ans) {
        for (int i = 0; i < ans.length; i++) {
            Character character=ans[i].charAt(0);
            if (isNumber(ans[i])) {
                postfix.append(ans[i]);
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

                        }
                    } else {
                        while (!postfixStack.empty()) {
                            Sign peek = postfixStack.peek();
                            if (peek.ShouldRemove(character)) {
                                postfix.append(postfixStack.pop().toString());
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
        }
    }
    public static boolean isNumber(String string)
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
}
