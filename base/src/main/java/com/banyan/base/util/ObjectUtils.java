package com.banyan.base.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.io.FileDescriptor;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Object Utils
 * 
 * @author <a href="http://www.trinea.cn" target="_blank">Trinea</a> 2011-10-24
 */
public class ObjectUtils {

    private ObjectUtils() {
        throw new AssertionError();
    }

    /**
     * compare two object
     * 
     * @param actual
     * @param expected
     * @return <ul>
     *         <li>if both are null, return true</li>
     *         <li>return actual.{@link Object#equals(Object)}</li>
     *         </ul>
     */
    public static boolean isEquals(Object actual, Object expected) {
        return actual == expected || (actual == null ? expected == null : actual.equals(expected));
    }

    /**
     * null Object to empty string
     * 
     * <pre>
     * nullStrToEmpty(null) = &quot;&quot;;
     * nullStrToEmpty(&quot;&quot;) = &quot;&quot;;
     * nullStrToEmpty(&quot;aa&quot;) = &quot;aa&quot;;
     * </pre>
     * 
     * @param str
     * @return
     */
    public static String nullStrToEmpty(Object str) {
        return (str == null ? "" : (str instanceof String ? (String)str : str.toString()));
    }

    /**
     * convert long array to Long array
     * 
     * @param source
     * @return
     */
    public static Long[] transformLongArray(long[] source) {
        Long[] destin = new Long[source.length];
        for (int i = 0; i < source.length; i++) {
            destin[i] = source[i];
        }
        return destin;
    }

    /**
     * convert Long array to long array
     * 
     * @param source
     * @return
     */
    public static long[] transformLongArray(Long[] source) {
        long[] destin = new long[source.length];
        for (int i = 0; i < source.length; i++) {
            destin[i] = source[i];
        }
        return destin;
    }

    /**
     * convert int array to Integer array
     * 
     * @param source
     * @return
     */
    public static Integer[] transformIntArray(int[] source) {
        Integer[] destin = new Integer[source.length];
        for (int i = 0; i < source.length; i++) {
            destin[i] = source[i];
        }
        return destin;
    }

    /**
     * convert Integer array to int array
     * 
     * @param source
     * @return
     */
    public static int[] transformIntArray(Integer[] source) {
        int[] destin = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destin[i] = source[i];
        }
        return destin;
    }

    /**
     * compare two object
     * <ul>
     * <strong>About result</strong>
     * <li>if v1 > v2, return 1</li>
     * <li>if v1 = v2, return 0</li>
     * <li>if v1 < v2, return -1</li>
     * </ul>
     * <ul>
     * <strong>About rule</strong>
     * <li>if v1 is null, v2 is null, then return 0</li>
     * <li>if v1 is null, v2 is not null, then return -1</li>
     * <li>if v1 is not null, v2 is null, then return 1</li>
     * <li>return v1.{@link Comparable#compareTo(Object)}</li>
     * </ul>
     * 
     * @param v1
     * @param v2
     * @return
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <V> int compare(V v1, V v2) {
        return v1 == null ? (v2 == null ? 0 : -1) : (v2 == null ? 1 : ((Comparable)v1).compareTo(v2));
    }
    /**
     * 隐藏软键盘
     * @param view    :一般为EditText
     */
    public static void hideKeyboard(View view) {
        InputMethodManager manager = (InputMethodManager)view.getContext()
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        manager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public static Bitmap getBitmapFromUri(Context context, Uri uri) {

        try {
            ParcelFileDescriptor parcelFileDescriptor =
                    context.getContentResolver().openFileDescriptor(uri, "r");
            FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
            Bitmap image = BitmapFactory.decodeFileDescriptor(fileDescriptor);
            parcelFileDescriptor.close();
            return image;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getBigDecimal(double doubleD) {
        DecimalFormat format = new DecimalFormat("0.00");
//        String abc ="100.456";
        String a = format.format(new BigDecimal(doubleD));
        return a;
//        BigDecimal bigDecimal=new BigDecimal(doubleD);
//        double bigDecimalDD = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
//        return bigDecimalDD;
    }
}
