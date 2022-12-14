package array;
import java.util.Scanner;
public class swapping {
    //swapping using temp variable
    static void swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("The values of a and b after swap"+a+" "+b);
    }
    //swapping without temp variable
    static void swap1(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The values of a and b after swap"+a+" "+b);
    }

    //swapping without temp variable

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();

        swap1(a,b);

    }
}

