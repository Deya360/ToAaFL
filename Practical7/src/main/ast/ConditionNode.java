package main.ast;

import main.ast.expr.ExprNode;

public class ConditionNode {
    public ExprNode l;
    public ExprNode r;
    public CmpNode co;

    public ConditionNode(ExprNode l, ExprNode r, CmpNode co) {
        this.l = l;
        this.r = r;
        this.co = co;
    }
}
