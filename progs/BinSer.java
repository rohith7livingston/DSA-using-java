// import java.util.*;
// import java.io.*;
// import java.lang.*;
// class searching{
//    void  search(int low,int high,int n,int key,int a[])
//    {
//         int mid;
//         while(low<=high)
//         {
//             mid=(low+high)/2;
//             if(a[mid]==key)
//             {
//                 System.out.println("Element found at"+mid);
//             }
//             else if(a[mid]<key)
//             {
//                 low=mid+1;
//             }
//             else
//             {
//                 high=mid-1;
//             }
//         }
//    }
// }
// class BinarySearch
// {
//     public static void main(String args[])
//     {
        
//         Scanner s = new Scanner(System.in);
//         int n,low,high,mid,key,i=0,pos=0;
//         n=s.nextInt();
//         int a[]=new int[n];
//         for(i=0;i<n;i++)
//         {
//             a[i]=s.nextInt();
//         }
//         System.out.println("the elements are");
//         for(i=0;i<n;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//         System.out.println("Enter tyhe key elemnt you sre searching for");
//         key=s.nextInt();
//         low=0;
//         high=n-1;
//         searching h = new searching();
//         h.search(low,high,key,n,a);

//     }
// }
import java.util.*;
import java.lang.*;
class Searching
{
    void searching(int low,int high,int key,int n,int a[])
    {
        int mid;
        while(low<=high)
        {
            mid=low+high/2;
            if(a[mid]==key)
            {
                System.out.println("Element is found at"+mid);
            }
            if(a[mid]<key)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
}
class BinSer
{
    public static void main(String args[])
    {
        int n,low,high,key;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        int a[]= new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("enter the element you are searching");
        key=s.nextInt();
        low=a[0];
        high=a[n-1];
        Searching se = new Searching();
        se.searching(low,high,key,n,a);

    }
}