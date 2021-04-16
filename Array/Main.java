package Array;
import java.util.Arrays;

/**
* Array Class test
* @author binqibang
* @created 2021/03/22
*/

public class Main {
    public static void main(String[] args) {
        // general Arrays in java, same as C++
        int[] nums = new int[5];    //initialize with 0
        for (int i = 0; i <nums.length; i++) {
            nums[i] = i * 2;
        }
        System.out.println(Arrays.toString(nums));

        //my class Array test
        Array mynums = new Array(4);
        mynums.push_back(1);
        mynums.push_back(2);
        mynums.push_back(3);
        mynums.push_back(4);
        mynums.push_back(5);
        mynums.print();
        System.out.print("\n");
        mynums.remove(0);
        mynums.print();
        mynums.insert(6,1);
        System.out.print("\n");
        mynums.print();
        System.out.print("\n");
        System.out.println(mynums.search(3));
        System.out.println(mynums.search(30));
    }
}
