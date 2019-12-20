package main.ast.expr;

import main.ast.CommandNode;
import main.ast.OperNode;

public class ExprNode extends CommandNode {
    public ExprNode l;
    public ExprNode r;
    public OperNode op;

    public ExprNode(ExprNode l, ExprNode r, OperNode op) {
        this.l = l;
        this.r = r;
        this.op = op;
    }

    public ExprNode() {
    }
}

