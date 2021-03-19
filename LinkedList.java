package LinkedList;

public class LinkedList {
    //Compared to creating a new class file named Node, this way is better
    private class Node{
        private int value;
        private Node next;
        //constructor
        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    private boolean isEmpty(){
        return first == null;
    }

    public void LinkedList(){
        first = null;
        last = null;
    }

    public void addLast(int item){
        var temp = new Node(item);  //java also has a Node class
        //if the LinkedList is null
        if(isEmpty()){
            first = last = temp;
        } else {
            last.next = temp;
            last = temp;
        }
        last.next = null;
    }

    public void print(){
         var temp = new Node(0);
         temp = first;
         System.out.print("[ ");
         while (temp != null){
             System.out.print(temp.value + " ");
             temp = temp.next;
         }
        System.out.print("]");
    }

    public void addFirst(int item){
        var temp = new Node(item);
        if(isEmpty()){
            first = last = temp;
        }else{
            temp.next = first;
            first = temp;
        }
    }

    //index: 0 ~ max
    public int indexOf(int item){
        int index = 0;
        var curr = first;
        while (curr != null){
            if(curr.value == item)
                return index;
            index++;
            curr = curr.next;
        }
        return -1;
    }

    public boolean contains(int item){
        //make good use of indexOf()
        return indexOf(item) != -1;
    }

}
