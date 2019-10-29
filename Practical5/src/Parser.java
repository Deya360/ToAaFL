import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parser {
    private final List<Token> tokens;
    private int pos = 0;


    /*
    * Rules:
    * <expr>    ::= <slag> ('+' <slag>)*    --> expr
    * <slag>    ::= <multiplier> ('*' <multiplier>)*  --> slag
    * <multiplier>   ::= <elem> | '(' <expr> ')' --> multiplier
    * <elem>    ::= <number> | identifier   --> elem
    * */

    public Parser(List<Token> tokens) {
        this.tokens = tokens;
    }

    public static void main(String[] args) {
        String text = "(1+2)/3";
        Lexer l = new Lexer(text);
        List<Token> tokens = l.lex();
        tokens.removeIf(t -> t.type == TokenType.SPACE);
        Parser p = new Parser(tokens);
        ExprNode nodes = (p.expr());
        int result = eval(nodes);
        System.out.println(result);
    }

    public static int eval(ExprNode node) {
        if (node instanceof NumberNode) {
            NumberNode nn = (NumberNode)node;
            return Integer.parseInt(nn.numer.text);

        } else if (node instanceof BinOpNode) {
            BinOpNode bn = (BinOpNode)node;
            int l = eval(bn.left);
            int r = eval(bn.right);
            switch (bn.op.type) {
                case ADD: return  l+r;
                case SUB: return  l-r;
                case MUL: return  l*r;
                case DIV: return  l/r;

            }

        } else if (node instanceof VarNode) {
            VarNode vn = (VarNode)node;
            System.out.println("Please enter the value of " + vn.id.text + ": ");
            Scanner in = new Scanner(System.in);
            int value = in.nextInt();
            return value;
        }
        return -1;
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

    private Token matchArr(ArrayList<TokenType> expecteds) {
        if (pos < tokens.size()) {
            Token c = tokens.get(pos);
            for (TokenType expected: expecteds) {
                if (c.type == expected) {
                    pos++;
                    return c;
                }
            }
        }
        return null;
    }

    private Token require(TokenType expected) {
        Token t = match(expected);
        if (t == null)
            error("Ожидается " + expected);
        return t;
    }

    private Token requireArr(ArrayList<TokenType> expecteds) {
        for (TokenType expected : expecteds) {
            Token t = match(expected);
            if (t != null) return t;
        }
        error("Ожидается " + expecteds);
        return null; //is never reached
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
    private ExprNode elem () {
        Token n = match(TokenType.NUMBER);
        if (n!=null) return  new NumberNode(n);

        Token id = match(TokenType.ID);
        if (id!=null) return new VarNode(id);
        error("Ожидаласт число или идинтификатор");
        return null; //is never reached
    }


    private ExprNode expr() {
        ExprNode e1 = slag();

        Token op;
        while ((op=matchArr(new ArrayList<TokenType>() {{add(TokenType.ADD); add(TokenType.SUB);}}))!=null) {
//            Token op = requireArr(new ArrayList<TokenType>() {{add(TokenType.ADD); add(TokenType.SUB);}});
            ExprNode e2 = slag();
            e1 = new BinOpNode(op, e1, e2);
        }

        return e1;
    }
    private ExprNode slag () {
        ExprNode e1 = multiplier();

        Token op;
        while ((op=matchArr(new ArrayList<TokenType>() {{add(TokenType.MUL); add(TokenType.DIV);}}))!=null) {
            ExprNode e2 = multiplier();
            e1 = new BinOpNode(op, e1, e2);
        }
        return e1;
    }

    private ExprNode multiplier() {
        if (match(TokenType.LPAR) !=null) {
            ExprNode e = expr();
            require(TokenType.RPAR);
            return  e;
        } else {
            return elem();
        }
    }

}
