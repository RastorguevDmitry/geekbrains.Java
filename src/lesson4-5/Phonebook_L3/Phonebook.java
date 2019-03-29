package Phonebook_L3;

import java.util.*;


public class Phonebook {
    Map<String, Set<String>> phonebook = new HashMap<>();

    public void add(String personName, String phone) {
        Set<String> records = phonebook.get(personName);

        if (Objects.isNull(records)) {
            records = new HashSet<>();
        }

        records.add(phone);
        phonebook.put(personName, records);
    }

    public Set<String> get(String personName) {
        return phonebook.get(personName);
    }


}
