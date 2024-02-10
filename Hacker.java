import java.util.*;
public class Hacker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int myArray= sc.nextInt();
        int [] myArray1= new int[myArray];
        for(int i=0; i<myArray;i++){
            myArray1[i]=sc.nextInt();
        }
        sc.close();
    
    for(int i=0;i<myArray1.length;i++){
        System.out.println(myArray1[i]);
    }
}
}
