package com.company;

import java.util.Arrays;

public class Validation {

    //    char tmp;
    char[] password;
    char[] confirmPassword;
    char[] checkList;
    char[] arrayMakesFromLine;

    public Validation(char[] password, char[] confirmPassword, char[] checkList, char[] arrayMakesFromLine) {
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.checkList = checkList;
        this.arrayMakesFromLine = arrayMakesFromLine;
    }

    public Validation(char[] checkList, char[] arrayMakesFromLine) {
        this.checkList = checkList;
        this.arrayMakesFromLine = arrayMakesFromLine;
    }

    //перевірка валідності символів, спроба 1 --вдало
    public void validation() {
        this.validLength();
        System.out.println("Перевірка валідності символів");
        int count = 0;
        for (char j : arrayMakesFromLine) {
            for (char k : checkList) {
                if (j == k) {
                    count++;
                }
            }
        }
        if (count != arrayMakesFromLine.length) {
            System.out.println("You type wrong Characters");
        } else {
            System.out.println("Symbols is ok");
        }
    }

    private void validLength() {
        if (arrayMakesFromLine.length > 20) {
            System.out.println("Ви ввели забагато символів");
        }
    }

    public void validPasswordConfirmation() {
       boolean liquid =  Arrays.equals(password, confirmPassword);
        if(liquid == true){
            System.out.println("Пароль нормальний");
        }else {
            System.out.println("Пароль не співпадає");
        }
    }
}




