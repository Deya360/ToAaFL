import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String input = "[0-9]+";

        Pattern p = Pattern.compile(input);
        List<String> lines;

        try {
            lines = Files.readAllLines(
                    Paths.get("C:\\Users\\Deya\\Documents\\Projects\\TAAFL - Sem5\\Practical1\\src\\test.txt")
            );

            for (String line: lines) {
                Matcher m = p.matcher(line);

                while (m.find()) {
                    String found = m.group();
                    int s = m.start();
                    int e = m.end();

                    System.out.println(found);
                    System.out.println("Found!\n s:" + s + " e:" + e);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
