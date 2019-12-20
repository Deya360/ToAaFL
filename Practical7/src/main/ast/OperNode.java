package main.ast;

import main.ExprParser;
import org.antlr.v4.runtime.Token;

public class OperNode {
    public Token token;

    public OperNode(ExprParser.OperContext c) {
        this.token = c.t.get(0);
    }
}
