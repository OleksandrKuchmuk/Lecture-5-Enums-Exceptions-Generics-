package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ввід з консолі логіна, пароля, повторно пароль
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your login: ");
        String loginLine = scanner.nextLine();
//        System.out.print("Input your password: ");
//        String passwordLine = scanner.nextLine();
//        System.out.print("Confirm your password: ");
//        String confirmPasswordLine = scanner.nextLine();

        //тестовий вивід логіна, пароля, повторно пароль
//        System.out.println("Your login is: " + loginLine);
//        System.out.println("Your Password is: " + passwordLine);
//        System.out.println("Your confirmed Password is: " + confirmPasswordLine);

        // створення масивів під логіна, пароля, повторно пароль
//        Character [] loginArray = new Character[20];
//        Character [] passwordArray = new Character[20];
//        Character [] confirmPasswordArray = new Character[20];

        // переведення стрінги в масив
        char[] tmpLoginArray = loginLine.toCharArray();
//        char[] tmpPasswordArray = passwordLine.toCharArray();
//        char[] tmpConfirmPasswordArray = confirmPasswordLine.toCharArray();

        //перевірка на кількість символів логіна
        if (tmpLoginArray.length > 20) {
            System.out.println("Ви ввели забагато символів");
        }

//                if (tmpLoginArray.length>20){
//            System.out.println("Ви ввели забагато символів");
//        }
//        if (tmpLoginArray.length>20){
//            System.out.println("Ви ввели забагато символів");
//        }

        //тестовий вивід масивів логіна, пароля, повторно пароль
        System.out.println(Arrays.toString(tmpLoginArray));
//        System.out.println(Arrays.toString(tmpPasswordArray));
//        System.out.println(Arrays.toString(tmpConfirmPasswordArray));


        //створення чекліста, для перевірки валідності символів - вдало
        char tmp;
        System.out.println("Cтворення чекліста, для перевірки валідності символів");
        Character[] checkList = new Character[53];

        for (int i = 0; i < checkList.length; i++) {
            checkList[i] = 42;
        }

        int i = 0;
        for (tmp = 65; tmp <= 90; tmp++) {
            checkList[i] = tmp;
            i++;
        }
        i = 26;
        for (tmp = 97; tmp <= 122; tmp++) {
            checkList[i] = tmp;
            i++;
        }
        checkList[52] = 95;
        System.out.println(Arrays.toString(checkList));


        //перевірка валідності символів, спроба 1 --вдало
        System.out.println("Перевірка валідності символів");
        int count = 0;
        for (char j : tmpLoginArray) {

            for (char k : checkList) {
                if (j == k) {
                    count++;
                }
            }

        }
        if (count != tmpLoginArray.length) {
            System.out.println("You type wrong Caracters");
        } else {
            System.out.println("Password is ok");
        }

    }

}







