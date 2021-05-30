package org.example;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Util {

    public static String reverseString(String str){
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }




}
