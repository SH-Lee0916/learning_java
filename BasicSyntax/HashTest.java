package BasicSyntax;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashTest {
    public static void main(String[] args) {
        // HashMap<>(Map), HashMap<>(int), HashMap<>(int, float)
        HashMap<String, Integer> siHash = new HashMap<>();
        HashMap<Integer, Integer> iiHash = new HashMap<>();
        HashMap<Character, Integer> ciHash = new HashMap<>() {{
            put('a', 0);
            put('b', 1);
        }};

        System.out.println(siHash);
        System.out.println(iiHash);
        System.out.println(ciHash);

        // put(key, value)
        siHash.put("key", 10);
        iiHash.put(1, 1);
        ciHash.put('c', 2);

        System.out.println(siHash);
        System.out.println(iiHash);
        System.out.println(ciHash);

        // remove(key), clear()
        siHash.remove("key");
        iiHash.clear();

        System.out.println(siHash);
        System.out.println(iiHash);
        System.out.println(ciHash);

        // size()
        System.out.println(ciHash.size());

        // iteration
        // for
        for (Map.Entry<Character, Integer> e: ciHash.entrySet())
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());

        Iterator<Map.Entry<Character, Integer>> iter = ciHash.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Character, Integer> entry = iter.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
