/*import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("this is a leap year");
        }
        else{
            System.out.println("this is not leap year");
        }
        sc.close();

        
    }
    
}
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        char s= scan.nextLine();
        double d= scan.nextDouble();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
 */
/* 
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     //   int i = scan.nextInt();
        char s= scan.next();
        //double d= scan.nextDouble();

        // Write your code here.

        System.out.println("String: " + s);
      //  System.out.println("Double: " + d);
       // System.out.println("Int: " + i);
    }
}
*/
import java.util.*; 
public class leapyear
{ 
public static void main(String[]args)throws Exception 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter Name of Student"); 
String sname=sc.next(); 
sc.nextLine();
System.out.println("Enter Id of Student"); 
int sid=sc.nextInt(); 
System.out.println("Enter Address of Student"); 
String saddr=sc.next(); 
System.out.println("Student Name:"+sname); 
System.out.println("Student Id:"+sid); 
System.out.println("Student Address:"+saddr); 
sc.close();
} 
}