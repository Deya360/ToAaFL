package main.ast.expr;

import main.ast.OperNode;
import main.ast.idgrp.IDGrpNode;

public class ExprNorNode extends ExprNode {
    public IDGrpNode l;
    public IDGrpNode r;
    public OperNode op;

    public ExprNorNode(IDGrpNode l, IDGrpNode r, OperNode op) {
        this.l = l;
        this.r = r;
        this.op = op;
    }
}
