public class CyclicSort
{
    public static void main(String args[])
    {
        int[] arr ={1,4,6,2,3,7};
        sort(arr);
        System.out.println(arr);
    }
    public static void sort(int[] arr)
    {
        int i= 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;//index = value -1
            if(arr[i] == arr[correct])
            {
                swap(arr , i , correct);
            }
            else
            {
                i++;
            }
        }
       return;
    }
    public static void swap(int[] arr ,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return;
    }
}