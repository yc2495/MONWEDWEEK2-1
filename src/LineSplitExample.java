import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LineSplitExample {
    public static void main(String[] args) throws IOException {
        var fileName = "jerseys.txt";
        var studentJerseys = Paths.get(fileName);
        var studentLines = Files.readAllLines(studentJerseys);

    }
}
