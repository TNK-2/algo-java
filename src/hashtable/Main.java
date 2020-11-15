package hashtable;

public class Main {

    public static void main (String[] args) {
        HashTable<String, String> hashTable = new HashTable();
        hashTable.add("aaa", "111");
        hashTable.add("bbb", "222");
        hashTable.add("ccc", "333");
        System.out.println(hashTable.get("ccc"));
        hashTable.add("ccc", "???");
        System.out.println(hashTable.get("ccc"));
        hashTable.add("ddd", "444");
        hashTable.add("fff", "555");
        hashTable.add("ggg", "666");
        hashTable.add("hhh", "777");
        hashTable.add("iii", "888");
        hashTable.add("jjj", "999");
        hashTable.add("kkk", "!!!");
        hashTable.add("lll", "000");
        hashTable.print();
    }
}
