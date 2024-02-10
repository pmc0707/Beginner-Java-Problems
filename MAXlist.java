import java.util.*;
public class MAXlist {
    public static void main(String[] args) {
        
        ArrayList<Integer> array = new ArrayList<>();
            array.add(1);
      array.add(5);
      array.add(4);
      array.add(8);
      int max = Integer.MIN_VALUE;
      for(int i=0;i<array.size();i++){
        if(max<array.get(i)){
            max = array.get(i);
        }
      }
      System.out.println(max);
  

    }
}
    
