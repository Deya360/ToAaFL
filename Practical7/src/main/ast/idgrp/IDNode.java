package main.ast.idgrp;


import org.antlr.v4.runtime.Token;

public class IDNode extends IDGrpNode {
    public Token token;

    public IDNode(Token token) {
        this.token = token;
    }
}
