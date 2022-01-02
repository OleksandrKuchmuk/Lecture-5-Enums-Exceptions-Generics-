package com.company;

public class Main {

    public static void main(String[] args) {

       CheckList checkList = new CheckList();
        checkList.checklist();

        Login login = new Login();
        login.input();
        Validation calculateLogin = new Validation(checkList.checkList, login.arrayMakesFromLine);
        calculateLogin.validation();

        Password password = new Password();
        password.input();
        Validation calculatePassword = new Validation(checkList.checkList, password.arrayMakesFromLine);
        calculatePassword.validation();

        ConfirmPassword confirmPassword = new ConfirmPassword();
        confirmPassword.input();
        Validation validConfirmPassword = new Validation(password.password, confirmPassword.confirmPassword);
        validConfirmPassword.validPasswordConfirmation();




    }

}







