package beginner;
import java.util.HashMap;   //Import the HashMap class

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();       // Create a HashMap instance
//        Adding key-value pairs to the HashMap: (put method)
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 80);
        studentScores.put("Charlie", 75);
//        Accessing values from the HashMap: (get method)
        int score = studentScores.get("Alice");
        System.out.println(score);  // Output: 95
//        Modifying values in the HashMap
        studentScores.put("Bob", 85);
//        Removing key-value pairs from the HashMap: (remove method)
        studentScores.remove("Charlie");
//        Checking if a key or value exists in the HashMap: (containsKey method)
        /*
        The containsKey method checks if a specified key exists in the HashMap, while
        containsValue checks if a specified value exists. These methods return true if the key or
        value is found, and false otherwise.
         */
        boolean containsKey = studentScores.containsKey("Alice");
        boolean containsValue = studentScores.containsValue(80);

        System.out.println(containsKey);
        System.out.println(containsValue);
    }
}
/*
            HashMaps have several advantages:

1. Fast access and retrieval: HashMaps use a hash function to calculate the index of the underlying
   array where a value is stored, allowing for constant-time (O(1)) retrieval.
2. Dynamic size: HashMaps automatically resize themselves to accommodate more elements as needed,
   without manual resizing.
3. Key uniqueness: Each key in a HashMap must be unique. If you add a key-value pair with an existing
   key, the value is updated.
4. Iteration: HashMaps provide methods to iterate over keys, values, or both.

It's important to note that HashMaps do not guarantee the order of key-value pairs. If you need
ordered key-value pairs, you can use the LinkedHashMap class instead, which maintains insertion
order.

HashMaps are widely used for various applications, such as caching, indexing, and data retrieval,
due to their efficiency and flexibility in storing and accessing key-value pairs.
 */