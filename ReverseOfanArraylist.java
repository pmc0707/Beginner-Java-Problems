import java.util.ArrayList;
public class ReverseOfanArraylist {
    public static void main(String[] args) {
            ArrayList<Integer> array = new ArrayList<>();
            array.add(1);
            array.add(5);
            array.add(4);
            array.add(8);

    

        for(int i=array.size()-1;i>=0;i--){
            System.out.print(array.get(i)+" ");
        }
        System.out.println();
    }
}


