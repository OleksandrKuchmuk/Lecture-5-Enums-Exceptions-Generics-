package com.company;

import java.util.Arrays;

public class Login extends Authentication {
    char[] login;

    @Override
    public void input() {
        System.out.print("Input your login");
//        System.out.print("\n(Must consist of letters 'A-Z', letters 'a-z' and a symbol '_'): ");
        super.input();
        this.login = super.arrayMakesFromLine;
        System.out.println(Arrays.toString(login));
    }

    @Override
    public String toString() {
        return "Login{" +
                "login=" + Arrays.toString(login) +
                '}';
    }
}
