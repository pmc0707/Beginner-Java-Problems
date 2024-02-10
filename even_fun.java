import java.util.*;
public class even_fun {

    public static void isEven(){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if(a%2==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");

        }
        
        sc.close();
    }
    public static void main(String[] args){
    isEven();
}
    
}
