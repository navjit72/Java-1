package project2;
public class eTriangle extends Triangle{
// Declaring Sequence Number as Static
    private static int seqNum=0;
    
    public eTriangle() {
// Incrementing the sequence Number when the instance is created.
        seqNum+=1;
    }   
    public eTriangle(String color,boolean filled,double side){
        super(color,filled,side,side,side);
// Incrementing the sequence Number when the instance is created.
        seqNum+=1;
    }
    public int getSeqNum() {
        return seqNum;
    }
    public double getSide() {
        return getSide1();
    }   
    public double getArea(){
        return ((Math.sqrt(3)/4)*getSide1()*getSide1());
    }   
    public double getPerimeter(){
        return 3*getSide1();
    }
    public String toString() {
        return "eTriangle{" + "side1=" + getSide1() +
                "side2=" + getSide2() + "side3=" + getSide3() + '}';
    }
    
}
