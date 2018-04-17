package ass7.q2.part2;
public class Ass7Q2Part2 implements Parent1,Parent2 {

        @Override
    public void display() {
        System.out.println("Multiple Inheritance using interfaces");
    }
    
    public static void main(String[] args) {
        
        Ass7Q2Part2 a=new Ass7Q2Part2();
        a.display();
    }
    
}
