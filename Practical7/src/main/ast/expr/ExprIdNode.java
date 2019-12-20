package main.ast.expr;

import main.ast.OperNode;
import main.ast.idgrp.IDGrpNode;
import main.ast.idgrp.IDNode;

public class ExprIdNode extends ExprNode {
    public IDNode l;
    public IDGrpNode r;
    public OperNode op;

    public ExprIdNode(IDNode l, IDGrpNode r, OperNode op) {
        this.l = l;
        this.r = r;
        this.op = op;
    }
}
