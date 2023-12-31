// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x,n,element;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the stack capacity : ");
        n=s.nextInt();
        System.out.println("enter the numbers of elements to add :  ");
        x=s.nextInt();
        CustomStack A = new CustomStack(n);
        for (int i=0;i<x;i++) {
            int j=i+1;
            System.out.println("element " + j);
            element=s.nextInt();
            A.AddElement(element);
        }

        System.out.println("enter the numbers of elements to remove :  ");
        x=s.nextInt();
        for (int i=0;i<x;i++) {
            A.RemoveElement();
        }










        /*A.AddElement(1);
        A.AddElement(2);
        A.AddElement(3);
        A.AddElement(4);
        A.AddElement(5);
        A.AddElement(6);
        A.AddElement(7);*/
        //A.RemoveElement();
        System.out.println(A.LastInStack());
        System.out.println(A.StackIsEmpty());
        System.out.println(A.StackIsFull());
        System.out.println(A.get_cap());

    }

}
