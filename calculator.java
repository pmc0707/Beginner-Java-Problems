public class calculator {
    int result ;
    public void add(int num1,int num2){
        result = num1+num2;
    }
    public void sub(int num1 ,int num2){
    result= num1-num2;
    }
    public int getResult(){
        return result;  
    }
    public static void main(String[] args) {
        calculator cal=new calculator();
        int num1=10;
        int num2=5;
        cal.add(num1,num2);
        System.out.println("Addition result :"+cal.getResult());
        cal.sub(num1,num2);
        System.out.println("Subtraction result :"+cal.getResult());
    }
}

