import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KnapsackTest {

    @Test
    void Recursion_ValuesIsNull_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = null;
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 12;
        int n = 4;
        Assertions.assertEquals(0, knapsack.Recursion(n,c, valeurs, poids));
    }

    @Test
    void Recursion_WeightsIsNull_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = null;
        int c = 12;
        int n = 4;
        Assertions.assertEquals(0, knapsack.Recursion(n,c, valeurs, poids));
    }


    @Test
    void Recursion_CapacityIsZero_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 0;
        int n = 4;
        Assertions.assertEquals(0, knapsack.Recursion(n,c, valeurs, poids));
    }

    @Test
    void Recursion_NbElementsIsZero_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 12;
        int n = 0;
        Assertions.assertEquals(0, knapsack.Recursion(n,c, valeurs, poids));
    }

    @Test
    void Dynamic_ValuesIsNull_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = null;
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 12;
        int n = 4;
        Assertions.assertEquals(0, knapsack.DynamicPrograming(n,c, valeurs, poids));
    }

    @Test
    void Dynamic_WeightsIsNull_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = null;
        int c = 12;
        int n = 4;
        Assertions.assertEquals(0, knapsack.DynamicPrograming(n,c, valeurs, poids));
    }


    @Test
    void Dynamic_CapacityIsZero_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 0;
        int n = 4;
        Assertions.assertEquals(0, knapsack.DynamicPrograming(n,c, valeurs, poids));
    }

    @Test
    void Dynamic_NbElementsIsZero_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 12;
        int n = 0;
        Assertions.assertEquals(0, knapsack.DynamicPrograming(n,c, valeurs, poids));
    }

    @Test
    void Greedy_ValuesIsNull_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = null;
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 12;
        int n = 4;
        Assertions.assertEquals(0, knapsack.GreedyAlgorithm(n,c, valeurs, poids));
    }

    @Test
    void Greedy_WeightsIsNull_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = null;
        int c = 12;
        int n = 4;
        Assertions.assertEquals(0, knapsack.GreedyAlgorithm(n,c, valeurs, poids));
    }


    @Test
    void Greedy_CapacityIsZero_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 0;
        int n = 4;
        Assertions.assertEquals(0, knapsack.GreedyAlgorithm(n,c, valeurs, poids));
    }

    @Test
    void Greedy_NbElementsIsZero_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 12;
        int n = 0;
        Assertions.assertEquals(0, knapsack.GreedyAlgorithm(n,c, valeurs, poids));
    }

    
    @Test
    void Recursion_NormalCase() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 12;
        int n = 4;
        Assertions.assertEquals(9, knapsack.Recursion(n,c, valeurs, poids));
  
    }
    

    @Test
    void Recursion_TheValuesContainOnlyZero_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {0, 0, 0, 0};
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 12;
        int n = 4;
        Assertions.assertEquals(0, knapsack.Recursion(n,c, valeurs, poids));
    }

    @Test
    void Recursion_TheWeightsContainOnlyZero_ReturnsSumOfValues() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = new int[] {0, 0, 0, 0};
        int c = 12;
        int n = 4;
        Assertions.assertEquals(17, knapsack.Recursion(n,c, valeurs, poids));
    }

    @Test
    void Dynamic_NormalCase() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 12;
        int n = 4;
        Assertions.assertEquals(9, knapsack.DynamicPrograming(n,c, valeurs, poids));
  
    }
    

    @Test
    void Dynamic_TheValuesContainOnlyZero_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {0, 0, 0, 0};
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 12;
        int n = 4;
        Assertions.assertEquals(0, knapsack.DynamicPrograming(n,c, valeurs, poids));
    }

    @Test
    void Dynamic_TheWeightsContainOnlyZero_ReturnsSumOfValues() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = new int[] {0, 0, 0, 0};
        int c = 12;
        int n = 4;
        Assertions.assertEquals(17, knapsack.DynamicPrograming(n,c, valeurs, poids));
    }


    @Test
    void Greedy_NormalCase() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 12;
        int n = 4;
        Assertions.assertEquals(9, knapsack.GreedyAlgorithm(n,c, valeurs, poids));
  
    }
    

    @Test
    void Greedy_TheValuesContainOnlyZero_ReturnsZero() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {0, 0, 0, 0};
        int poids[] = new int[] {1, 3, 4, 5};
        int c = 12;
        int n = 4;
        Assertions.assertEquals(0, knapsack.GreedyAlgorithm(n,c, valeurs, poids));
    }

    @Test
    void Greedy_TheWeightsContainOnlyZero_ReturnsSumOfValues() {
        Knapsack knapsack = new Knapsack();
        int valeurs[] = new int[] {1, 4, 5, 7};
        int poids[] = new int[] {0, 0, 0, 0};
        int c = 12;
        int n = 4;
        Assertions.assertEquals(17, knapsack.GreedyAlgorithm(n,c, valeurs, poids));
    }
}