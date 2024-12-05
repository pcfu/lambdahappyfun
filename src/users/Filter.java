package users;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static <T> List<T> apply(List<T> items, List<Predicate<T>> conditions) {
        if (conditions == null) {
            return items;
        }

        List<T> filtered = new ArrayList<>();

        for (T item : items) {
            boolean match = true;
            for (Predicate<T> c : conditions) {
                match = match && c.test(item);
            }
            if (match) {
                filtered.add(item);
            }
        }

        return filtered;
    }

    public static <T> List<T> apply(List<T> items, Predicate<T> conditionChain) {
        /*
            This method accepts a chained Predicate.
            Implement it so that it filters and returns the target items.

            Then update Main to employ this version of apply
         */

        return null;
    }
}
