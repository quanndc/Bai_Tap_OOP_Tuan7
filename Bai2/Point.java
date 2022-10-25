package Bai2;
public class Point {
    public int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

   
    public void move(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public String toString(){
        return String.format("(%d,%d)", this.getX(), this.getY());
    }


    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
