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
        Validation calculateConfirmPassword = new Validation(checkList.checkList, confirmPassword.arrayMakesFromLine);
        calculateConfirmPassword.validation();

        Validation valedeConfirmPassword = new Validation(password.password, confirmPassword.confirmPassword, checkList.checkList, password.arrayMakesFromLine);
        valedeConfirmPassword.validPasswordConfirmation();



//       login.input();








//        System.out.println(login);

//        c


//       password.input();
//

//        confirmPassword.input();



//        calculations.validation();
//        calculations.login.input();




        // ввід з консолі логіна, пароля, повторно пароль

//        char[] arrayMakesFromLine = scannedLine.toCharArray();
//        System.out.println(Arrays.toString(arrayMakesFromLine));
//        Login login = new Login(arrayMakesFromLine);
//        Calculations calculations= new Calculations(arrayMakesFromLine);







//        System.out.print("Input your password: ");
//        String passwordLine = scanner.nextLine();
//        System.out.print("Confirm your password: ");
//        String confirmPasswordLine = scanner.nextLine();
//        char[] arrayMakesFromLine = scannedLine.toCharArray();

//        Authentication tmpArray = new Authentication(scannedArray)

        //тестовий вивід логіна, пароля, повторно пароль
//        System.out.println("Your login is: " + loginLine);
//        System.out.println("Your Password is: " + passwordLine);
//        System.out.println("Your confirmed Password is: " + confirmPasswordLine);

        // створення масивів під логіна, пароля, повторно пароль
//        Character [] loginArray = new Character[20];
//        Character [] passwordArray = new Character[20];
//        Character [] confirmPasswordArray = new Character[20];

        // переведення стрінги в масив
//        char[] tmpLoginArray = loginLine.toCharArray();
//        char[] tmpPasswordArray = passwordLine.toCharArray();
//        char[] tmpConfirmPasswordArray = confirmPasswordLine.toCharArray();

        //перевірка на кількість символів логіна


        //тестовий вивід масивів логіна, пароля, повторно пароль
//        System.out.println(Arrays.toString(arrayMakesFromLine));
//        System.out.println(Arrays.toString(tmpPasswordArray));
//        System.out.println(Arrays.toString(tmpConfirmPasswordArray));




    }

}







