import java.util.*;
 public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j= 0; j<arr.length;j++){
            for(int k =j+1;k<arr.length;k++){
                if(target ==arr[j]+arr[k]){
                    System.out.print(j);
                    System.out.print(k);
     
                }
            }
        }
    }
}