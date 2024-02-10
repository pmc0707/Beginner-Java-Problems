public class permutation {
    public static void findPermutation(String str, String ans){
        //base caase
        if (str.length()==0) {
            System.out.println(ans);
            return;
            
        }
        //recuression
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i)+ str.substring(i+1);
            findPermutation(Newstr,ans+curr);
        }

    }
    public static void main(String[] args) {
        String str ="abc";
        findPermutation(str, ""); 
        
    }
    
}