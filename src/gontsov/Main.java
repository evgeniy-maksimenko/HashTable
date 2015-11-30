package gontsov;

import static gontsov.HashTable.*;

public class Main {

    public static void main(String[] args) {

        DataItem aDataItem;
        int aKey, size, n, keysPerCell;

        size = 12;
        n = 8;
        keysPerCell = 10;

        HashTable theHashTable = new HashTable(size);

        for (int j = 0; j < n; j++) {
            aKey = (int) (java.lang.Math.random() * keysPerCell * size);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aDataItem);
        }

        theHashTable.displayTable();
    }
}
