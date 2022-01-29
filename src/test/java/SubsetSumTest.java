import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubsetSumTest {

    @Test
    void Recursion_SetIsNull_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = null;
        int targetSum = 12;

        Assertions.assertFalse(sub.recursion(set,targetSum, 0));
    }

    @Test
    void Recursion_SetIsEmpty_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {};
        int targetSum = 12;

        Assertions.assertFalse(sub.recursion(set,targetSum,set.length));
    }

    @Test
    void Recursion_TargetSumIs0_ReturnsTrue() {
        SubsetSum sub = new SubsetSum();
        int set[] = {3, 4, 1, 9};
        int targetSum = 0;

        Assertions.assertTrue(sub.recursion(set,targetSum,set.length));
    }

    @Test
    void Recursion_TargetSumIsNegative_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {3, 4, 1, 9};
        int targetSum = -4;

        Assertions.assertFalse(sub.recursion(set,targetSum,set.length));
    }

    @Test
    void Recursion_TargetSumIsNot0AndLengthIs0_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {3, 4, 1, 9};
        int targetSum = 5;
        int length = 0;

        Assertions.assertFalse(sub.recursion(set,targetSum,length));
    }

    @Test
    void Recursion_TheSumIsInTheSet_ReturnsTrue() {
        SubsetSum sub = new SubsetSum();
        int set[] = {3, 4, 1, 9};
        int targetSum = 5;

        Assertions.assertTrue(sub.recursion(set,targetSum,set.length));
    }

    @Test
    void Recursion_TheSumIsNotInTheSet_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {3, 4, 1, 9};
        int targetSum = 6;

        Assertions.assertFalse(sub.recursion(set,targetSum,set.length));
    }

    @Test
    void Recursion_TheSetContainsOnly0_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {0, 0, 0, 0};
        int targetSum = 4;

        Assertions.assertFalse(sub.recursion(set,targetSum,set.length));
    }

    @Test
    void Backtracking_CurrentSumIsBiggerThanTargetSum_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {4, 5, 3, 7};
        int targetSum = 12;

        sub.backtracking(set,0,13,targetSum);

        Assertions.assertFalse(sub.res);
    }

    /*
    The targetSum is in the set (if we took the fist and the last elements) but since the first element is eliminated the result should be false
     */
    @Test
    void Backtracking_CurrentIndexIs1AndTheTargetSumIsNotInTheSubSet_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {4, 5, 3, 7};
        int targetSum = 11;

        sub.backtracking(set,1,13,targetSum);

        Assertions.assertFalse(sub.res);
    }

    @Test
    void Backtracking_SetIsNull_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = null;
        int targetSum = 10;

        sub.backtracking(set,0,0,targetSum);

        Assertions.assertFalse(sub.res);
    }
    
    @Test
    void Backtracking_SetIsEmpty_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {};
        int targetSum = 10;

        sub.backtracking(set,0,0,targetSum);

        Assertions.assertFalse(sub.res);
    }

    @Test
    void Backtracking_TargetSumIs0_ReturnsTrue() {
        SubsetSum sub = new SubsetSum();
        int set[] = {1, 7};
        int targetSum = 0;

        sub.backtracking(set,0,0,targetSum);

        Assertions.assertTrue(sub.res);
    }

    @Test
    void Backtracking_TargetSumIsNegative_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {1, 7};
        int targetSum = -8;

        sub.backtracking(set,0,0,targetSum);

        Assertions.assertFalse(sub.res);
    }

    @Test
    void Dynamic_SetIsNull_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = null;
        int targetSum = 7;

        Assertions.assertFalse(sub.dynamic(set,targetSum,0));
    }

    @Test
    void Dynamic_SetIsEmpty_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {};
        int targetSum = 7;

        Assertions.assertFalse(sub.dynamic(set,targetSum, set.length));
    }

    @Test
    void Dynamic_TargetSumIs0_ReturnsTrue() {
        SubsetSum sub = new SubsetSum();
        int set[] = {2, 8, 13};
        int targetSum = 0;

        Assertions.assertTrue(sub.dynamic(set,targetSum, set.length));
    }


    @Test
    void Dynamic_TargetSumIsNegative_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {2, 8, 13};
        int targetSum = -9;

        Assertions.assertFalse(sub.dynamic(set,targetSum, set.length));
    }


    @Test
    void Dynamic_TheSumIsInTheSet_ReturnsTrue() {
        SubsetSum sub = new SubsetSum();
        int set[] = {2, 8, 5, 1, 3, 10, 13};
        int targetSum = 25;

        Assertions.assertTrue(sub.dynamic(set,targetSum, set.length));
    }

    @Test
    void Dynamic_TheSumIsNotInTheSet_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {2, 0, 3, 21, 11};
        int targetSum = 25;

        Assertions.assertFalse(sub.dynamic(set,targetSum, set.length));
    }

    @Test
    void Dynamic_TheSetContainsZeros_ReturnsFalse() {
        SubsetSum sub = new SubsetSum();
        int set[] = {0, 0, 0, 0};
        int targetSum = 2;

        Assertions.assertFalse(sub.dynamic(set,targetSum, set.length));
    }
}