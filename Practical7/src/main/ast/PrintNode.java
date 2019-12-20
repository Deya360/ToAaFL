package main.ast;

import main.ast.expr.ExprNode;

public class PrintNode extends CommandNode{
    public ExprNode expr;

    public PrintNode(ExprNode expr) {
        this.expr = expr;
    }
}
