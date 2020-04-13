import java.util.ArrayList;
import java.util.List;

public class HashMap<K,V> {
    private class HashMapNode<K,V> {
        K key;
        V value;

        public HashMapNode(K key, V value){
            this.key = key;
            this.value = value;
        }

    }

    private int size;
    private List<List<HashMapNode<K,V>>> tables;
    public HashMap(int size){
        this.size = size;
        for(int i = 0; i < size; i++){
            tables.add(new ArrayList<>());
        }
    }

    private int hash_function(K key) {
        int i = (int) key;
        return i % this.tables.size();
    }

    public void set(K key, V value){
        int hash_index = hash_function(key);
        for(HashMapNode<K,V> item: tables.get(hash_index)){
            if(item.key == key){
                item.value = value;
                return;
            }
        }
        tables.get(hash_index).add(new HashMapNode<K,V>(key, value));
    }

    public V get(K key) throws Exception {
        int hash_index = hash_function(key);
        for(HashMapNode<K,V> item: tables.get(hash_index)){
            if(item.key == key){
                return item.value;
            }
        }
        throw new Exception("Key not found");
    }

    public void remove(K key) throws Exception {
        int hash_index = hash_function(key);
        int count = 0;
        for(HashMapNode<K,V> item: tables.get(hash_index)){
            if(item.key == key){
                tables.get(hash_index).remove(count);
                return;
            }
            count++;
        }
        throw new Exception("Key not found");
    }

}