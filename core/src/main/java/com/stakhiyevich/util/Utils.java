package com.stakhiyevich.util;

import java.util.Arrays;

public class Utils {
    public boolean isAllPositiveNumbers(String... str) {
        StringUtils stringUtils = new StringUtils();
        return Arrays.stream(str).allMatch(stringUtils::isPositiveNumber);
    }
}
