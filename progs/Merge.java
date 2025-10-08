import java.util.*;
import java.lang.*;
class Merge 
{
    public static void main(String args[])throws Exception
    {
       int n ;
       int i=0;
       int lb,up,mid;
       Scanner s= new Scanner(System.in);
       System.out.println("Enter the size of the array :: ");
       n=s.nextInt();
       int a[]= new int[n];
       System.out.println("Enter the elements of the array :: ");
       for(i=0;i<n;i++)
       a[i]=s.nextInt();
       System.out.println("The elements of the array before sorting are :: ");
       System.out.print(a[i]+" ");
       System.out.println(" The elements of the array after sorting are :: ");
       System.out.print(a[i]+" ");
       lb=0;
       up=n;
       mid=(lb+up)/2;
       MergeSplit  sm = new MergeSplit();
       sm.merge(a,lb,up,mid);
       
    }
}
class MergeSplit
{
    
    int merge(int a[],int lb,int up,int mid)
    {
        if(lb<up)
        {
            mid=(lb+up)/2;
            merge(a,lb,mid+1,up);
            merge(a,mid+1,up);
            merge(a,lb,mid+1,up);
            return 1;
        }
    }
}