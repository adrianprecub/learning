package com.learning.datastructures.hashtable;

import com.learning.datastructures.linkedlist.LinkedList;

/**
 * Created by adi on 8/6/18.
 */
public class Hashtable {
    LinkedList[] data;
    public boolean put(String key, Object value) {
        int hash = key.hashCode();
        int index = convertToIndex(hash);

        LinkedList list = data[index];
        //list.insert(key, value);
        return true;
    }

    private int convertToIndex(int hash) {
        return 0;
    }

}
