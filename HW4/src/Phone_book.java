import java.util.*;

public class Phone_book {

    private static Map<String, HashSet<String>> map;

    Phone_book() {
        map = new HashMap<>();
    }

    void add(String lastname, String phone) {
        HashSet<String> phones;

        if (map.containsKey(lastname)) {
            phones = map.get(lastname);
        } else {
            phones = new HashSet<>();
        }
        phones.add(phone);
        map.put(lastname, phones);
    }

     public static Set<String> get(String lastname) {
        return map.get(lastname);
    }
}
