package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException();
        }
        if (password.length() < 8 || password.length() > 32) {
            return "Некорректная длина пароля";
        }
        if (!upperCaseValidator(password)) {
            return "Должна быть как минимум одна заглавная буква";
        }
        if (!lowerCaseValidator(password)) {
            return "Должна быть как минимум одна прописная буква";
        }
        if (!isDigitValidator(password)) {
            return  "Должна быть как минимум одна цифра";
        }
        if (!isSpecialCharValidator(password)) {
            return "Должен быть как минимум один символ(не буква и не цифра)";
        }

        String[] subStr = {"qwerty", "password", "admin", "user", "12345"};
        for (String str : subStr) {
            if (password.toLowerCase().contains(str)) {
                return  "Нельзя использовать стандартные пароли";
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