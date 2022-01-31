public class SubsetSum {
    Boolean res = false;

    /**
     * recursion  : Cette méthode représente un résolution "naive" du problème en utilisant la récursion
     *
     * @param set l'ensemble des entiers
     * @param target_sum  la somme recherchée
     * @param length la longueur du l'ensemble
     * @return vrai / faux selon que le sous-ensemble de somme target_sum existe ou pas
     */

    public Boolean recursion (int set [], int target_sum, int length ) {
        if (target_sum == 0) return true;
        else if (length == 0) return false;
        else return recursion(set, target_sum - set[length-1], length - 1)
                    || recursion(set, target_sum , length - 1);
    }

    /**
     * backtracking  : Résolution du problème à l'aide du backtracking
     *
     * @param set l'ensemble des entiers
     * @param current_index  l'indice de l'élément traitée dans l'itération courante
     * @param sum la somme courante du sous-ensemble
     * @param target_sum  la somme recherchée
     * @return vrai / faux selon que le sous-ensemble de somme target_sum existe ou pas
     */

    public void backtracking (int set[], int current_index, int sum, int target_sum) {

        if (set == null || sum > target_sum) {
            return;
        }

        if (sum == target_sum) {
            res = true;
            return;
        }
        else {
            for (int i = current_index ; i < set.length; i++) {
                backtracking(set, i + 1, sum + set[i], target_sum);
            }
        }
    }

    /**
     * dynamic  : Résolution du problème à l'aide du dynamic programming
     *
     * @param set l'ensemble des entiers
     * @param target_sum  la somme recherchée
     * @param length la longueur du l'ensemble
     * @return vrai / faux selon que le sous-ensemble de somme target_sum existe ou pas
     */

    public Boolean dynamic (int set [], int target_sum, int length ) {

        if (target_sum < 0)
        {
            return false;
        }

        boolean tab[][] = new boolean[target_sum + 1][length + 1];

        for (int i = 0; i < length + 1; i++) {
            tab[0][i] = true;
        }
        for (int i = 1; i < target_sum + 1; i++) {
            tab[i][0] = false;
        }

        for (int i = 1; i < target_sum + 1; i++) {
            for (int j = 1; j < length + 1; j++) {
                tab[i][j] = tab[i][j - 1];
                if (i >= set[j - 1])
                    tab[i][j] = tab[i][j] || tab[i - set[j - 1]][j - 1];
            }
        }
        return tab[target_sum][length];
    }
}
