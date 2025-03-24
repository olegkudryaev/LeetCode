package com.leetcode.binarytree.medium;

public class DeepestLeavesSum {

    /**
     * 1302. Самая глубокая сумма листьев
     * Решено
     * Середина
     * Темы
     * Компании
     * Намекать
     * Для заданного rootдвоичного дерева вернуть сумму значений его самых глубоких листьев .
     *
     *
     * Пример 1:
     *
     *
     * Вход: корень = [1,2,3,4,5,null,6,7,null,null,null,null,8]
     *  Выход: 15
     * Пример 2:
     *
     * Вход: корень = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
     *  Выход: 19
     *
     *
     * Ограничения:
     *
     * Число узлов в дереве находится в диапазоне .[1, 104]
     * 1 <= Node.val <= 100
     */

   static int maxLevel = -1;
   static int res = 0;

    public static int deepestLeavesSum(TreeNode root) {
        deep(root, 0);
        return res;
    }

    private static void deep(TreeNode root, int level) {
        if (root == null) {
            System.out.println(level);
            return;
        }

        if(level > maxLevel){
            res = root.val;
            maxLevel = level;
        } else if(level == maxLevel){
            res += root.val;
        }

        deep(root.left, level + 1);
        deep(root.right, level + 1);

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
