public class OutputQuestion {
    int x=10;
    void modifyValue(int val){
        x= val*2;
    }
    int getValue(){
        return x;

    }
    public static void main(String[] args) {
        OutputQuestion obj1= new OutputQuestion();
        OutputQuestion obj2 =obj1;
        OutputQuestion obj3 = new OutputQuestion();
        obj2.modifyValue(5);
        obj3.modifyValue(7);
        System.out.println("obj1 value :"+obj1.getValue());
        System.out.println("obj2 value :"+obj2.getValue());
        System.out.println("obj3 value :"+obj3.getValue());

    }
    
}

/*public class OutputQuestion{ 
 int x = 10; 
 int y = 5; 
 public int addNumbers(int a, int b) 
 { 
 return a + b; 
 } 
 public int multiplyNumbers(int a, int b) 
 { 
 return a * b; 
 } 
 public static void main(String[] args) 
 { 
 OutputQuestion obj = new OutputQuestion(); 
 int result1 = obj.addNumbers(obj.x, obj.y); 
 int result2 = obj.multiplyNumbers(obj.x, obj.y); 
 int sum = obj.addNumbers(result1, result2); 
 System.out.println("Sum of the results: " + sum); 
 } 
} */