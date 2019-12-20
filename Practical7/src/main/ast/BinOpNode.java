package main.ast;

import main.ast.expr.ExprNorNode;
import org.antlr.v4.runtime.Token;

public class BinOpNode {
    public Token op;
    public ExprNorNode left;
    public ExprNorNode right;

    public BinOpNode(Token op, ExprNorNode left, ExprNorNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }
}
