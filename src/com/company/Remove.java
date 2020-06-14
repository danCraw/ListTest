package com.company;

import java.util.LinkedList;

public class Remove {

    public static LinkedList max(LinkedList list){
        int max = list.indexOf(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).toString().length() > max) {
                max = list.get(i).toString().length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().length() == max) {
                list.remove(list.get(i));
            }
        }
        return list;
    }
}
