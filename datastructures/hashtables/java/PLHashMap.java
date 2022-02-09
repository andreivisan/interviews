import java.util.ArrayList;
import java.util.List;

public class PLHashMap<K, V> {

    private static class Entry<K, V> {
        final K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Entry<K, V> getNext() {
            return next;
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

    private List<Entry<K, V>> buckets;
    private int size;

    public PLHashMap() {
        this.buckets = new ArrayList<>();
        this.size = 0;
    }
    
    public boolean put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value, null);
        int bucket = getHash(key) % getBucketSize();

        Entry<K, V> existing = buckets.get(bucket);
        if (existing == null) {
            buckets.add(bucket, entry);
            size++;
        } else {
            while (existing.next != null) {
                if (existing.key.equals(key)) {
                    existing.value = value;
                    return true;
                }
                existing = existing.next;
            }
        }

        if(existing.key.equals(key)) {
            existing.value = value;
        } else {
            existing.next = entry;
            size++;
        }

        return true;
    }

    public V get(K key) {
        int index = getHash(key) % getBucketSize();
        Entry<K, V> bucket = buckets.get(index);

        while(bucket != null) {
            if (key == bucket.key) {
                return bucket.value;
            }
            bucket = bucket.next;
        }

        return null;
    }

    private int getHash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode());
    }

    private int getBucketSize() {
        return 16;
    }

    private int size() {
        return size;
    }
    
    public static void main(String[] args) {
        PLHashMap<String, String> plHashMap = new PLHashMap<>();

        plHashMap.put("0", "abc");
        plHashMap.put("1", "xyz");
        plHashMap.put("2", "abc");

        System.out.println("My map size: " + plHashMap.size());
        System.out.println("Value at 1: " + plHashMap.get("1"));
    }
}
