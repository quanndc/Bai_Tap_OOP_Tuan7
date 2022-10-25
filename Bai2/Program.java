package Bai2;
public class Program {
    public static void main(String[] args){
        Rectangle a = new Rectangle(2,3,4,5);
        //System.out.println(a.draw("den"));
        //System.out.println(a.toString());
        Triangle b = new Triangle(1, 1, 1, 1, 1);
        System.out.println(b.draw("vang"));
        
        System.out.println(b.calArea());
        System.out.println(b.calPerimeter());
    }
}
