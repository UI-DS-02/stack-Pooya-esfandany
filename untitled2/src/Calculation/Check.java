package Calculation;
import Storage.Errors.UnmatchedBracket;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Scanner;
public class Check {
    private static Stack<Character> characters=new Stack<>();
        public static void CheckBracket(String number) {
            StringBuilder stringBuilder = new StringBuilder(number);
            for (int i = 0; i < stringBuilder.length(); i++) {
                if (stringBuilder.charAt(i) != '(' && stringBuilder.charAt(i) != ')') {
                    stringBuilder.deleteCharAt(i);
                    i--;
                }
            }
                char[] chars=stringBuilder.toString().toCharArray();
                for(int i=0;i<chars.length;i++)
                {
                    if(!characters.empty())
                    {
                        char top=characters.peek();
                        char current=chars[i];
                        if(top=='('&&current==')')
                        {
                            characters.pop();
                        }
                        else {
                            characters.push(current);
                        }
                    }
                    else {characters.push(chars[i]);
                    }
                }
                if(!characters.empty())
                {
                    throw new UnmatchedBracket();
                }
        }
    }





