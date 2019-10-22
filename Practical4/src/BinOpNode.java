public class BinOpNode extends ExprNode {
    Token op;
    ExprNode left;
    ExprNode right;

    public BinOpNode(Token op, ExprNode left, ExprNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }
}
