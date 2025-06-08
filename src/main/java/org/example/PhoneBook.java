package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> numbers = new HashMap<>();
    public int add(String name, String number){
        numbers.put(name, number);
        return numbers.size();
    }
}
