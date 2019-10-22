import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
            String text = "10+20/40";
            Lexev l = new Lexev(text);
            ArrayList<Token> tList = l.lex();
            for (Token t:tList) {
                System.out.println(t.type + " " + t.text);
            }
    }

    public void Old() {
        List<String> lines;
        try {
            lines = Files.readAllLines(
                    Paths.get("C:\\Users\\Deya\\Documents\\Projects\\TAAFL - Sem5\\Practical2\\src\\test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        final String identifier = "[a-zA-Z_][a-zA-Z0-9_]*";
        Pattern p = Pattern.compile(identifier);
        for (String line: lines) {
            Matcher m = p.matcher(line);

            boolean foundB = false;
            while (m.find()) {
//                String found = m.group();
                int s = m.start();
                int e = m.end();

                foundB = true;
                System.out.println("From " + s + ", To " + e);
                System.out.println("Found!: " + line + "\n");
            }

            if (!foundB) {
                System.out.println("Not Found!: " + line + "\n");
            }
        }
    }
}
