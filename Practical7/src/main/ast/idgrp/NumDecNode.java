package main.ast.idgrp;

import org.antlr.v4.runtime.Token;

public class NumDecNode extends NumberNode {
    public int number;

    public NumDecNode(Token num) {
        this.number=Integer.parseInt(num.getText());
    }
}
