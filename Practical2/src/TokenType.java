import java.util.regex.Pattern;

public enum TokenType {
    NUMBER("[0-9]+"),
    ID("[_a-zA-Z_][a-zA-Z0-9_]+"),
    ADD("\\+"),
    SUB("-"),
    MUL("\\*"),
    DIV("/"),
    LPAR("\\("),
    RPAR("\\)"),
    SPACE("[ \t\r\n]+");

    Pattern pattern;
    TokenType(String regexp) {
        pattern = Pattern.compile(regexp);
    }
}
