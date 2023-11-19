package Calculation;

import Storage.Errors.UnmatchedBracket;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Scanner;

public class Check {
    private static Stack<Character> characters = new Stack<>();

    public static void CheckBracket(String number) {
        StringBuilder stringBuilder = new StringBuilder(number);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) != '(' && stringBuilder.charAt(i) != ')') {
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }
        char[] chars = stringBuilder.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!characters.empty()) {
                char top = characters.peek();
                char current = chars[i];
                if (top == '(' && current == ')') {
                    characters.pop();
                } else {
                    characters.push(current);
                }
            } else {
                characters.push(chars[i]);
            }
        }
        if (!characters.empty()) {
            throw new UnmatchedBracket();
        }
    }

    public static void CheckFunction(String number) {

        if(number.charAt(0)=='-')
        {
            StringBuilder stringBuilder=new StringBuilder(number);
            stringBuilder.replace(0,1,"_1*");
            number=stringBuilder.toString();
        }
        String[] lines = number.split("-");
        for (int i = 0; i < lines.length - 1; i++) {
            char function = lines[i].charAt(lines[i].length() - 1);
            if (lines[i].length() == 0 || function == '(') {
                lines[i] += "_1*";
            } else {
                lines[i] += "-";
            }
        }
        StringBuilder findMines=new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            findMines.append(lines[i]);
        }
    }
}





