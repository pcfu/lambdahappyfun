package users;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(List.of(
                new User("Anna", "Long", 30, false),
                new User("Bob", "Young", 12, false),
                new User("Brett", "White", 56, true),
                new User("Carlie", "Bogert", 35, false),
                new User("David", "Lynch", 28, true)
        ));

        List<Predicate<User>> conditions = List.of(
                /*
                    Add conditions to select users where:
                    -------------------------------------
                    (1) age is <= 30
                    (2) not a VIP
                    (3) last name is 5 characters long

                    Expected result: [Bob Young]
                 */
        );

        for (User u : Filter.apply(users, conditions)) {
            System.out.println(u);
        }
    }
}
