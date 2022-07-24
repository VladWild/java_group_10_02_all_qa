package qa.primitive;

import java.util.ArrayList;

public class PrimitiveStarter {

    public static void main(String[] args) {
        int i = 5; //хранится в stack

        //хранятся в heap
        Integer i2 = new Integer(5);
        Integer i3 = 5;

        //эквивалентно
        Integer i4 = 5;
        Integer i5 = Integer.valueOf(5);

        //эквивалентно
        int i6 = i5;
        int i7 = i5.intValue();

        //ограничения примитивов
        //1) надо быть аккуратнее с null
        //int anInt = getInt();
        Integer anInt = getInt();
        System.out.println(anInt);

        //2) приметив нельзя использовать как дженерик
        //ArrayList<int> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        //Зачем все-таки нужны примитивы?
        long start = System.currentTimeMillis();
        int i10 = 2;
        int i11 = 2;
        int i12;
        for (long j = 0; j < 1_000_000_000l; j++) {
            i12 = i10 * ((++i11) + 1);
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        Integer i20 = 2;
        Integer i21 = 2;
        Integer i22;
        for (long j = 0; j < 1_000_000_000l; j++) {
            i22 = i20 * ((++i21) + 1);
        }
        System.out.println(System.currentTimeMillis() - start);

        //каждый раз создается новый Integer
        Integer i30 = 7;
        i30++;
        i30 =+ 9;
        i30 = i20 - i;

        //массив - это объект
        int[] ints = new int[]{2, 3};
        int length = ints.length;
        System.out.println(length);
        int[] clone = ints.clone();
        System.out.println(clone.length);
    }

    private static Integer getInt() {
        //some logic
        return null;
    }
}
