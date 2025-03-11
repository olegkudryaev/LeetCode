package com.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        /**
         * 1. Получить подмассивы по диапозонам
         * 2. Проверить диапазоны на принадлежность к арифмитической последовательности
         * 3. Выдать результат
         */

        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int[] subArray = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(subArray);
            int temp = 0;
            int temp2 = 0;
            for (int j = 1; j < subArray.length; j++) {
                if (j == 1) {
                    temp = subArray[0] - subArray[1];
                }
                temp2 = subArray[j - 1] - subArray[j];
                if(temp != temp2){
                    break;
                }
            }
            if (temp == temp2) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
