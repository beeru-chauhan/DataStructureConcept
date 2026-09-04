package com.beeru.dsa.linkedList;

public class GetIndex {
    public static void main(String[] args) {
        LinkedList5 linkedList5 = new LinkedList5(4);
        linkedList5.append(7);
        linkedList5.prepend(8);
        linkedList5.prepend(2);
        linkedList5.append(3);
        System.out.println(linkedList5.get(4).value);
        linkedList5.printList();
    }
}
