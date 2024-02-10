public class Rectangle 
{ 
 int length; 
 int width; 
 public int calculateArea() { 
 return length * width; 
 } 
 public void displayDetails() 
 { 
 System.out.println("Rectangle Length: " + length); 
 System.out.println("Rectangle Width: " + width); 
 System.out.println("Rectangle Area: " + calculateArea()); 
 } 
 public static void main(String[] args) 
 { 
 Rectangle rectangle = new Rectangle(); 
 rectangle.length = 5; 
 rectangle.width = 10; 
 rectangle.displayDetails(); 
 } 
} 