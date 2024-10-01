package com.leetcode.string;

public class DefangingIpAddress {
    /**
     * 1108. Defanging an IP Address
     * Easy
     * Topics
     * Companies
     * Given a valid (IPv4) IP address, return a defanged version of that IP address.
     * <p>
     * A defanged IP address replaces every period "." with "[.]".
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: address = "1.1.1.1"
     * Output: "1[.]1[.]1[.]1"
     * Example 2:
     * <p>
     * Input: address = "255.100.50.0"
     * Output: "255[.]100[.]50[.]0"
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The given address is a valid IPv4 address.
     */
    public static String defangIPaddr(String address) {
//        address.replaceAll("\\.", "[.]");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            result = address.charAt(i) == '.' ?
                    result.append("[.]") :
                    result.append(address.charAt(i));
        }
        return result.toString();

    }
}
