package quiz;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        String[] list= new String[5];
        String[] revList=new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the names: ");
        for(int i=0; i<list.length; i++)
            list[i]=input.nextLine();
        for(int i=list.length-1;i>=0;i--)
            revList[4-i]=list[i];
        System.out.println("The elements of list are: ");
        for(String n:list)
            System.out.printf(n+" ");
        System.out.println();
        System.out.println("The elements of revList are: ");
        for(String n:revList)
            System.out.printf(n+" ");
        System.out.println();
    }    
}
