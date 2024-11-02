package design.hashmap;

public class HashMap<K, V> {
    private final Integer INITIAL_CAPACITY = 16;
    V[] table;

   @SuppressWarnings("unchecked")
    public HashMap() {
        table = (V[]) new Object[INITIAL_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public HashMap(int initialCapacity) {
        table = (V[]) new Object[initialCapacity];
    }

    private int index(int hashCode) {
       return hashCode & (table.length-1);
    }

    public V get(K key) {
       int hashCode = hash(key);
       int index = index(hashCode);
       return table[index];
    }

    public void put(K key, V value) {
        int hashCode = hash(key);
        int index = index(hashCode);
        table[index] = value;
    }

    public void remove(K key) {
        int hashCode = hash(key);
        int index = index(hashCode);
        table[index] = null;
    }


    private int hash(K key) {
       return key.hashCode() ^ (key.hashCode() >>> 16);
    }

    public int size() {
       return table.length;
    }


    public void resize()  {
       // Resizing will require if array becomes full , we need to move all enteries to new bigger array and rehash again
    }



}
