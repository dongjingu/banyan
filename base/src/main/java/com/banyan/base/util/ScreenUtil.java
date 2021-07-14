package com.banyan.base.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/**
 * ScreenUtil
 * <ul>
 * <strong>Convert between dp and sp</strong>
 * </ul>
 * 
 * @author <a href="http://www.trinea.cn" target="_blank">Trinea</a> 2014-2-14
 */
public class ScreenUtil {

    private ScreenUtil() {
        throw new AssertionError();
    }

    public static float dpToPx(Context context, float dp) {
        if (context == null) {
            return -1;
        }
        return dp * context.getResources().getDisplayMetrics().density;
    }

    public static float pxToDp(Context context, float px) {
        if (context == null) {
            return -1;
        }
        return px / context.getResources().getDisplayMetrics().density;
    }

    public static int dpToPxInt(Context context, float dp) {
        return (int)(dpToPx(context, dp) + 0.5f);
    }

    public static int pxToDpCeilInt(Context context, float px) {
        return (int)(pxToDp(context, px) + 0.5f);
    }

    public static int getPixels(int Unit, float size) {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return (int) TypedValue.applyDimension(Unit, size, metrics);
    }
}
