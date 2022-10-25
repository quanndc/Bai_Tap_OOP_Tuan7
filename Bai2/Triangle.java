package Bai2;

import Bai1.Shape;

public class Triangle extends Point implements Shape{
    public float a;
    public float getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }

    public float b;
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }

    public float c;
    public float getC() {
        return c;
    }
    public void setC(float c) {
        this.c = c;
    }


    @Override
    public float calArea() {
        return (float) this.getA() + this.getB() + this.getC();
    }

    @Override
    public float calPerimeter() {
        return (float) Math.sqrt(this.getA() + this.getB() + this.getC() * (this.getA() + this.getB() - this.getC())
                                * this.getB() + this.getC() - this.getA() * this.getC() + this.getA() - this.getB()) / 4;
    }

    @Override
    public String draw(String color){
        if(isTriangle()){
            return String.format("Day la tam giac (%.0f, %.0f, %.0f), mau %s, duoc ve tai toa do (%s)", this.getA(), this.getB(), this.getC(), color, this.toString());
        }else{
            return String.format("Day khong phai tam giac");
        }
    }


    public Triangle(){
        this.a = 1;
        this.b = 1;
        this.c = 1;
        this.x = 0;
        this.y = 0;
    }

    public Triangle(int x, int y, float a, float b, float c){
        super(x,y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle(){
        if((this.getA() != 0 && this.getB() != 0 && this.getC() != 0) &&
            this.getA()+this.getB() > this.getC() && this.getB()+this.getC() > this.getA() &&
            this.getA()+this.getC() > this.getB()){
                return true;
            }
        else{
            return false;
        }
    }
}
