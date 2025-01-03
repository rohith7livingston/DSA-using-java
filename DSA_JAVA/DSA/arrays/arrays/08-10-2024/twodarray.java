import java.util.*;

public class twodarray {
    public static void main(String args[])
    {
        System.out.print("Enter the row and coloumn ::: ");
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] array = new int[row][col];
        for(int i = 0;i<row;i++)
        {
            for(int j= 0;j<col;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        for(int r = 0;r<row;r++)
        {
            for(int c= 0;c<col;c++)
            {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }

    }
}
