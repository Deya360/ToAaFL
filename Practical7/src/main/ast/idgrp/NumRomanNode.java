package main.ast.idgrp;

import main.ExprParser;

public class NumRomanNode extends NumberNode {
    public int number;

    public NumRomanNode(ExprParser.RomanContext num) {
        this.number=parseRoman(num.getText());
    }

    private int parseRoman(String str) {
        int res = 0;

        for (int i=0; i<str.length(); i++) {
            int s1 = value(str.charAt(i));

            if (i+1 <str.length()) {
                int s2 = value(str.charAt(i+1));

                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
                i++;
            }
        }

        return res;
    }

    private int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        return -1;
    }
}
