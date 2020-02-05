package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*

0438 Рисуем линии
Используя цикл for вывести на экран:
— горизонтальную линию из 10 восьмёрок
— вертикальную линию из 10 восьмёрок.
Требования:
1. Программа не должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить горизонтальную линию из 10 восьмёрок.
4. Программа должна выводить вертикальную линию из 10 восьмёрок.
5. В программе должен использоваться цикл for.

*/

public class Main {
    public static void main(String[] args) throws Exception {
        int x = 8;

        for (int i=1;i<11; i++) {
            System.out.print(x);
        }

        for(int j=1; j<11; j++) {
            System.out.println(x);

        }
    }
}


