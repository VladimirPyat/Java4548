package oop_HW6.Work3;

import java.util.HashMap;
import java.util.Map;

public class GreetType {
    private Map<String, String> greetType;
    

    public GreetType() {
        greetType = new HashMap<>();
        greetType.put("formal", "Good evening, sir.");
        greetType.put("casual", "Sup bro?");
        greetType.put("intimate", "Hello Darling!");
    }



    public boolean hasValue(String key) {
        return greetType.containsKey(key);
    }

    public String getValue(String key) {
        return greetType.get(key);
    }
}
