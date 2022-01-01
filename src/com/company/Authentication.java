package com.company;

import java.util.Scanner;

public class Authentication {

    Scanner scanner = new Scanner(System.in);
    char[] arrayMakesFromLine;


//    Calculations calculations= new Calculations(arrayMakesFromLine);

    public void input(){
        System.out.print("\n(Must consist of letters 'A-Z', letters 'a-z' and a symbol '_'): ");
        Scanner scanner = new Scanner(System.in);
        String scannedLine = scanner.nextLine();
        this.arrayMakesFromLine = scannedLine.toCharArray();
        }
}
