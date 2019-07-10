package com.company;
import java.util.Scanner;



public class Main

{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 строку:");

        String str1 = in.nextLine();
        int len1 = str1.length();

        System.out.println("Введите 2 строку:");
        String str2 = in.nextLine();

        int len2 = str2.length();

        if(len1 > len2)
            System.out.println("Длинее строка:\n" + str1);
        if(len1 < len2)
            System.out.println("Длинее строка:\n" + str2);
        else
            System.out.println("Строки имеют одинаковые длины!");
        in.close();
    }
}