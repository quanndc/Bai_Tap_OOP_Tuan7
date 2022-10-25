package Bai1;

public class Circle implements Shape{
    public float radius;
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float calArea() {
        return (float) 2*PI*this.getRadius();
    }

    @Override
    public float calPerimeter() {
        return (float) (PI*Math.pow(this.getRadius(),2));
    }

    @Override
    public String draw(String color) {
        return String.format("Day la hinh tron mau: %s, co ban kinh: %.1f", color, this.getRadius());
    }

    public Circle(){
        this.radius = 1;
    }

    public Circle(float radius){
        this.radius = radius;
    }

}
