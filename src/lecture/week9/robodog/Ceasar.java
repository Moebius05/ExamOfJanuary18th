package lecture.week9.robodog;
import java.util.List;
import java.util.stream.Collectors;

public class Ceasar {
    private List cipher(String plaintext, int key) {
        return plaintext.chars()
                .map(e -> {
                    if ((e > 64) && (e < 91)) {
                        e = ((e + key - 64) % 26) + 64;
                    }
                    if ((e > 96) && (e < 123)) {
                        e = ((e + key - 96) % 26) + 96;
                    }
                    return e;
                }).mapToObj(e -> (char) e).collect(Collectors.toList());
    }
}
