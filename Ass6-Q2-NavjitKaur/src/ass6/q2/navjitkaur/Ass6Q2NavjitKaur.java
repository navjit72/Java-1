package ass6.q2.navjitkaur;

import java.util.Scanner;

public class Ass6Q2NavjitKaur {
    public static void main(String[] args) {
        Magic[] objArray=new Magic[10];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 10 magic numbers: ");
        for(int i=0;i<objArray.length;i++) {
            int x=input.nextInt();
            objArray[i]=new Magic(x);
        }
        System.out.println("Magic numbers: ");
        for(int i=objArray.length-1;i>=0;i--) {
            System.out.println(objArray[i].getValue());
        }
    }
    
}
