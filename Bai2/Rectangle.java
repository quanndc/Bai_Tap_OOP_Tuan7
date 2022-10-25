package Bai2;

import Bai1.Shape;

public class Rectangle extends Point implements Shape {
    public float length;
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        if(length <= 0){
            this.length = 1;
        }
        this.length = length;
    }

    public float width;
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        if(width <= 0){
            this.width = 1;
        }
        this.width = width;
    }

    public Rectangle(){
        this.width = 1;
        this.length = 1;
        this.x = 0;
        this.y = 0;
    }

    public Rectangle(float length, float width, int x, int y){
        super(x,y);
        if(length <= 0){
            this.length = 1;
        }
        this.length = length;

        if(width <= 0){
            this.width = 1;
        }
        this.width = width;
    }

    @Override
    public float calArea(){
        return (float) 2*(this.getLength()+this.getWidth());
    }

    @Override
    public float calPerimeter(){
        return this.getWidth()*this.getLength();
    }

    @Override
    public String draw(String color) {
        return String.format("Day la HCN (%.0f,%.0f), duoc ve tai toa do: %s", this.getLength(), this.getWidth(), this.toString());
    } 
    
    public String toString(){
        return String.format("[(%d %d), %.0f %.0f]", this.getX(), this.getY(), this.getLength(), this.getWidth());

    }
}
