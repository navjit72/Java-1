package project2;
public class Rectangle extends rTriangle {
    private static int seqNum=0;

    public Rectangle() {
        seqNum+=1;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled, width, height, Math.sqrt((width*width+height*height)));
        seqNum+=1;
    }
    public int getSeqNum() {
        return seqNum;
    }    
    public double getWidth() {
        return getSide1();
    }
    public double getHeight() {
        return getSide2();
    }
    public double getArea(){
        return 2*super.getArea();
    }
    public double getPerimeter(){
        return 2*(getSide1()+getSide2());
    }
    public String toString() {
        return "Rectangle{" + " width= " + getSide1() + " height= " + getSide2()+ '}';
    }
    
}
