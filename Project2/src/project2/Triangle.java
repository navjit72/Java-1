package project2;
public class Triangle extends GeometericObject{
// Declaring all the attributes
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;
// Declaring Sequence Number as Static
    private static int seqNum=0;
    
    public Triangle() {
// Incrementing the sequence Number when the instance is created.
        seqNum+=1;
    }   
    public Triangle(String color,boolean filled,
            double side1, double side2, double side3) {
        super(color,filled);
// Incrementing the sequence Number when the instance is created.
        seqNum+=1;
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public int getSeqNum() {
        return seqNum;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }   
    public double getArea(){
        double p=getPerimeter()/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public String toString() {
        return "Triangle{" + "side1=" + side1 + ","
             + " side2=" + side2 + ", side3=" + side3 + '}';
    }
    
}
