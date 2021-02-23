package dop;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите логин: ");
        String login = in.next();

        System.out.println("Введите пароль: ");
        String password = in.next();

        Pattern pattern = Pattern.compile("[a-zA-Z]{6,10}");
        Matcher matcher = pattern.matcher(login);
        Pattern pattern1 = Pattern.compile("\\w{6,10}");
        Matcher matcher1 = pattern1.matcher(password);

        boolean result = matcher.matches();
        boolean result2 = matcher1.matches();

        System.out.println("Логин: " + result + " Пароль: " + result2);

    }

}
