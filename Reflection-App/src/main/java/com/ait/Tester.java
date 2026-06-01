package com.ait;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Tester {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> clz=Class.forName("com.ait.User");
        Object obj = clz.getDeclaredConstructor().newInstance();
        User u=(User) obj;
        u.printAge();

        Field field = clz.getDeclaredField("age");
        field.setAccessible(true);
        field.set(u,20);
        u.printAge();


    }
}
