package com.leetcode.string.medium;

import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyURL {
    /**
     * 535. Кодирование и декодирование TinyURL
     * Середина
     * Темы
     * Компании
     * Примечание: Это сопутствующая задача к задаче «Проектирование системы : проектирование TinyURL» .
     * TinyURL — это сервис сокращения URL-адресов, в котором вы вводите URL-адрес, например, https://leetcode.com/problems/design-tinyurlи он возвращает короткий URL-адрес, например http://tinyurl.com/4e9iAk. Разработайте класс для кодирования URL-адреса и декодирования крошечного URL-адреса.
     * <p>
     * Нет никаких ограничений на то, как должен работать ваш алгоритм кодирования/декодирования. Вам просто нужно убедиться, что URL может быть закодирован в крошечный URL, а крошечный URL может быть декодирован в исходный URL.
     * <p>
     * Реализуйте Solutionкласс:
     * <p>
     * Solution()Инициализирует объект системы.
     * String encode(String longUrl)Возвращает небольшой URL-адрес для указанного longUrl.
     * String decode(String shortUrl)Возвращает исходный длинный URL для данного shortUrl. Гарантируется, что данное shortUrlбыло закодировано тем же объектом.
     * <p>
     * <p>
     * Пример 1:
     * <p>
     * Ввод: url = "https://leetcode.com/problems/design-tinyurl"
     * Вывод: "https://leetcode.com/problems/design-tinyurl"
     * <p>
     * Объяснение:
     * Решение obj = новое Решение();
     * string tiny = obj.encode(url); // возвращает закодированный крошечный URL.
     * string ans = obj.decode(tiny); // возвращает исходный URL после его декодирования.
     * <p>
     * <p>
     * Ограничения:
     * <p>
     * 1 <= url.length <= 104
     * urlгарантированно является действительным URL-адресом.
     */

    static Map<String, String> codeDB = new HashMap<>();
    static Map<String, String> urlDB = new HashMap<>();
    static final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private static String getCode() {
        char[] ch = new char[6];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = chars.charAt((int) (Math.random() * 64));
        }
        return String.valueOf(ch);
    }

    public static String encode(String longUrl) {
        String code = getCode();
        codeDB.put(code, longUrl);
        urlDB.put(longUrl, code);
        return code;
    }

    public static String decode(String shortUrl) {
        return codeDB.get(shortUrl);
    }
}
