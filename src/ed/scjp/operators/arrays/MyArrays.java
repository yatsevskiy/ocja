package ed.scjp.operators.arrays;

public class MyArrays
{
    public static void main(String[] args)
    {
        // z
        Object[][][] a = new Object[2][][];

        // y
        for (int y = 0; y < a.length; y++)
        {
            a[y] = new Object[4][];
        }

        // x
        for (int x = 0; x < a.length; x++)
        {
            for (int j = 0; j < a[x].length; j++)
            {
                a[x][j] = new Object[8];
            }
        }

        for (int z = 0; z < a.length; z++)
        {
            for (int y = 0; y < a[z].length; y++)
            {
                for (int x = 0; x < a[z][y].length; x++)
                {
                    System.out.print(a[z][y][x] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }

        System.out.println(a);

        for (int z = 0; z < a.length; z++)
            System.out.println(a[z]);

        for (int z = 0; z < a.length; z++)
            for (int y = 0; y < a[z].length; y++)
                System.out.println(a[z][y]);
    }
}
