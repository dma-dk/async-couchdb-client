package com.n1global.acc.util;

import java.util.Arrays;

public class BufUtils {
    public static byte[] concat(byte[] src, byte[] dst) {
        int oldLength = dst.length;

        dst = Arrays.copyOf(dst, dst.length + src.length);

        System.arraycopy(src, 0, dst, oldLength, src.length);

        return dst;
    }
}
