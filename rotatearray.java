package array;
import java.util.Scanner;
public class rotatearray {
    static int[] rotate(int arr[],int k,int n){
        k=k%n;
//        System.out.print("The value of k"+k);

        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<=n-1;i++)
        {
            ans[j++]=arr[i];
        }
        for(int i=0;i<=n-k-1;i++)
        {
            ans[j++]=arr[i];
        }
        return ans;
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
        System.out.println("Enter number of rotations have to be done");
        int k=sc.nextInt();
        int ans[]=rotate(arr,k,size);
        for(int i=0;i<size;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }

}
