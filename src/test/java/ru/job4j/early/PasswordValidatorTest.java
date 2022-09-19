package ru.job4j.early;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PasswordValidatorTest {

    @Test
    void whenValidPassword() {
        String result = PasswordValidator.validate("Pass5$*worD");
        String expected = "Pass5$*worD";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void whenInValidPasswordSpecialChar() {
        String result = PasswordValidator.validate("SOMEWfewfew32");
        String expected = "Должен быть как минимум один символ(не буква и не цифра)";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void whenInValidPasswordLength() {
        String result = PasswordValidator.validate("rrr");
        String expected = "Некорректная длина пароля";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void whenInValidPasswordQwerty() {
        String result = PasswordValidator.validate("123Qwerty&&&");
        String expected = "Нельзя использовать стандартные пароли";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void whenInValidPasswordLower() {
        String result = PasswordValidator.validate("PEWDD&^^*^%8765");
        String expected = "Должна быть как минимум одна прописная буква";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void whenInValidPasswordUpper() {
        String result = PasswordValidator.validate("adagf&^^*^%8765");
        String expected = "Должна быть как минимум одна заглавная буква";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void whenInValidPasswordDigit() {
        String result = PasswordValidator.validate("adagf&^^*^%PPPP");
        String expected = "Должна быть как минимум одна цифра";
        assertThat(expected).isEqualTo(result);
    }

}