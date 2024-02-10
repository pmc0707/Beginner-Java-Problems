public class Calculatorr 
{ 
 int num = 100; 
 public void calc(int num) 
 { 
 this.num = num * 10; 
 } 
 public void printNum() 
 { 
 System.out.println(num); 
 } 
 public static void main(String[] args) 
 { 
 Calculatorr obj = new Calculatorr(); 
 obj.calc(2); 
 obj.printNum(); 
 } 
} 