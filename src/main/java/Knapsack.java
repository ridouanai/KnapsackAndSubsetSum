public class Knapsack {

    /**
     * This method is based on recursion approach, which mean we calculate the total value and weight for all possible subsets
     * @param n         The number of items
     * @param W         The capacity of the knapsack
     * @param value     The value of each item
     * @param weight    The weight of each item
     * @return          Return the exact maximum value that can be carried by the knapsack
     */
    public static int Recursion(int n, int W, int value[], int weight[])
    {
        if(n == 0 || W ==  0)
            return 0;

        if(weight[n - 1] > W)
            return Recursion(n - 1, W, value, weight);

        int included = value[n - 1] + Recursion(n - 1, W - weight[n - 1], value, weight);
        int excluded = Recursion(n - 1, W, value, weight);

        return (included > excluded) ? included: excluded ;
    }


    /**
     * This method is based on dynamic programming; We are going to use a temporary 2D array to avoid evaluating the subproblems again
     * @param n         The number of items
     * @param W         The capacity of the knapsack
     * @param value     The value of each item
     * @param weight    The weight of each item
     * @return          Return the exact maximum value that can be carried by the knapsack
     */
    public static int DynamicPrograming(int n, int W, int value[], int weight[])
    {
        if (n <= 0 || W <= 0) {
            return 0;
        }

        int[][] m = new int[n + 1][W + 1];

        for (int j = 0; j <= W; j++) {
            m[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (weight[i - 1] > j) {
                    m[i][j] = m[i - 1][j];
                } else {
                    m[i][j] = Math.max(
                            m[i - 1][j],
                            m[i - 1][j - weight[i - 1]] + value[i - 1]);
                }
            }
        }

        return m[n][W];
    }

    /** This method is based on Greedy approach; We start by the items with the highest values until the capacity of the knapsack is reached
     * @param n     The number of items
     * @param W         The capacity of the knapsack
     * @param value     The value of each item
     * @param weight    The weight of each item
     * @return          Return the maximum local value that can be carried by the knapsack
     */
    public static int GreedyAlgorithm(int n, int W, int value[], int weight[])
    {
        int current_p = 0;
        int current_v = 0;

        for(int i = 0; i < n ; i++)
        {
            if(weight[i] + current_p <= W)
            {
                current_p += weight[i];
                current_v += value[i];
            }
        }

        return current_v;
    }

    public static void main(String args[])
    {
        /*
        // la valeur de chaque element
        int valeur[] = new int[] {1, 4, 5, 7};

        //le poids de chaque element
        int poids[] = new int[] {1, 3, 4, 5};

        int P = 7;
        int n = valeur.length;


        System.out.println("La solution optimale est: " + Recursion(n, P, valeur, poids));
        System.out.println("La solution optimale est: " + DynamicPrograming(n, P, valeur, poids));
        */

        // la valeur de chaque element
        int valeur[] = new int[] {7, 5, 4, 1};

        //le poids de chaque element
        int poids[] = new int[] {5, 4, 3, 1};

        int P = 7;
        int n = valeur.length;

        System.out.println("La solution optimale est: " + GreedyAlgorithm(n, P, valeur, poids));

    }

}
