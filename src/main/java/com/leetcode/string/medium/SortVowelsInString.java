package com.leetcode.string.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortVowelsInString {
    /**
     * 2785. Сортировка гласных в строке
     * Середина
     * Темы
     * Компании
     * Намекать
     * Дана строка с индексом 0s , выполните перестановку s , чтобы получить новую строку, tтакую, что:
     * <p>
     * Все согласные остаются на своих исходных местах. Более формально, если есть индекс iс 0 <= i < s.lengthтаким, что s[i]является согласной, то t[i] = s[i].
     * Гласные должны быть отсортированы в неубывающем порядке их значений ASCII . Более формально, для пар индексов i, jс 0 <= i < j < s.lengthтакими, что s[i]и s[j]являются гласными, то t[i]не должно иметь более высокое значение ASCII, чем t[j].
     * Верните полученную строку .
     * <p>
     * Гласные — это 'a', 'e', 'i', 'o', и 'u', и они могут быть как строчными, так и заглавными. Согласные включают все буквы, которые не являются гласными.
     * <p>
     * <p>
     * <p>
     * Пример 1:
     * <p>
     * Ввод: s = "lEetcOde"
     * Вывод: "lEOtcede"
     * Пояснение: 'E', 'O' и 'e' — гласные в s; 'l', 't', 'c' и 'd' — все согласные. Гласные сортируются в соответствии с их значениями ASCII, а согласные остаются на тех же местах.
     * Пример 2:
     * <p>
     * Ввод: s = "lYmpH"
     * Вывод: "lYmpH"
     * Пояснение: В строке s нет гласных (все символы в строке s — согласные), поэтому мы возвращаем "lYmpH".
     * <p>
     * <p>
     * Ограничения:
     * <p>
     * 1 <= s.length <= 105
     * sсостоит только из букв английского алфавита в верхнем и нижнем регистре .
     */

    public static String sortVowels(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> allVowels = findAllVowels(s);
        char[] charArray = s.toCharArray();
        String result = changeVowels(charArray, allVowels);
        return result;
    }

    private static String changeVowels(char[] charArray, List<Character> allVowels) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u'
                    || charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' || charArray[i] == 'U') {
                charArray[i] = allVowels.get(count);
                stringBuilder.append(charArray[i]);
                count++;
                continue;
            }
            stringBuilder.append(charArray[i]);
        }
        return stringBuilder.toString();
    }

    private static List<Character> findAllVowels(String s) {
        char[] charArray = s.toCharArray();
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u'
                    || charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' || charArray[i] == 'U') {
                result.add(charArray[i]);
            }
        }
        result = result.stream().sorted().toList();
        return result;
    }
}
