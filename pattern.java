// class pattern{
// 	public static void butterfly(int n){
// 		for (int i=1;i<=n;i++){
// 			for(int j=1;j<=i;j++){
// 				System.out.print("*");
// 			}
// 			for(int j=1;j<=2*(n-i);j++){
// 				System.out.print(" ");
// 			}
// 			for(int j=1;j<=i;j++){
// 				System.out.print("*");
// 			}
// 			System.out.println();
// 		}
// 		for(int i=n;i>=1;i--){
// 			for(int j=1;j<=i;j++){
// 				System.out.print("*");
// 			}
// 			for(int j=1;j<=2*(n-i);j++){
// 				System.out.print(" ");
// 			}
// 			for(int j=1;j<=i;j++){
// 				System.out.print("*");
// 			}
// 			System.out.println();
// 		}
// 	}
// 	public static void main(String[] args) {
// 		butterfly(5);
// 	}
// }
// import java.util.*;
// public class pattern{
//     public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//          System.out.println("enter the number");
//          int n=sc.nextInt();
//          for(int i=1;i<=n;i++){
//             for(int j=1;j<=(n-i)+1;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i++);
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//             sc.close();
//          }
//     }
// }
import java.util.*;
public class pattern{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.print("Enter the number of element");
		n=sc.nextInt();
		int []arr= new int[10];
		System.out.println("Enter the elment of the array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before sorting are:");
		for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
		}}}
// 		for(int i=0;i<n-1;i++){
// 			for(int j=0;j<n-1-i;j++){
// 				if(arr[j]>arr[j+1]){
// 					int temp;
// 					temp=arr[j+1];
// 					arr[j+1]=arr[j];
// 					arr[j]=temp;
// 				}
// 			}
// 		}
// 		System.out.println("Array after sorting");
// 		for(int x:arr){
// 		System.out.print(x+" ");
// 		}
// 	}
// }
// class insertionsort{
//     public static void main(String[] args) {
//         int []arr={5,8,9,6,7,5};
//         int n = arr.length;
//         int key;
//         System.out.println("Before sorting");
//         for(int x:arr){
//             System.out.print(x+" ");
//         }
//         System.out.println();
//         for(int i=1;i<n;i++){
//             key=arr[i];
//             int j=i-1;
//             while(j>0 && arr[j]>key){
//                 arr[j+1]=arr[j];
//                 j=j-1;
//             }
//             arr[j+1]=key;
//         }
//         System.out.println("After swaping");
//         for(int x:arr){
//             System.out.print(x);
//         }
//     }
// }