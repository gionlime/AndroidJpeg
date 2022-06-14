package com.yunbo.jpeg;

import android.graphics.Bitmap;

/**
 * create by jeek
 * 2022/6/14
 * des:
 **/

public class JpegUtils {
    static {
        System.loadLibrary("jpeg-utils");
    }

    public static native boolean compressBitmap(Bitmap bitmap, int width, int height, String fileName, int quality);

}
