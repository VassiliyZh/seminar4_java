package ru.gb.lesson4;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1 строку: ");
        String str1 = in.nextLine();
        System.out.print("Введите 2 строку: ");
        String str2 = in.nextLine();
        System.out.print("Введите 3 строку: ");
        String str3 = in.nextLine();
        System.out.print("Введите 4 строку: ");
        String str4 = in.nextLine();
        System.out.print("Введите слово print или revert или exit: ");
        String str5 = in.nextLine();
        if (str5.equals("print")) {
            System.out.print(str4 + " " + str3 + " " + str2 + " " + str1);
        }
        if (str5.equals("revert")) {
            System.out.print(str3 + " " + str2 + " " + str1);
        }
        if (str5.equals("exit")) {
            System.out.print("Конец");
        }
    }
}

