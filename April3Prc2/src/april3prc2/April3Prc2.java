package april3prc2;
public class April3Prc2 {
    public static void main(String[] args) {
        Cat c= new Cat();
        c.sound();
        Animal a1=new Cat();
        Animal a2=new Horse();
        a1=a2;
        
        a1.sound();
    }
    
}
