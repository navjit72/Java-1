package project2;
public class Square extends rTriangle {
    private static int seqNum=0;

    public Square() {
        seqNum+=1;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side, Math.sqrt((side*side+side*side)));
        seqNum+=1;
    }
    public int getSeqNum() {
        return seqNum;
    }    
    public double getSide() {
        return getSide1();
    }
    public double getArea(){
        return 2*super.getArea();
    }
    public double getPerimeter(){
        return 4*(getSide1());
    }
    public String toString() {
        return "Square{" + " side= " + '}';
    }
}
