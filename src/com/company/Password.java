package com.company;

import java.util.Arrays;

public class Password extends Authentication{
    char[] password;




    public void input() {
        System.out.print("Input your password");
        super.input();
        this.password = super.arrayMakesFromLine;
        System.out.println(Arrays.toString(password));}


        public String toString() {
            return "Password{" +
                    "password=" + Arrays.toString(password) +
                    '}';
        }

}
