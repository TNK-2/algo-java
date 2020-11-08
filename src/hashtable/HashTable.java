package hashtable;

public class HashTable {

    private int size;
    private String[][] table;

    public HashTable() {
        this.size = 10;
        this.table = new String[10][0];
    }

    public HashTable(int size) {
        this.size = size;
        this.table = new String[size][0];
    }

    private int getIndex(String key) {
        return key.hashCode() % this.size;
    }

    public void add(String key, String value) {
        int index = this.getIndex(key);
        String[] datas = this.table[index];

        if (table[index].length == 0) {
            table[index] = new String[2];
            table[index][0] = key;
            table[index][1] = value;
            return;
        }

        // keyは偶数番号に格納
        for (int i = 0; i < table[index].length; i = i + 2) {
            // 既に登録済みのkeyだったら
            if (datas[i] == key) {
                // 上書きする
                datas[i + 1] = value;
                return;
            }
        }

        // 未登録のkeyだったら
        String[] newDatas = new String[datas.length + 2];
        System.arraycopy(datas, 0, newDatas, 0, datas.length);
        newDatas[datas.length] = key;
        newDatas[datas.length + 1] = value;
        this.table[index] = newDatas;
    }

    public String get(String key) {
        int index = this.getIndex(key);
        String[] datas = this.table[index];
        for (int i = 0; i < datas.length; i++) {
            if (datas[i] == key) {
                return datas[i + 1];
            }
        }
        return null;
    }

    public void print() {
        int i = 0;
        for (String[] datas : table) {
            System.out.print("index " + i + " → ");
            for (int j = 0; j < datas.length; j = j + 2) {
                System.out.print(datas[j] + ":" + datas[j + 1] + ", ");
            }
            System.out.println("");
            i++;
        }
    }
}
