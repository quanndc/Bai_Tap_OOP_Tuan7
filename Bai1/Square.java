package Bai1;

public class Square implements Shape{
    public float edge;
    public float getEdge() {
        return edge;
    }
    public void setEdge(float edge) {
        this.edge = edge;
    }

    @Override
    public float calArea() {
        return (float) 4*this.getEdge();
    }

    @Override
    public float calPerimeter() {
        return (float) Math.pow(this.getEdge(),2);
    }

    @Override
    public String draw(String color) {
        return String.format("Day la hinh vuong mau: %s, co canh: %.0f", color, this.getEdge());
    }

    public Square(){
        this.edge = 1;
    }

    public Square(float edge){
        this.edge = edge;
    }
}
