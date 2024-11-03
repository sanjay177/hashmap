package design.hashmap;

public class HashMap<K, V> {
    private final Integer INITIAL_CAPACITY = 16;
    private Bucket<K,V>[] table;

   @SuppressWarnings("unchecked")
    public HashMap() {
        table = new Bucket[INITIAL_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public HashMap(int initialCapacity) {
        table = new Bucket[initialCapacity];
    }

    private int index(int hashCode) {
       return hashCode & (table.length-1);
    }

    public V get(K key) {
       int hashCode = hash(key);
       int index = index(hashCode);
       Bucket<K, V> recordAtIndex = table[index];
       return recordAtIndex.getValueByKey(key);

    }

    public void put(K key, V value) {
        int hashCode = hash(key);
        int index = index(hashCode);
        Node<K,V> node = new Node<>();
        node.setHashCode(hashCode);
        node.setKey(key);
        node.setValue(value);
        Bucket<K,V> bucket;
        if(table[index] == null) {
            bucket = new Bucket<>();
        } else {
            bucket = table[index];
        }
        bucket.addNodeToList(node);
        table[index] = bucket;
    }

    public void remove(K key) {
        int hashCode = hash(key);
        int index = index(hashCode);
        if(table[index] == null ) {
            return;
        } else {
            Bucket<K,V> bucket = table[index];
            bucket.removeByKey(key);
        }
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
