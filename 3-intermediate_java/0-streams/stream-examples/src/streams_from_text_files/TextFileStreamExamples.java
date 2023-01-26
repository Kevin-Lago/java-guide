package streams_from_text_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TextFileStreamExamples {
    public static void main(String[] args) {
        Path path = Path.of("./src/streams_from_text_files/people.txt");
        printFromFile(path);
    }

    public static void printFromFile(Path path) {
        try (Stream<String> lines = Files.lines(path)) {
            System.out.println(lines.count());
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }


}
