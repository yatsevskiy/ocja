package ed.scjp.operators.arrays;
public class Sample0006
{
    public static void main(String[] args)
    {
        int N = 4;
        int M = 10;
        int[][] x = new int[N][M];
        int[][] y = new int[N][M];

        fill(N, M, x);

        System.arraycopy(x, 0, y, 1, N - 2);

        show(N, M, y);
    }

    private static void fill(int N, int M, int[][] x)
    {
        int k = 0;

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                x[i][j] = k++;
            }
        }
    }

    private static void show(int N, int M, int[][] y)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
    }
}
