
// class pattern2{
// 	public static void burjkhalifa(int n){
// 		//1st half
// 		for (int i=0;i<=n;i++){
// 			//star i
// 			for(int j=0;j<=i;j++){
// 				System.out.print("*");
// 			}//space 2*(n-i)
// 			for (int j=1;j<=2*(n-i);j++){
// 				System.out.print(" ");
// 			}//stars i
// 			for(int j=0;j<=i;j++){
// 				System.out.print("*");
// 			}System.out.println();
// 			for (int k=n;k>=1;k--){
// 			//star i
// 			for(int j=0;j<=i;j++){
// 				System.out.print("*");
// 			}//space 2*(n-i)
// 			for (int j=1;j<=2*(n-i);j++){
// 				System.out.print(" ");
// 			}//stars i
// 			for(int j=0;j<=i;j++){
// 				System.out.print("*");
// 			} System.out.println();
// 		  }
// 		}
// 	}
// 	public static void main(String[] args) {
// 		burjkhalifa(5);
		
// 	}
// }
class pattern2{
	public static void arrow(int n){
					for (int k=n;k>=1;k--){
			//star i
			for(int j=0;j<=k;j++){
				System.out.print("*");
			}//space 2*(n-i)
			for (int j=1;j<=2*(n-k);j++){
				System.out.print(" ");
			}//stars i
			for(int j=0;j<=k;j++){
				System.out.print("*");
			} System.out.println();
		//1st half
		for (int i=0;i<=n;i++){
			//star i
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}//space 2*(n-i)
			for (int j=1;j<=2*(n-i);j++){
				System.out.print(" ");
			}//stars i
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}System.out.println();

		  }
		}
	}
	public static void main(String[] args) {
		arrow(5);
		
	}
}