package LinkedList;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.print();
        System.out.print("\n");
        list.addFirst(40);
        list.print();
        System.out.print("\n");
        System.out.println(list.indexOf(20));
    }
}
