package array;
import java.util.Scanner;
//find first repeating element
public class findelement {
    static int findele(int arr[])
    {

        for(int i=0;i<arr.length;i++)
        {
            int ele=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(ele==arr[j])
                {
                    return arr[j];
                }
            }
        }
        return -1;


    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(findele(arr));
    }
}
