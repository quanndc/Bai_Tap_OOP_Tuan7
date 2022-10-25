package Bai1;

public class Program {
    public static void main(String args[]){

        Shape array[] = new Shape[4];
        array[0] = new Circle(1);
        array[1] = new Circle(2);
        array[2] = new Square(3);
        array[3] = new Square(4);

        for(Shape obj: array){
            if(obj instanceof Circle){
                System.out.println(obj.draw("vang"));
                System.out.println(obj.calArea());
                System.out.println(obj.calPerimeter()); 
                
            }
            else{
                System.out.println(obj.draw("hong"));
                System.out.println(obj.calArea());
                System.out.println(obj.calPerimeter()); 
                
            }
        }
    }
}