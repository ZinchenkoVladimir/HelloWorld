package main.java;

import java.util.ArrayList;
import java.util.List;

public class Task_8 {

    public static void main (String[] args) {

        int a = 72;
        int b = 101;
        int d = 108;
        int e = 108;
        int f = 111;
        int g = 32;
        int h = 87;
        int j = 111;
        int k = 114;
        int l = 108;
        int m = 100;

        ArrayList<Character> ch = transformIntToChar(a, b, d, e, f, g, h, j, k, l, m);
        printList(ch);
    }

    private static ArrayList<Character>transformIntToChar(int...values){
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i:values) {
            buffer.add(((char)i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character>characters) {
                for (char c:characters) {
                    System.out.print(c);
        }
    }
}
