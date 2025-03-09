package com.leetcode.tree.easy;

public class RootEqualsSumOfChildren {

    /**
     * 2236. Корень равен сумме потомков
     * Решено
     * Легкий
     * Темы
     * Компании
     * Вам дано rootдвоичное дерево , состоящее ровно из 3узлов: корня, его левого потомка и правого потомка.
     * <p>
     * Возвращает true , если значение корня равно сумме значений двух его дочерних элементов, в falseпротивном случае .
     * <p>
     * <p>
     * <p>
     * Пример 1:
     * <p>
     * <p>
     * Вход: корень = [10,4,6]
     * Выход: истина
     * Пояснение: Значения корня, его левого потомка и его правого потомка равны 10, 4 и 6 соответственно.
     * 10 равно 4 + 6, поэтому мы возвращаем true.
     * Пример 2:
     * <p>
     * <p>
     * Вход: корень = [5,3,1]
     * Выход: ложь
     * Пояснение: Значения корня, его левого потомка и его правого потомка равны 5, 3 и 1 соответственно.
     * 5 не равно 3 + 1, поэтому мы возвращаем false.
     * <p>
     * <p>
     * Ограничения:
     * <p>
     * Дерево состоит только из корня, его левого потомка и правого потомка.
     * -100 <= Node.val <= 100
     */

    public static boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
