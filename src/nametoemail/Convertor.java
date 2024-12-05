package nametoemail;

import java.util.List;
import java.util.function.Function;

public class Convertor {
    public static void convert(
            List<String> names,
            List<Function<String, String>> operations
    ) {
        /*
            operations = list of functional interfaces (Function)
                         that take STRING INPUT
                         and return STRING OUTPUT

            name.transform passes name (String) to an operation
            and returns the result (also String)
         */

        for (var opr : operations) {
            names.replaceAll(name -> name.transform(opr));
        }
    }
}
