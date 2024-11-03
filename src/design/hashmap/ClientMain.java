package design.hashmap;

public class ClientMain {

    public static void main(String[] args) {
        HashMap<Integer, String> customHashMap = new HashMap<>();
        customHashMap.put(1, "Hello");
        customHashMap.put(5, "World");
        customHashMap.put(8, "Custom");
        customHashMap.put(8, "Updated");
        customHashMap.put(200, "HashMap");
        System.out.println("Custom Hash Map Size ::::::  " + customHashMap.size());
        System.out.println("Custom Hash Map - Key 1 " + customHashMap.get(1));
        System.out.println("Custom Hash Map - Key 5 " + customHashMap.get(5));
        System.out.println("Custom Hash Map - Key 8 " + customHashMap.get(8));
        System.out.println("Custom Hash Map - Key 200 " + customHashMap.get(200));
    }

}
