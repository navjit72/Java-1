package project2;
public class TrianglePyramid extends GeometericObject{
// Declaring all the attributes
    private double base;
    private double edge;
    private double height;
    private double slantHeight;
// Declaring Sequence Number as Static
    private static int seqNum=0;

    public TrianglePyramid() {
// Incrementing the sequence Number when the instance is created.
        seqNum+=1;
    }

    public TrianglePyramid(String color, boolean filled,double base, double height) {
        super(color, filled);
// Incrementing the sequence Number when the instance is created.
        seqNum+=1;
        this.base = base;
        this.height = height;
// Calculating the edge length from the give base and height.
        this.edge = Math.sqrt((this.height*this.height)+((this.base*this.base)/3));
// Calculating the slant height from the calculated edge length and given base.
        this.slantHeight=Math.sqrt((4*(edge*edge)-(this.base*this.base))/4);
    }

    public int getSeqNum() {
        return seqNum;
    }

    public double getBase() {
        return base;
    }

    public double getEdge() {
        return edge;
    }

    public double getHeight() {
        return height;
    }
    
    public double getSlantHeight() {
        return slantHeight;
    }
    
    public double getArea(){
        return (Math.sqrt(3)/4)*base*base+(3/2)*base*slantHeight;
    }
    
    public double getVolume(){
        return (Math.sqrt(3)/12)*base*base*height;
    }

    public String toString() {
        return "TrianglePyramid{" + "base=" + base + ", edge=" +
        edge + ", height=" + height + ", slantHeight=" + slantHeight + '}';
    }
}
