package main.java;

public class Task_2 {

    public static void main (String[] args) {

        Short shrt;
        Byte bt;
        Integer intgr;
        Long lng;
        Character chr1;
        Character chr2;
        Float flt;
        Double dbl;
        Boolean bln;

        shrt = -32767;
        bt = 0;
        intgr = 2147483646;
        lng = -9223372036854775807L;
        chr1 = 'X';
        chr2 = 121;
        flt = 1.4e-45f;
        dbl = 1.7e+308;
        bln = false;

        System.out.println("Short = "+shrt);
        System.out.println("Byte = "+bt);
        System.out.println("Integer = "+intgr);
        System.out.println("Long = "+lng);
        System.out.println("Character as symbol = "+chr1);
        System.out.println("Character as number = "+chr2);
        System.out.println("Float = "+flt);
        System.out.println("Double = "+dbl);
        System.out.println("Boolean = "+bln);
    }
}
