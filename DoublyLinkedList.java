import java.util.*;
public class DoublyLinkedList{
    class Node{
        int d;
        Node prev, nxt;
        Node(int d){
            this.d = d;
            prev=nxt=null;
        }
    }
    Node head = null;
    void insert(int d){
        if(head == null){
            head = new Node(d);
            return;
        }
        Node temp = head;
        while(temp.nxt != null){
            temp=temp.nxt;
        }
        temp.nxt = new Node(d);
        temp.nxt.prev = temp;
    }
    public static void main(String args[]){
        DoublyLinkedList ob = new DoublyLinkedList();
        ob.insert(0);
        ob.insert(1);
        ob.insert(2);
        ob.insert(3);
    }
}