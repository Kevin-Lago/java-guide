package streams_from_text_files;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StreamFromRegExExamples {
    public static void main(String[] args) {
        splitSentence();
    }

    public static void splitSentence() {
        String sentence = "The quick brown fox jumped over the lazy dog";
        String[] words = sentence.split(" ");

        long count = Arrays.stream(words).count();
        System.out.println(count);

        Pattern pattern = Pattern.compile(" ");
        System.out.println(pattern.splitAsStream(sentence).count());
    }
}
