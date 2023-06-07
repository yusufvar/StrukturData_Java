package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.*;
import com.dicoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        char[] dicoding = {'m','i','c','h','a','t'};
        String dicodingString = new String(dicoding);
        int panjang = dicoding.length;

        String michat = "dicoding";
        char result = michat.charAt(5);

        System.out.println(dicoding);
        System.out.println(panjang);
        System.out.println(result);


        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);


        }
        Gitar.bunyi();
        kereta.roda();
        mobil.roda();
        motor.roda();

        Date today = new Date();
        System.out.println("Hari ini = "+today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = "+tomorrow);
    }
}