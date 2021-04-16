package LinkedList;

import java.util.NoSuchElementException;

/**
 * LinkedList Implement
 * @author: binqibang
 * @created: 2021/03/25
 */

public class LinkedList<Elem> {

    /** Compared to creating a new class file named Node, this way is better */
    private class Node{
        private Elem value;
        private Node next;
        //constructor1
        public Node(Elem value){
            this.value = value;
        }
        //constructor2
        public Node(){}

    }

    private Node first;
    private Node last;
    private int size;

    private boolean isEmpty(){
        return first == null;
    }

    private Node getPrev(Node item){
        var curr = first;
        while (curr != null){
            if(curr.next == item) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    public LinkedList(){
        first = null;
        last = null;
        size = 0;
    }

    public void addLast(Elem item){
        //keyword 'var' can automatically recognize the type of your variable
        var temp = new Node(item);
        //if the LinkedList is null
        if(isEmpty()){
            first = last = temp;
        } else {
            last.next = temp;
            last = temp;
        }
        last.next = null;
        size++;
    }

    public void print(){
         var temp = new Node();
         temp = first;
         System.out.print("[ ");
         while (temp != null){
             System.out.print(temp.value + " ");
             temp = temp.next;
         }
        System.out.print("]");
    }

    public void addFirst(Elem item){
        var temp = new Node(item);
        if(isEmpty()){
            first = last = temp;
        }else{
            temp.next = first;
            first = temp;
        }
        size++;
    }

    /** index: 0 ~ max */
    public int indexOf(Elem item){
        int index = 0;
        var curr = first;
        while (curr != null){
            if(curr.value == item) {
                return index;
            }
            index++;
            curr = curr.next;
        }
        return -1;
    }

    public boolean contains(Elem item){
        //make good use of indexOf()
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        //if empty ArrayList
        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        //if single element
        if(first == last){
            first = last = null;
        }
        else {
            var temp = first;
            first = first.next;
            //java is automatically garbage-collected
            //so you don't need to free() or delete()
            temp.next = null;
        }
        size--;

    }

    public void removeLast(){
        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        if(first == last){
            first = last = null;
        }
        else {
            var prev = getPrev(last);
            last = prev;
            prev.next = null;
        }
        size--;
    }

    public int size(){
        return size;
    }
}
