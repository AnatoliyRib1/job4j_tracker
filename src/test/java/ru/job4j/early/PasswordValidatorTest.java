package ru.job4j.early;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;

class PasswordValidatorTest {

    @Test
    void whenValidPassword() {
        String result = PasswordValidator.validate("Pass5$*worD");
        String expected = "Pass5$*worD";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void whenInValidPasswordSpecialChar() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("SOMEWfewfew32");
                });
        assertThat(exception.getMessage()).isEqualTo("Должен быть как минимум один символ(не буква и не цифра)");
    }

    @Test
    void whenInValidPasswordLength() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("rrr");
                });
        assertThat(exception.getMessage()).isEqualTo("Некорректная длина пароля");
    }

    @Test
    void whenInValidPasswordQwerty() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("123Qwerty&&&");
                });
        assertThat(exception.getMessage()).isEqualTo("Нельзя использовать стандартные пароли");
    }

    @Test
    void whenInValidPasswordLower() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("PEWDD&^^*^%8765");
                });
        assertThat(exception.getMessage()).isEqualTo("Должна быть как минимум одна прописная буква");
    }

    @Test
    void whenInValidPasswordUpper() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("adagf&^^*^%8765");
                });
        assertThat(exception.getMessage()).isEqualTo("Должна быть как минимум одна заглавная буква");
    }

    @Test
    void whenInValidPasswordDigit() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("adagf&^^*^%PPPP");
                });
        assertThat(exception.getMessage()).isEqualTo("Должна быть как минимум одна цифра");
    }

    @Test
    void whenInValidPasswordNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate(null);
                });
        assertThat(exception.getMessage()).isEqualTo("Введите пароль");
    }
}