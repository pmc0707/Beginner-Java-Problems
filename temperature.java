import java.util.*;
public class temperature {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double temp=sc.nextDouble();
        if(temp>100){
            System.out.println("you are suffring from fever");
        }
        else{
            System.out.println("you are not suffring from fever");
        }
        sc.close();
    }
    
}
