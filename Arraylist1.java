import java.util.ArrayList;
public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> array =new  ArrayList<>();
        array.add(1);
        array.add(5);
        array.add(4);
        array.add(8);
        array.add(1, 9);
        System.out.println(array);
        //get operation
        // int element= array.get(2);
        // System.err.println(element);
        // array.remove( 2);
        // System.out.println(array);
        // array.set(2, 19);
        // System.out.println(array);
        // System.out.println(array.size());
    }
}
