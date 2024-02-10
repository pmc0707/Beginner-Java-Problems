/*public class recursionbasic{
    public static void printdec(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printdec(n);
    }
}*/
import java.util.Scanner;  // Import the Scanner class

class recursionbasic {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");
    myObj.close();

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}