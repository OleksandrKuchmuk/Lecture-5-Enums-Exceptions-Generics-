package com.company;

import java.util.Arrays;

public class CheckList {
    char tmp;
    char [] checkList = new char[63];


    public char[] checklist() {
        char tmp;
        System.out.println("Cтворення чекліста, для перевірки валідності символів");

        int i = 0;
        for (tmp = 65; tmp <= 90; tmp++) {
            checkList[i] = tmp;
            i++;
        }
        this.CheckListPart1();
        this.checklistPart2();
        return checkList;
    }

    private void CheckListPart1() {
        int i = 52;
        for (tmp = 48; tmp <= 57; tmp++) {
            checkList[i] = tmp;
            i++;
        }
    }


    private void checklistPart2() {
        int i = 26;
        for (tmp = 97; tmp <= 122; tmp++) {
            checkList[i] = tmp;
            i++;
        }
        checkList[62] = 95;
        System.out.println(Arrays.toString(checkList));

    }
}
