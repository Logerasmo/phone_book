package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBook {
    private final Map<String, String> numbers = new HashMap<>();
    public int add(String name, String number){
        numbers.put(name, number);
        return numbers.size();
    }
    public String findByNumber(String number){
        if (!numbers.containsValue(number)){
            return null;
        }

        for (Map.Entry s : numbers.entrySet()
                .stream()
                .filter(x -> x.getValue().equals(number))
                .collect(Collectors.toSet())){
            return (String) s.getKey();
        }
        return null;
    }

    public String findByName(String name){
        return null;
    }
}
