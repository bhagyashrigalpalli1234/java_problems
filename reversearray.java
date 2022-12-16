package array;
import java.util.Scanner;
public class reversearray {
    //with using new array
    static int[] revarr(int arr[],int s)
    {
        int j=0;
        int i;
        int ans[]=new int[s];
        for(i=s-1;i>=0;i--)
        {
            ans[j++]=arr[i];
        }
        return ans;


    }
    static void swap(int i,int j)
    {
        i=i+j;
        j=i-j;
        i=i-j;
    }
    //without using new array
    static void revarr1(int arr[],int s)
    {
        int j=s-1;
        int i=0;
        while(i<=j)
        {
            swap(i++,j++);
        }
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter size of array");
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans[]=revarr(arr,size);
        for(int i=0;i<size;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }

}

