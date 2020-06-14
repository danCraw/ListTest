package com.company;

import java.util.LinkedList;

public class AddUniqueness {
    public  LinkedList add(LinkedList linkedList ,Object element){
        if (!linkedList.contains(element)) {
            linkedList.addFirst(element);
            linkedList.addLast(element);
        } else {
            return linkedList;
        }
        return linkedList;
    }
}
