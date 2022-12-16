package array;
import java.util.Scanner;
public class sortarray {
    static int[] sortzesones(int arr[],int s)
    {
        int count=0,i;
        for(i=0;i<s;i++)
        {
            if(arr[i]==0) {
                count++;
            }

        }
//        System.out.println("count of zeros in array"+count);

        for(i=0;i<count;i++)
        {
            arr[i]=0;
//            System.out.print(arr[i]+" ");
        }



        for(i=count;i<s;i++)
        {
            arr[i]=1;
//            System.out.print(arr[i]+" ");
        }
        return arr;

    }
//    static int[] swap(int i,int j)
//    {
//        int temp;
//        temp=i;
//        i=j;
//        j=temp;
//        return arr;
//    }

    //using two pointers approach
    static void sortzesones1(int arr[],int s)
    {
        int i=0,j=s-1;
        while(i<j)
        {
            int temp;
            if(arr[i]>arr[j])
            {

                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            if(arr[j]==1)
                j--;
            else
                i++;
        }

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
        int ar[]=sortzesones(arr,size);
        System.out.println("After sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
