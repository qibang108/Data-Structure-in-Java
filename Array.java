package Array;

public class Array {
    private int[] elements;
    private int count;

    //constructor function
    public Array(int length){
        elements = new int[length];
        count = 0;
    }

    //print the Array
    public void print(){
        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.print("]");
    }

    //insert a new element to the end of Array
    public void push_back(int item){
        //if the elements is full, resize it
        if(elements.length == count){
            //create a new array(twice the size)
            int[] newElements = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[count] = item;
        count++;
    }

    //insert at the position of index
    public void insert(int item, int index){
        if(index < 0 || index > count){
            throw new IllegalArgumentException();
        }

        if(index == count) push_back(item);

        //if the elements is full, resize it
        if(elements.length == count){
            //create a new array(twice the size)
            int[] newElements = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }

        //right shift the right elements of element[index]
        for (int i = count; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        //insert the item
        elements[index] = item;
        count++;
    }

    //remove a element at the position of index
    //index: 0 ~ count - 1
    public void remove(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count; i++) {
            elements[i] = elements[i + 1];
        }
        count--;
    }

    //if we find it, return index
    //otherwise, return -1
    public int search(int item){
        for (int i = 0; i < count; i++) {
            if(elements[i] == item)
                return i;
        }
        return -1;
    }
}
