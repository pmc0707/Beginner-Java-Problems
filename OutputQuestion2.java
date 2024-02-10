public class OutputQuestion2 {
    private int number;
    public OutputQuestion2(int num){
        number=num;
    }
    public int calculateSquare(){
        return number*number;

    }
    public int calculateCube(){
        return number*number*number;
    }
    public static void main(String[] args) {
        OutputQuestion2 obj = new OutputQuestion2(5);
        int squareResult = obj.calculateSquare();
        int cubeResult =obj.calculateCube();
        System.out.println("Number:" +obj.number);
        System.out.println("square:"+squareResult);
        System.out.println("cube:"+cubeResult);
        }
}
