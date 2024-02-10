/*public class VariableMethodQuestion {
    int x=5;
    void modifyValue(int y){
        x=x+y;

    }
    void printValue(){
        System.out.println("value of x:"+ x);
    }
    public static void main(String[] args) {
        VariableMethodQuestion obj = new VariableMethodQuestion();
        int a=10;
        int b=20;
        obj.modifyValue(a);
        obj.printValue();
        obj.modifyValue(b);
        obj.printValue();
    
    }

}*/public class VariableMethodQuestion 
{ 
 int num = 10; 
 void modifyVariable(int value) 
 { 
 num = value; 
 } 
 void printVariable() 
 { 
 System.out.println("Value of num: " + num); 
 } 
 public static void main(String[] args) { 
 VariableMethodQuestion obj1 = new VariableMethodQuestion(); 
 VariableMethodQuestion obj2 = new VariableMethodQuestion(); 
 obj1.modifyVariable(20); 
 obj1.printVariable(); 
 obj2.printVariable(); 
 } 
} 
