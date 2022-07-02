package com.cyquen.themis.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class NetUtils {

    static final Pattern pattern = Pattern.compile("^((http|https)://)((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$");

    public static boolean isIPLegal(String ipStr) {
        if (ipStr == null || ipStr.isEmpty())
            return false;

        Matcher matcher = pattern.matcher(ipStr);
        return matcher.find();
    }
}
