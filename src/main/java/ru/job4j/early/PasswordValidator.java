package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Введите пароль");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Некорректная длина пароля");
        }
        if (!upperCaseValidator(password)) {
            throw new IllegalArgumentException("Должна быть как минимум одна заглавная буква");
        }
        if (!lowerCaseValidator(password)) {
            throw new IllegalArgumentException("Должна быть как минимум одна прописная буква");
        }
        if (!isDigitValidator(password)) {
            throw new IllegalArgumentException("Должна быть как минимум одна цифра");
        }
        if (!isSpecialCharValidator(password)) {
            throw new IllegalArgumentException("Должен быть как минимум один символ(не буква и не цифра)");
        }

        String[] subStr = {"qwerty", "password", "admin", "user", "12345"};
        for (String str : subStr) {
            if (password.toLowerCase().contains(str)) {
                throw new IllegalArgumentException("Нельзя использовать стандартные пароли");
            }
        }
        return password;
    }

    private static boolean upperCaseValidator(String password) {
        char[] array = password.toCharArray();
        for (char x : array) {
            if (Character.isUpperCase(x)) {
                return true;
            }

        }
        return false;
    }

    private static boolean lowerCaseValidator(String password) {
        char[] array = password.toCharArray();
        for (char x : array) {
            if (Character.isLowerCase(x)) {
                return true;
            }

        }
        return false;
    }

    private static boolean isDigitValidator(String password) {
        char[] array = password.toCharArray();
        for (char x : array) {
            if (Character.isDigit(x)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSpecialCharValidator(String password) {
        char[] array = password.toCharArray();
        for (char x : array) {
            if (!Character.isLetterOrDigit(x)) {
                return true;
            }
        }
        return false;
    }
}