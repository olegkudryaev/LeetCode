package com.leetcode.tree.medium;

import java.util.Arrays;

public class MaximumBinaryTree {

    /**
     * 654. Максимальное двоичное дерево
     * Решено
     * Середина
     * Темы
     * Компании
     * Вам дан массив целых чисел numsбез дубликатов. Максимальное двоичное дерево может быть построено рекурсивно с numsиспользованием следующего алгоритма:
     *
     * Создайте корневой узел, значение которого является максимальным значением в nums.
     * Рекурсивно построить левое поддерево по префиксу подмассива слева от максимального значения .
     * Рекурсивно построить правое поддерево по суффиксу подмассива справа от максимального значения.
     * Верните максимальное двоичное дерево, построенное изnums .
     *
     *
     *
     * Пример 1:
     *
     *
     * Ввод: nums = [3,2,1,6,0,5]
     *  Вывод: [6,3,5,null,2,0,null,null,1]
     *  Пояснение: Рекурсивные вызовы следующие:
     * - Наибольшее значение в [3,2,1,6,0,5] равно 6. Левый префикс — [3,2,1], а правый суффикс — [0,5].
     *     - Наибольшее значение в [3,2,1] равно 3. Левый префикс — [], а правый суффикс — [2,1].
     *         - Пустой массив, поэтому дочерних элементов нет.
     *         - Наибольшее значение в [2,1] равно 2. Левый префикс — [], а правый суффикс — [1].
     *             - Пустой массив, поэтому дочерних элементов нет.
     *             - Только один элемент, поэтому дочерний узел — это узел со значением 1.
     *     - Наибольшее значение в [0,5] равно 5. Левый префикс — [0], а правый суффикс — [].
     *         - Только один элемент, поэтому дочерний узел — это узел со значением 0.
     *         - Пустой массив, поэтому дочерних элементов нет.
     * Пример 2:
     *
     *
     * Ввод: nums = [3,2,1]
     *  Вывод: [3,null,2,null,1]
     *
     *
     * Ограничения:
     *
     * 1 <= nums.length <= 1000
     * 0 <= nums[i] <= 1000
     * Все целые числа numsв уникальны .
     */

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode deep = deep(nums);

        return deep;
    }

    private static TreeNode deep(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        int maxInd = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (temp < nums[i]) {
                temp = nums[i];
                maxInd = i;
            }
        }
        TreeNode nude = new TreeNode(nums[maxInd]);
        int[] leftThree = Arrays.copyOfRange(nums, 0, maxInd);
        int[] rightThree = Arrays.copyOfRange(nums, maxInd+1, nums.length);
        nude.left = deep(leftThree);
        nude.right = deep(rightThree);
        return nude;
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

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
