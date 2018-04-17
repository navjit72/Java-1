package project2;
public class rTriangle extends Triangle{
// Declaring Sequence Number as Static
    private static int seqNum=0;
    
    public rTriangle() {
// Incrementing the sequence Number when the instance is created.
        seqNum+=1;
    }   
    
    public rTriangle(String color,boolean filled,double base,
            double height,double hypo){
        super(color,filled,base,height,hypo);
// Validating if the instance created is a right traingle.
        if(!isRightTriangle()){
            System.out.println("Not a right triangle!!!");
            seqNum=-1;
        }
        else
// Incrementing the sequence Number when the instance is created 
//            and if it is a right triangle.
            seqNum+=1;
    }
    
    public int getSeqNum() {
        return seqNum;
    }
    public double getBase() {
        return getSide1();
    }
    public double getHeight() {
        return getSide2();
    }   
    public double getHypotenuse(){
        return getSide3();
    }
    public double getArea(){
        if(isRightTriangle())
            return (getSide1()*getSide2())/2;
        else
            return 0;
    }
    
    public double getPerimeter(){
        if(isRightTriangle())
            return getSide1()+getSide2()+getSide3();
        else
            return 0;
    }

    public String toString() {
        return "rTriangle{" + "base=" + getSide1() + ", height=" +
                getSide2() + ", side3=" + getSide3()+ '}';
    }

    public boolean isRightTriangle() {
        double x=Math.sqrt((getSide1()*getSide1())+(getSide2()*getSide2()));
        return getSide3()==x;
    }
    
}
