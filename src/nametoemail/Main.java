package nametoemail;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of(
                "Anna Long",
                "Bob Young",
                "Brett White",
                "Charlie Bogert",
                "David Lynch"
        ));

        List<Function<String, String>> operations = List.of(
                /*
                    3-step change to convert names to emails:
                    -----------------------------------------
                    (1) make all lowercase
                    (2) change to first letter of first name + last name
                        e.g. "anna long" --> "along"
                    (3) append "@sephora.sg"
                 */
        );

        Convertor.convert(names, operations);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
