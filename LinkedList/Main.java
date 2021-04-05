package LinkedList;

public class Main {
    public static void main(String[] args) {
        // integer list
        var list = new LinkedList<Integer>();
        for (int i = 1; i < 6; i++) {
            list.addLast(i * 2);
        }
        list.print();
        System.out.print("\n");
        list.addFirst(40);
        list.print();
        System.out.print("\n");
        System.out.println(list.indexOf(20));
        list.removeFirst();
        list.print();
        System.out.print("\n");
        list.removeLast();
        list.print();
        System.out.print("\n");
        System.out.println(list.size());
        System.out.print("#----------------------------------------------------------#\n");

        // character list
        var char_list = new LinkedList<Character>();
        char_list.addLast('a');
        char_list.addLast('b');
        char_list.addLast('c');
        char_list.print();
        System.out.print("\n#----------------------------------------------------------#\n");

        // string list
        var str_list = new LinkedList<String>();
        str_list.addLast("James");
        str_list.addLast("Kobe");
        str_list.addLast("Paul");
        str_list.addFirst("Curry");
        str_list.print();
    }
}
