package com.ss.android.ugc.bytex.example.consts;


import java.lang.reflect.Field;

public class Constant {
    public static final int number = 10;

    public static void main(String[] args) {
        try {
            Class<?> constantClazz = Class.forName("com.ss.android.ugc.bytex.example.consts.Constant");
            Field numberField = constantClazz.getField("number");
            int number = (int) numberField.get(null);
            System.out.println("number:" + number);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
