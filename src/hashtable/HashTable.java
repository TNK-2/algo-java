package hashtable;

public class HashTable<K, V> {

    private int size;
    private Node<K, V>[][] table;

    public HashTable() {
        this.size = 10;
        this.table = new Node[10][0];
    }

    public HashTable(int size) {
        this.size = size;
        this.table = new Node[size][0];
    }

    private int getIndex(K key) {
        return key.hashCode() % this.size;
    }

    public void add(K key, V value) {
        int index = this.getIndex(key);
        Node<K, V>[] datas = this.table[index];

        Node<K, V> newData = new Node<>(key, value);
        if (table[index].length == 0) {
            table[index] = new Node[1];
            table[index][0] = newData;
            return;
        }

        // keyは偶数番号に格納
        for (int i = 0; i < table[index].length; i++) {
            // 既に登録済みのkeyだったら
            if (datas[i].getKey() == key) {
                // 上書きする
                datas[i] = newData;
                return;
            }
        }

        // 未登録のkeyだったら
        Node<K, V>[] newDatas = new Node[datas.length + 1];
        System.arraycopy(datas, 0, newDatas, 0, datas.length);
        newDatas[datas.length] = newData;
        this.table[index] = newDatas;
    }

    public V get(K key) {
        int index = this.getIndex(key);
        Node<K, V>[] datas = this.table[index];
        for (int i = 0; i < datas.length; i++) {
            if (datas[i].getKey() == key) {
                return datas[i].getValue();
            }
        }
        return null;
    }

    public void print() {
        int i = 0;
        for (Node<K, V>[] datas : table) {
            System.out.print("index " + i + " → ");
            for (int j = 0; j < datas.length; j++) {
                System.out.print(datas[j].getKey() + ":" + datas[j].getValue() + ", ");
            }
            System.out.println("");
            i++;
        }
    }
}
