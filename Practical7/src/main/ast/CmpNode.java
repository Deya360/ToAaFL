package main.ast;

import main.ExprParser;
import org.antlr.v4.runtime.Token;

public class CmpNode {
    public Token token;

    public CmpNode(ExprParser.CmpContext c) {
        this.token = c.t.get(0);
    }
}
