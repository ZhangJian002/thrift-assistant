package com.intellij.plugins.thrift.util;

import java.util.Objects;

public class BooleanUtils {

    public static boolean toBoolean(String str) {
        if (Objects.equals(str, "true")) {
            return true;
        } else if (str == null) {
            return false;
        } else {
            switch (str.length()) {
                case 2:
                    char ch0 = str.charAt(0);
                    char ch1 = str.charAt(1);
                    return (ch0 == 'o' || ch0 == 'O') && (ch1 == 'n' || ch1 == 'N');
                case 3:
                    char ch = str.charAt(0);
                    if (ch == 'y') {
                        return (str.charAt(1) == 'e' || str.charAt(1) == 'E') && (str.charAt(2) == 's' || str.charAt(2) == 'S');
                    } else {
                        if (ch != 'Y') {
                            return false;
                        }

                        return (str.charAt(1) == 'E' || str.charAt(1) == 'e') && (str.charAt(2) == 'S' || str.charAt(2) == 's');
                    }
                case 4:
                    char ch2 = str.charAt(0);
                    if (ch2 == 't') {
                        return (str.charAt(1) == 'r' || str.charAt(1) == 'R') && (str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E');
                    } else if (ch2 == 'T') {
                        return (str.charAt(1) == 'R' || str.charAt(1) == 'r') && (str.charAt(2) == 'U' || str.charAt(2) == 'u') && (str.charAt(3) == 'E' || str.charAt(3) == 'e');
                    }
                default:
                    return false;
            }
        }
    }
}
