package com.company;

import java.util.Arrays;

public class Password extends Authentication{
    char[] password;



    @Override
    public void input() {
        System.out.print("Input your password");
        super.input();
        this.password = super.arrayMakesFromLine;
        System.out.println(Arrays.toString(password));}

        @Override
        public String toString() {
            return "Password{" +
                    "password=" + Arrays.toString(password) +
                    '}';
        }

}
