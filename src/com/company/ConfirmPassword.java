package com.company;

import java.util.Arrays;

public class ConfirmPassword extends Authentication{
    char[] confirmPassword;

    @Override
    public void input() {
        System.out.print("Confirm your password, must be the same as the password");

        super.input();
        this.confirmPassword = super.arrayMakesFromLine;
        System.out.println(Arrays.toString(confirmPassword));




    }
}
