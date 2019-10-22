import java.util.ArrayList;
import java.util.regex.Matcher;

public class Lexev {
    String src;
    int pos;
    ArrayList<Token> tokens = new ArrayList<>();

    public Lexev(String src) {
        this.src = src;
    }

    public boolean nextToken() {
        if (pos>=src.length()) {
            return false;
        }

        for (TokenType tt : TokenType.values()) {
            Matcher m = tt.pattern.matcher(src);
            m.region(pos, src.length());
            if (m.lookingAt()) {
                Token t = new Token(tt, m.group(), pos);
                tokens.add(t);
                pos=m.end();
                return true;
            }
        }
        throw new RuntimeException("Unknown symbol");
    }

    public ArrayList<Token> lex() {
        while (nextToken()) { }
        return tokens;
    }
 }
