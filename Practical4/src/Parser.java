
import java.util.List;
import java.util.Scanner;

public class Parser {
    private final List<Token> tokens;
    private int pos = 0;

    public Parser(List<Token> tokens) {
        this.tokens = tokens;
    }

    public static void main(String[] args) {
        String text = "1+2+x";
        Lexer l = new Lexer(text);
        List<Token> tokens = l.lex();
        tokens.removeIf(t -> t.type == TokenType.SPACE);
        Parser p = new Parser(tokens);
        ExprNode nodes = p.parse();
        int result = eval(nodes);
        System.out.println(result);
    }

    private Token require(TokenType expected) {
        Token t = match(expected);
        if (t == null)
            error("Ожидается " + expected);
        return t;
    }

    private void error(String message) {
        if (pos < tokens.size()) {
            Token t = tokens.get(pos);
            throw new RuntimeException(message + " в позиции " + t.pos);
        } else {
            throw new RuntimeException(message + " в конце файла");
        }
    }

    private Token match(TokenType expected) {
        if (pos < tokens.size()) {
            Token c = tokens.get(pos);
            if (c.type == expected) {
                pos++;
                return c;
            }
        }
        return null;
    }

    private ExprNode parse() {
        ExprNode en = elem();

        while (pos < tokens.size()) {
            Token op = require(TokenType.ADD);
            ExprNode ez = elem();
            en = new BinOpNode(op, en, ez);
        }
        return en;
    }

    public static int eval(ExprNode node) {
        if (node instanceof  NumberNode) {
            NumberNode nn = (NumberNode)node;
            return Integer.parseInt(nn.numer.text);

        } else if (node instanceof  BinOpNode) {
            BinOpNode bn = (BinOpNode)node;
            int l = eval(bn.left);
            int r = eval(bn.right);
            return l+r;
        } else if (node instanceof  VarNode) {
            VarNode vn = (VarNode)node;
            System.out.println("Please enter the value of " + vn.id.text + ": ");
            Scanner in = new Scanner(System.in);
            int value = in.nextInt();
            return value;
        }
        return -1;
    }

    private ExprNode elem () {
        Token n = match(TokenType.NUMBER);
        if (n!=null) return  new NumberNode(n);

        Token id = match(TokenType.ID);
        if (id!=null) return new VarNode(id);
        error("Ожидаласт число или идинтификатор");
        return null; //is never reached
    }
}
