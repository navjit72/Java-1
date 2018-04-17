package ass6.q1.navjitkaur;
public class Ass6Q1NavjitKaur {
    public static void main(String[] args) {
        Time t1=new Time();
        System.out.println("Current Time Object: ");
        System.out.println(t1.getHour()+":"+t1.getMinute()+":"+t1.getSecond());
        System.out.println("-----------------------------------------------------");
        t1.setTime(98573292382L);
        System.out.println("First Time Object: ");
        System.out.println(t1.getHour()+":"+t1.getMinute()+":"+t1.getSecond());
        System.out.println("-----------------------------------------------------");
        Time t2=new Time(555550000L);
        System.out.println("Second Time Object: ");
        System.out.println(t2.getHour()+":"+t2.getMinute()+":"+t2.getSecond());
        System.out.println("-----------------------------------------------------");
        
    }
    
}
