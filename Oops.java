public class Oops {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="yellow";
        System.out.println(p1.color);
    }
}
class pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newtip){
        tip =newtip;

    }
}
class person{
    String name;
    int age;
    void talk(){
        System.out.println("hello im"+name);
        System.out.println("my name is"+age);
    }
}
class demo{
    public static void main(String[] args) {
        person Raju = new person();
        Raju.talk();
    }
}