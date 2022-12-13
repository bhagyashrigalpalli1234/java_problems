//second largest element in array
import java.util.Scanner;
public class secondlargest {
    static int findmax(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;

    }

    static int findsecondmax(int arr[])
    {
        int mx=findmax(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==mx)
                arr[i]=Integer.MIN_VALUE;
        }
        int secondmx=findmax(arr);

        return secondmx;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(findsecondmax(arr));


    }
}

