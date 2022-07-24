package ru.yandex.qa.primitive;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveStarter {

    public static void main(String[] args) {
        int i = 5;

        Integer i2 = 5;
        Integer i3 = new Integer(5);
        Integer i4 = Integer.valueOf(5);

        i = i4;
        i = i4.intValue();

        //ограничения примитивов
        //1) надо быть аккуратнее с null
        //i = getInteger();

        //2) примитивы нельзя исп как дженерики
        List<Integer> list = new ArrayList<>();
        //List<int> list2 = new ArrayList<>();

        //Зачем все-таки нужны примитивы?
        long start = System.currentTimeMillis();
        int i10 = 2;
        int i11 = 2;
        int i12;
        for (long j = 0; j < 1_000_000_000l; j++) {
            i12 = i10 + ((++i11) + 1);
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        Integer i20 = 2;
        Integer i21 = 2;
        Integer i22;
        for (long j = 0; j < 1_000_000_000l; j++) {
            i22 = i20 + ((++i21) + 1);
        }
        System.out.println(System.currentTimeMillis() - start);

        Integer integer = ++i21;
        i21 =+ 2;

        //---------------------------------------

        int[] ints = new int[]{2, 3};
        int length = ints.length;
        ints.clone();
    }

    private static Integer getInteger() {
        //something logic
        return null;
    }
}
