package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        AddUniqueness addUniqueness = new AddUniqueness();
        Stack stack = new Stack();
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("aa");
        linkedList.add("aaaaa");
        linkedList.add("aaa");
        linkedList.add("aaaaa");
        stack.push("a");
        stack.push("a");
        stack.push("aa");
        stack.push("aaa");
        stack.push("aaaa");
        stack.push("aaaaa");
        
//        System.out.print(addUniqueness.add(linkedList, "b"));
//        System.out.print(Remove.max(linkedList));
    }
}
