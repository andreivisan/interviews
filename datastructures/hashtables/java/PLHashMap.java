import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PLHashMap<K, V> {

    private static class Entry<K, V> {
        final K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;

            if (obj instanceof Entry) {
                Entry<K, V> entry = (Entry) obj;

                return key.equals(entry.getKey()) &&
                        value.equals(entry.getValue());
            }
            return false;
        }

        @Override
        public String toString() {
            return "{" + key + ", " + value + "}";
        }
    }

    private static class Bucket<K, V> {
        LinkedList<Entry<K, V>> bucket;

        public Bucket() {
            bucket = new LinkedList<Entry<K, V>>();
        }

        public V get(K key) {
            for (Entry<K, V> entry : bucket) {
               if(entry.key.equals(key)) {
                   return entry.value;
               } 
            }
            return null;
        }

        public void update(K key, V value) {
            boolean found = false;
            for (Entry<K, V> entry : bucket) {
                if(entry.key.equals(key)) {
                    entry.value = value;
                    found = true;
                } 
            }
            if (!found) {
                this.bucket.add(new Entry<K, V>(key, value));
            } 
        }

        public void remove(K key) {
            for (Entry<K, V> entry : bucket) {
                if(entry.key.equals(key)) {
                    this.bucket.remove(entry);
                    break;
                } 
            }
        }
    }

    private int keySpace;
    private List<Bucket<K, V>> hashTable;

    public PLHashMap() {
        this.keySpace = 2069;
        this.hashTable = new ArrayList<>();
        for (int i = 0; i < this.keySpace; i++) {
            this.hashTable.add(new Bucket<>());
        }
    }

    public void put(K key, V value) {
        int hashKey = key.hashCode() % this.keySpace;
        this.hashTable.get(hashKey).update(key, value);
    }

    public V get(K key) {
        int hashKey = key.hashCode() % this.keySpace;
        return this.hashTable.get(hashKey).get(key);
    }

    public void remove(K key) {
        int hashKey = key.hashCode() % this.keySpace;
        this.hashTable.get(hashKey).remove(key);
    }
    
    public static void main(String[] args) {
        PLHashMap<String, String> plHashMap = new PLHashMap<>();

        plHashMap.put("0", "abc");
        plHashMap.put("1", "xyz");
        plHashMap.put("test", "bla");

        System.out.println("Value at test: " + plHashMap.get("test"));
    }
}
