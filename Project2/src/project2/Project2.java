package project2;
public class Project2 {
    public static void main(String[] args) {
    // Creating first Triangle object.
        Triangle t1=new Triangle("Yellow",true,1, 1.5, 1);
        System.out.println("Triangle object: ");
        System.out.println("Area: "+t1.getArea());
        System.out.println("Perimeter: "+t1.getPerimeter());
        System.out.println("Color: "+t1.getColor());
        System.out.println("If it is Filled: "+t1.isFilled());
        System.out.println("Date of creation: "+t1.getDateCreated());
        System.out.println("Instance number: "+t1.getSeqNum());
        System.out.println("-----------------------------------------------");
    
    // Creating first Right Triangle object.
        rTriangle rT1=new rTriangle("Black",true,3, 4,5);
        System.out.println("Right triangle object: ");
        System.out.println("Area: "+rT1.getArea());
        System.out.println("Perimeter: "+rT1.getPerimeter());
        System.out.println("Color: "+rT1.getColor());
        System.out.println("If it is Filled: "+rT1.isFilled());
        System.out.println("Instance number: "+rT1.getSeqNum());
        System.out.println("-----------------------------------------------");
        
    // Creating second Right Triangle object.
        rTriangle rT2=new rTriangle("Black",false,3, 8,4);
        System.out.println("Right triangle object: ");
        System.out.println("Area: "+rT2.getArea());
        System.out.println("Perimeter: "+rT2.getPerimeter());
        System.out.println("Color: "+rT2.getColor());
        System.out.println("If it is Filled: "+rT2.isFilled());
        System.out.println("Instance number: "+rT2.getSeqNum());
        System.out.println("-----------------------------------------------");
        
    // Creating third Right Triangle object.
        rTriangle rT3=new rTriangle("Black",true,5, 8,13);
        System.out.println("Right triangle object: ");
        System.out.println("Area: "+rT3.getArea());
        System.out.println("Perimeter: "+rT3.getPerimeter());
        System.out.println("Color: "+rT3.getColor());
        System.out.println("If it is Filled: "+rT3.isFilled());
        System.out.println("Instance number: "+rT3.getSeqNum());
        System.out.println("-----------------------------------------------");
        
    // Creating first equilateral Triangle object.
        eTriangle eT1=new eTriangle("Red",false,3);
        System.out.println("Equilateral triangle object: ");
        System.out.println("Area: "+eT1.getArea());
        System.out.println("Perimeter: "+eT1.getPerimeter());
        System.out.println("Color: "+eT1.getColor());
        System.out.println("If it is Filled: "+eT1.isFilled());
        System.out.println("Instance number: "+eT1.getSeqNum());
        System.out.println("-----------------------------------------------");
        
    // Creating second equilateral Triangle object.
        eTriangle eT2=new eTriangle("grey",true,5);
        System.out.println("Equilateral triangle object: ");
        System.out.println("Area: "+eT2.getArea());
        System.out.println("Perimeter: "+eT2.getPerimeter());
        System.out.println("Color: "+eT2.getColor());
        System.out.println("If it is Filled: "+eT2.isFilled());
        System.out.println("Instance number: "+eT2.getSeqNum());
        System.out.println("-----------------------------------------------");
        
    // Creating first Triangular Pyramid object.
        TrianglePyramid TP1=new TrianglePyramid("pink", true, 4.5, 6);
        System.out.println("Triangle Pyramid object: ");
        System.out.println("Area: "+TP1.getArea());
        System.out.println("Perimeter: "+TP1.getVolume());
        System.out.println("Color: "+TP1.getColor());
        System.out.println("If it is Filled: "+TP1.isFilled());
        System.out.println("Date of creation: "+TP1.getDateCreated());
        System.out.println("Instance number: "+TP1.getSeqNum());
        System.out.println("-----------------------------------------------");
        
    // Creating first Rectangle object.
        Rectangle r1=new Rectangle("Grey",false,5, 8);
        System.out.println("Rectangle object: ");
        System.out.println("Area: "+r1.getArea());
        System.out.println("Perimeter: "+r1.getPerimeter());
        System.out.println("Color: "+r1.getColor());
        System.out.println("If it is Filled: "+r1.isFilled());
        System.out.println("Instance number: "+r1.getSeqNum());
        System.out.println("-----------------------------------------------");
     
    // Creating first Square object.
        Square s1=new Square("Aqua",true,10);
        System.out.println("Square object: ");
        System.out.println("Area: "+s1.getArea());
        System.out.println("Perimeter: "+s1.getPerimeter());
        System.out.println("Color: "+s1.getColor());
        System.out.println("If it is Filled: "+s1.isFilled());
        System.out.println("Instance number: "+s1.getSeqNum());
        System.out.println("-----------------------------------------------");
        
    // Experimenting method overriding.
        Triangle P = new eTriangle();
        System.out.println(P.toString());
        System.out.println(P.getSeqNum());
    //  It is gonna give an error.
    //  eTriangle Q = new Triangle();
    //  Q.toString();
        eTriangle S = new eTriangle();
        System.out.println(S.toString());
        Triangle T = new Triangle();
        System.out.println(T.toString());
        T = S;
        System.out.println(T.getSeqNum());
        System.out.println(T.toString());
    }
    
}
